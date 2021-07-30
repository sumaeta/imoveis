package com.api.imoveis.controllers;

import com.api.imoveis.entities.Endereco;
import com.api.imoveis.services.EnderecoServiceInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InserirEnderecoController {

    @Autowired
    private EnderecoServiceInsert serviceInsert;

    @PostMapping("/enderecos")
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco adicionar(@RequestBody Endereco obj){
        return serviceInsert.insert(obj);
    }
}
