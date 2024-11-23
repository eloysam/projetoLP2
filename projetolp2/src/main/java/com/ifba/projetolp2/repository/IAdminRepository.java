package com.ifba.projetolp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ifba.projetolp2.model.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Long>{
    
}
