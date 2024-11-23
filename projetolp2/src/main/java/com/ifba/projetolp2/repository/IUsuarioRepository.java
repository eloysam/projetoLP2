package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
