package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Entrada;

public interface IEntradaRepository extends JpaRepository<Entrada, Long> {
    
}
