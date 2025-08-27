package org.example.design.pattern.adapter;

public class SBITxnAdapter implements PaymentProvider {

    private SBITxn sbiTxn;

    public SBITxnAdapter(SBITxn sbiTxn) {
        this.sbiTxn = sbiTxn;
    }

    @Override
    public void doPayment() {
        sbiTxn.createPayment();
    }

    @Override
    public void checkStatus() {
        sbiTxn.currentStatus();
    }
}
