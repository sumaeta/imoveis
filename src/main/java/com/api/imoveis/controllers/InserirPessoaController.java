package com.api.imoveis.controllers;

import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.services.PessoaServiceInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InserirPessoaController {

    @Autowired
    private PessoaServiceInsert service;

    @PostMapping(value = "/pessoas")
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa adicionar( @RequestBody Pessoa obj){
        return service.insert(obj);
    }
}
