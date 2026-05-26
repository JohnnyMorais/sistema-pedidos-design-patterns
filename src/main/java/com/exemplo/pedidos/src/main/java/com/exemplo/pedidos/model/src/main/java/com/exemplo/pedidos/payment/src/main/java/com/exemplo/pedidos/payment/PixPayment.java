package com.exemplo.pedidos.payment;

public class PixPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Pagamento via PIX aprovado: R$ " + amount;
    }
}
