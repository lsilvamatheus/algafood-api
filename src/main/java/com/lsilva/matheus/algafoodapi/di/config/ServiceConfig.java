package com.lsilva.matheus.algafoodapi.di.config;

import com.lsilva.matheus.algafoodapi.di.notificacao.Notificador;
import com.lsilva.matheus.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
}
