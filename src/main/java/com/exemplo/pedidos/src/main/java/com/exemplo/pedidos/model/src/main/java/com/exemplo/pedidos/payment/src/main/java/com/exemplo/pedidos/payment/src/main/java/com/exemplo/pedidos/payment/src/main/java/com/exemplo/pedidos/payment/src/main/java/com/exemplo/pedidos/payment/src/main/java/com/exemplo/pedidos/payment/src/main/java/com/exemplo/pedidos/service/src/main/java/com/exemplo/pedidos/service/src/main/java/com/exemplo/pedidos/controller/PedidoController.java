package com.exemplo.pedidos.controller;

import com.exemplo.pedidos.model.Pedido;
import com.exemplo.pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido) {
        return service.processar(pedido);
    }
}
