package com.exemplo.pedidos.model;

public class Pedido {

    private String metodoPagamento;
    private double valor;

    public Pedido() {}

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
