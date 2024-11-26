package com.ifba.projetolp2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vendaItens")
@Data
public class VendaItens extends AbstractEntity<Long> {
    private String nomeProduto;
    private int valorUnitario;
    private int quantidade;
    private double valorTotal;
    Venda idVenda = new Venda();
    
    @Override
    public String toString() {
        return "VendaItens [nomeProduto=" + nomeProduto + ", valorUnitario=" + valorUnitario + ", quantidade="
                + quantidade + ", valorTotal=" + valorTotal + ", idVenda=" + idVenda + "]";
    }

    
}
