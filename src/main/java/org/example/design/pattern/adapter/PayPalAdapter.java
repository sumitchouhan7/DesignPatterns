package org.example.design.pattern.adapter;

public class PayPalAdapter implements PaymentProvider {

    private PayPalTxn payPalTxn;

    public PayPalAdapter(PayPalTxn payPalTxn){
        this.payPalTxn = payPalTxn;
    }

    @Override
    public void doPayment() {
        payPalTxn.makePayment();
    }

    @Override
    public void checkStatus() {
        payPalTxn.getStatus();
    }
}
