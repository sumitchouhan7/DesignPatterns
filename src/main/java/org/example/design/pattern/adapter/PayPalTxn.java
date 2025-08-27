package org.example.design.pattern.adapter;

public class PayPalTxn {

    public void makePayment(){
        System.out.println("payment for PayPal");
    }

    public void getStatus(){
        System.out.println("payment  status for PayPal");
    }
}
