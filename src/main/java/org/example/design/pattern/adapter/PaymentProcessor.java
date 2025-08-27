package org.example.design.pattern.adapter;

public class PaymentProcessor {

    PaymentProvider paymentProvider;

    public PaymentProcessor(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void processPayment() {
        paymentProvider.doPayment();
    }

    public void status() {
        paymentProvider.checkStatus();
    }
}
