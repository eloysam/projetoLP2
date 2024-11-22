package com.ifba.projetolp2.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends AbstractEntity<Long> {
    @Column
    private String nome;
    private int senha;
    private Date dataCadastro;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", senha=" + senha + ", dataCadastro=" + dataCadastro + "]";
    }

    
}
