package com.api.imoveis.controllers;

import com.api.imoveis.entities.Pessoa;
import com.api.imoveis.services.PessoaServiceEditar;
import com.api.imoveis.services.PessoaServiceInsert;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditarPessoaController {

    @Autowired
    private PessoaServiceEditar service;

    @Autowired
    private PessoaServiceInsert pessoaService;

    @PutMapping("/pessoas/{id}")
    public Pessoa atualizar(@PathVariable Long id,
                            @RequestBody Pessoa pessoa) {
        Pessoa pessoaAtual = service.buscar(id);

        BeanUtils.copyProperties(pessoa, pessoaAtual, "id");

        return pessoaService.insert(pessoaAtual);
    }
}
