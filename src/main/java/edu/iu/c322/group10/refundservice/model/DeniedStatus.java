package edu.iu.c322.group10.refundservice.model;

public class DeniedStatus implements Status{

    Refund refund;

    public DeniedStatus(Refund refund){
        this.refund = refund;
    }

    public String sendMessage(){
        return "Refund request denied";
    }
}
