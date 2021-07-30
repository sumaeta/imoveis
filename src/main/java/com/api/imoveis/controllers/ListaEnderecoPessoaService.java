package com.api.imoveis.controllers;

import com.api.imoveis.entities.Endereco;
import com.api.imoveis.services.EnderecoServiceLista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaEnderecoPessoaService {

    @Autowired
    private EnderecoServiceLista repository;

    @GetMapping("/enderecos")
    public List<Endereco> listar(){
        return repository.listar();
    }
}
