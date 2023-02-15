package com.lsilva.matheus.algafoodapi.di.notificacao;


import com.lsilva.matheus.algafoodapi.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta)
            mensagem = mensagem.toUpperCase();

        System.out.printf("Notificando %s através do e-mail: %s utilizando SMTP: %s: %s\n",
        cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
