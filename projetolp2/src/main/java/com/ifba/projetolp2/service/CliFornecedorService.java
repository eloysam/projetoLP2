package com.ifba.projetolp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.ClienteFornecedor;
import com.ifba.projetolp2.repository.ICliFornecedorRepository;

@Service
@Transactional(readOnly = false)
public class CliFornecedorService {
    @Autowired
    private ICliFornecedorRepository repCliFornecedor;

    public void salvar(ClienteFornecedor cliF){
        repCliFornecedor.save(cliF);
    }

    public void atualizar(ClienteFornecedor cliF){
        repCliFornecedor.save(cliF);
    }

    public void excluir(Long id){
        repCliFornecedor.deleteById(id);
    }
}
