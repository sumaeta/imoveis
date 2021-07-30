package com.api.imoveis.services;

import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceInsert {

    @Autowired
    private PessoaRepository repository;

    public Pessoa insert(Pessoa pessoa) {
        return repository.save(pessoa);
    }
}
