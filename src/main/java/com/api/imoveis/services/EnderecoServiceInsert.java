package com.api.imoveis.services;

import com.api.imoveis.controllers.exceptions.EntidadeNaoEncontrada;
import com.api.imoveis.entities.Endereco;
import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.repositories.EnderecoRepository;
import com.api.imoveis.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceInsert {

    @Autowired
    private EnderecoRepository repository;

    @Autowired
    private PessoaServiceBusca service;

    public Endereco insert(Endereco endereco) {
        Long pessoaId = endereco.getPessoa().getId();
        Pessoa pessoa = service.busca(pessoaId);

        endereco.setPessoa(pessoa);

        return repository.save(endereco);
    }
}
