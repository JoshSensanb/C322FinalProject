package edu.iu.c322.group10.refundservice.model;

import java.util.Random;

public class RequestedStatus implements Status{

    Refund refund;

    public RequestedStatus(Refund refund){
        this.refund = refund;
    }

    public String sendMessage(){
        // in Real life this would be done base off of the date of the order This will be done by random

        return "Refund requested";
    }
}
