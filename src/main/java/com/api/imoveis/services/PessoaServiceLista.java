package com.api.imoveis.services;

import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceLista {

    @Autowired
    private PessoaRepository repository;


    public List<Pessoa> listar() {
        return repository.findAll();
    }
}
