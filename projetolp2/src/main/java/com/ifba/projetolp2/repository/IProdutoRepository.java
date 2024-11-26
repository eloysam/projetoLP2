package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    
}
