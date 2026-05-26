package com.exemplo.pedidos.payment;

public class BoletoPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Boleto gerado no valor de R$ " + amount;
    }
}
