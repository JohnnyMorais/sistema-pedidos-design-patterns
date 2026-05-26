package com.exemplo.pedidos.service;

import com.exemplo.pedidos.model.Pedido;
import com.exemplo.pedidos.payment.PaymentFactory;
import com.exemplo.pedidos.payment.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Override
    public String processar(Pedido pedido) {

        PaymentStrategy strategy =
                PaymentFactory.getPayment(pedido.getMetodoPagamento());

        return strategy.pay(pedido.getValor());
    }
}
