package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Venda;

public interface IVendaRepository extends JpaRepository<Venda, Long> {
    
}
