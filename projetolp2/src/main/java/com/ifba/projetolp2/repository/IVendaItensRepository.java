package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.VendaItens;

public interface IVendaItensRepository extends JpaRepository<VendaItens, Long>{
    
}
