package edu.iu.c322.group10.itemservice.model;

@Entity
public class Comment {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int itemId;
    private String customerName;
    private String body;

}
