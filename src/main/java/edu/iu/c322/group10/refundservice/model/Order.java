package edu.iu.c322.group10.refundservice.model;

import java.util.Date;
import java.util.List;

public record Order (int orderId, int customerId, Date orderPlaced, List<Item> items){}


