package com.exemplo.pedidos.payment;

public class PaymentFactory {

    public static PaymentStrategy getPayment(String type) {

        return switch (type.toLowerCase()) {
            case "pix" -> new PixPayment();
            case "cartao" -> new CartaoPayment();
            case "boleto" -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Método de pagamento inválido");
        };
    }
}
