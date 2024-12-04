package com.ifba.projetolp2.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fornecedor")
public class Fornecedor extends AbstractEntity<Long>{
    @Column
    private String endereco;
    @Column
    private String infoCartao;
    @Column
    private String infoEnvios;
    @Column
    private double saldo;

    @OneToMany // é um relacionamento unidimencional
    @JoinColumn(name = "id_fornecedor_fk")
    private List<Produto> produto;
    
    @Override
    public String toString() {
        return "ClienteFornecedor [endereco=" + endereco + ", infoCartao=" + infoCartao + ", infoEnvios=" + infoEnvios
                + ", saldo=" + saldo + "]";
    }

    
}
