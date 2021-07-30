package com.api.imoveis.services;

import com.api.imoveis.entities.Endereco;
import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.repositories.EnderecoRepository;
import com.api.imoveis.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceLista {

    @Autowired
    private EnderecoRepository repository;


    public List<Endereco> listar() {
        return repository.findAll();
    }
}
