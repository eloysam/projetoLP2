package com.ifba.projetolp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Entrada;
import com.ifba.projetolp2.repository.IEntradaRepository;


@Service
@Transactional(readOnly = false)
public class EntradaService {
    @Autowired
    private IEntradaRepository repEntrada;

    public void salvar(Entrada ent){
        repEntrada.save(ent);
    }

    public void atualizar(Entrada ent){
        repEntrada.save(ent);
    }

    public void excluir(Long id){
        repEntrada.deleteById(id);
    }
}
