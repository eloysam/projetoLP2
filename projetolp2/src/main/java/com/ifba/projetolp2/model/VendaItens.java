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
   
    @ManyToOne
    @JoinColumn(name = "id_venda_fk") // criando uma chave estrangeira venda na tabela do banco de dados vendaItens
    private Venda venda;
    
    @ManyToOne
    @JoinColumn(name = "id_produto_fk")
    private Produto produto;

    @Override
    public String toString() {
        return "VendaItens [nomeProduto=" + nomeProduto + ", valorUnitario=" + valorUnitario + ", quantidade="
                + quantidade + ", valorTotal=" + valorTotal +  "]";
    }

    
}
