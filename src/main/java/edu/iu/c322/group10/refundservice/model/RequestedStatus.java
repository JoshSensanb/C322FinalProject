package edu.iu.c322.group10.refundservice.model;

public class RequestedStatus implements Status{

    Refund refund;

    public RequestedStatus(Refund refund){
        this.refund = refund;
    }

    public String sendMessage(){
        if(){
            refund.setStatus(new DeniedStatus(refund));
        } else {
           refund.setStatus(new ApprovedStatus(refund));
        }
        return "Refund requested";
    }
}
