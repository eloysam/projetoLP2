package com.ifba.projetolp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Usuario;
import com.ifba.projetolp2.repository.IUsuarioRepository;

@Service
@Transactional(readOnly = false)
public class UsuarioService {
    @Autowired
    private IUsuarioRepository repUs;

    public void salvar(Usuario us){
        repUs.save(us);
    }

    public void atualizar(Usuario us){
        repUs.save(us);
    }

    public void excluir(Long id){
        repUs.deleteById(id);
    }
}
