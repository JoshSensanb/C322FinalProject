package edu.iu.c322.group10.refundservice.model;

public class ApprovedStatus implements Status{

    Refund refund;

    public ApprovedStatus(Refund refund){
        this.refund = refund;
    }

    public String sendMessage(){
        return "Refund request approved";
    }
}
