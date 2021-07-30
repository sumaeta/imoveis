package com.api.imoveis.controllers;

import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.services.PessoaServiceBusca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuscaPessoaController {

    @Autowired
    private PessoaServiceBusca service;

    @GetMapping("/pessoas/{id}")
    public ResponseEntity<Pessoa> buscar(@PathVariable Long id){
        Pessoa obj = service.busca(id);
        return ResponseEntity.ok(obj);
    }
}
