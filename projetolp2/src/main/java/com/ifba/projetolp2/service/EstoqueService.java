package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Estoque;
import com.ifba.projetolp2.repository.IEstoqueRepository;

@Service
@Transactional(readOnly = false)
public class EstoqueService {
    @Autowired
    private IEstoqueRepository repEst;

    public void salvar(Estoque esto){
        repEst.save(esto);
    }

    public void atualizar(Estoque esto){
        repEst.save(esto);
    }

    public void excluir(Estoque esto){
        repEst.delete(esto);
    }

    public List<Estoque> buscarTodos(){
        return repEst.findAll();
    }

    public Optional<Estoque> buscarPorId(Long id){
        return repEst.findById(id);
    }
}
