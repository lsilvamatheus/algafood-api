package com.lsilva.matheus.algafoodapi.di.notificacao;

import com.lsilva.matheus.algafoodapi.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
