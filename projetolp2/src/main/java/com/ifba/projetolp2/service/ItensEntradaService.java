package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Itens_entrada;
import com.ifba.projetolp2.repository.Iitens_entradaRepository;

@Service
@Transactional(readOnly = false)
public class ItensEntradaService {
    @Autowired
    private Iitens_entradaRepository repItEn;

    public void salvar(Itens_entrada itent){
        repItEn.save(itent);
    }

    public void atualizar(Itens_entrada itent){
        repItEn.save(itent);
    }

    public void excluir(Long id){
        repItEn.deleteById(id);
    }

    public Optional<Itens_entrada> buscarPorId(Long id){ //serve para representar valores que podem estar presentes ou ausentes (nulos)
        return repItEn.findById(id);
    }

    public List<Itens_entrada> buscarTodos(){
        return repItEn.findAll();
    }
    
}
