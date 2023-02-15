package com.lsilva.matheus.algafoodapi.di.service;

import com.lsilva.matheus.algafoodapi.di.modelo.Cliente;
import com.lsilva.matheus.algafoodapi.di.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
