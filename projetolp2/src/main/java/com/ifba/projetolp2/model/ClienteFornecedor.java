package com.ifba.projetolp2.model;

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
    
    
    @Override
    public String toString() {
        return "ClienteFornecedor [endereco=" + endereco + ", infoCartao=" + infoCartao + ", infoEnvios=" + infoEnvios
                + ", saldo=" + saldo + "]";
    }

    
}
