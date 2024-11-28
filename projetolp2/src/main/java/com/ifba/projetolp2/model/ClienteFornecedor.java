package com.ifba.projetolp2.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clienteFornecedor")
@Data
public class ClienteFornecedor extends AbstractEntity<Long> {
    private String endereco;
    private String infoCartao;
    private String infoEnvios;
    private double saldo;

    @OneToMany(mappedBy = "clienteFornecedor")
    private List<Venda> vendas;
    
    @Override
    public String toString() {
        return "ClienteFornecedor [endereco=" + endereco + ", infoCartao=" + infoCartao + ", infoEnvios=" + infoEnvios
                + ", saldo=" + saldo + "]";
    }

    
}
