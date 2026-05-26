package com.exemplo.pedidos.payment;

public class CartaoPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Pagamento no cartão aprovado: R$ " + amount;
    }
}
