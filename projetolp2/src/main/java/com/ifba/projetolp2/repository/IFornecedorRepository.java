package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Fornecedor;

public interface IFornecedorRepository extends JpaRepository<Fornecedor, Long> {
    
}
