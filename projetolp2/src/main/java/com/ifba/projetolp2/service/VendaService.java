package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Venda;
import com.ifba.projetolp2.repository.IVendaRepository;

@Service
@Transactional(readOnly = false)
public class VendaService {
    @Autowired
    private IVendaRepository repVen;

    public void salvar(Venda ven){
        repVen.save(ven);
    }

    public void atualizar(Venda ven){
        repVen.save(ven);
    }

    public void excluir(Long id){
        repVen.deleteById(id);
    }

    public Optional<Venda> buscarPorId(Long id){ //serve para representar valores que podem estar presentes ou ausentes (nulos)
        return repVen.findById(id);
    }

    public List<Venda> buscarTodos(){
        return repVen.findAll();
    }
}

