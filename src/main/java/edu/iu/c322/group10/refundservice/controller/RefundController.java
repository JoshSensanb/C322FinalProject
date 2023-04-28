package edu.iu.c322.group10.refundservice.controller;

import edu.iu.c322.group10.refundservice.model.Order;
import edu.iu.c322.group10.refundservice.model.Refund;
import edu.iu.c322.group10.refundservice.repository.RefundRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/refund")
public class RefundController {

    RefundRepository refundRepository;
    private final WebClient orderService;

    public RefundController(RefundRepository refundRepository, WebClient.Builder webClientBuilder){
        this.refundRepository = refundRepository;
        orderService = webClientBuilder.baseUrl("http://localhost:8083").build();
    }

    @GetMapping
    public Refund findByOrderId(@PathVariable int orderId){
        Order order = orderService.get().uri("/orders/order/{orderId}", orderId)
                .retrieve().bodyToMono(Order.class).block();
        Refund refund = new Refund();
        refund.setCustomerId(order.customerId());
        return refund;
    }



    @GetMapping("/status/{id}")
    public String getRefundStatus(@PathVariable int refundID){
        Optional<Refund> optionalRefund= refundRepository.findById(refundID);
        Refund refund = optionalRefund.get();
        return refund.getStatus().sendMessage();

    }

}
