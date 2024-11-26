package com.ifba.projetolp2.service;

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

    public void retirarItens(){
    }
}
