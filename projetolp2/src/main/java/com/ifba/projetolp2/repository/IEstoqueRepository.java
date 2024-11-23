package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Estoque;

public interface IEstoqueRepository extends JpaRepository<Estoque, Long> {
    
}
