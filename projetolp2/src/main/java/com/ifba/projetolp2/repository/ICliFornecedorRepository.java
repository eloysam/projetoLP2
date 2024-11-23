package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.ClienteFornecedor;

public interface ICliFornecedorRepository extends JpaRepository<ClienteFornecedor, Long> {
    
}
