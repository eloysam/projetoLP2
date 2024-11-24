package com.ifba.projetolp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ifba.projetolp2.model.Admin;
import com.ifba.projetolp2.repository.IAdminRepository;

@Service
@Transactional(readOnly = false)
public class AdminService {
    @Autowired // para instanciar o objeto da classe Admin 
    private IAdminRepository repositorioAd;

    public void salvar(Admin ad){
        repositorioAd.save(ad);
    }

    public void atualizar(Admin ad){
        repositorioAd.save(ad);
    }

    public void excluir(Admin ad){
        repositorioAd.delete(ad);
    }
}
