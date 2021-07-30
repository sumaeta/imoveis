package com.api.imoveis.controllers;

import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.services.PessoaServiceLista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaPessoaController {

    @Autowired
    private PessoaServiceLista serviceLista;

    @GetMapping("/pessoas")
    public List<Pessoa> listar(){
        return serviceLista.listar();
    }
}
