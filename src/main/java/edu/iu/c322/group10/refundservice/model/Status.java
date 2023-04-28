package edu.iu.c322.group10.refundservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public interface Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id = 0;

    String sendMessage();

}
