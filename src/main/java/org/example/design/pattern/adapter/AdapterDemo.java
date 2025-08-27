package org.example.design.pattern.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        PaymentProvider sbiPaymentProvider = new SBITxnAdapter(new SBITxn());

        sbiPaymentProvider.doPayment();
        sbiPaymentProvider.checkStatus();

        PaymentProvider paypalPaymentProvider = new PayPalAdapter(new PayPalTxn());

        paypalPaymentProvider.doPayment();
        paypalPaymentProvider.checkStatus();

    }
}
