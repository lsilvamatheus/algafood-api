package com.lsilva.matheus.algafoodapi;

import com.lsilva.matheus.algafoodapi.di.modelo.Cliente;
import com.lsilva.matheus.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@email.com", "19999999999");
        ativacaoClienteService.ativar(joao);

        return "Olá, " + joao.getNome() + "!";
    }
}
