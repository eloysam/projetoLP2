package com.ifba.projetolp2.model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario extends AbstractEntity<Long> {
    @Column
    private String nome;
    @Column
    private String tipoUsuario;
    @Column
    private String senha;
    @Column
    private String dataCadastro;

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", senha=" + senha + ", dataCadastro=" + dataCadastro + "]";
    }

    
}
