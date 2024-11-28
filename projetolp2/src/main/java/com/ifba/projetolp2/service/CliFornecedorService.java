package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

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

    public Optional<ClienteFornecedor> buscarPorId(Long id){
        return repCliFornecedor.findById(id);
    }

    public List<ClienteFornecedor> buscarTodos(){
        return repCliFornecedor.findAll();
    } 
}
