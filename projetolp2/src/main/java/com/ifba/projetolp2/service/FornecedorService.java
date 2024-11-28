package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Fornecedor;
import com.ifba.projetolp2.repository.IFornecedorRepository;

@Service
@Transactional(readOnly = false)
public class FornecedorService {
    @Autowired
    private IFornecedorRepository repCliFornecedor;

    public void salvar(Fornecedor cliF){
        repCliFornecedor.save(cliF);
    }

    public void atualizar(Fornecedor cliF){
        repCliFornecedor.save(cliF);
    }

    public void excluir(Long id){
        repCliFornecedor.deleteById(id);
    }

    public Optional<Fornecedor> buscarPorId(Long id){
        return repCliFornecedor.findById(id);
    }

    public List<Fornecedor> buscarTodos(){
        return repCliFornecedor.findAll();
    } 
}
