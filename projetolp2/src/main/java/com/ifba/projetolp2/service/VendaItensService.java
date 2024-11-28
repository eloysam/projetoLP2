package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.VendaItens;
import com.ifba.projetolp2.repository.IVendaItensRepository;

@Service
@Transactional(readOnly = false)
public class VendaItensService {
    @Autowired
    private IVendaItensRepository repVenIt;

    public void salvar(VendaItens venIt){
        repVenIt.save(venIt);
    }

    public void atualizar(VendaItens venIt){
        repVenIt.save(venIt);
    }

    public void excluir(Long id){
        repVenIt.deleteById(id);
    }

    public void retirarItens(){ // desenvolver depois
    }

    public Optional<VendaItens> buscarPorId(Long id){ //serve para representar valores que podem estar presentes ou ausentes (nulos)
        return repVenIt.findById(id);
    }

    public List<VendaItens> buscarTodos(){
        return repVenIt.findAll();
    }

}
