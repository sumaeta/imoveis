package com.api.imoveis.services;

import com.api.imoveis.controllers.exceptions.EntidadeNaoEncontrada;
import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.repositories.PessoaRepository;
import com.api.imoveis.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaServiceBusca {

    @Autowired
    private PessoaRepository repository;

    public Pessoa busca(Long id) {
        Optional<Pessoa> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pessoa.class.getName()));
    }
}
