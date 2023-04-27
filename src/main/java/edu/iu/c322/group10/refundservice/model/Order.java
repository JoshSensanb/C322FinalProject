package edu.iu.c322.group10.refundservice.model;

import java.util.List;

public record Order (int orderId, int customerId, List<Item> items){}


