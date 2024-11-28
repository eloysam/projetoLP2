package com.ifba.projetolp2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "itensEntrada")
@Data
public class Itens_entrada extends AbstractEntity<Long>{
    
    private int quantidade;
    private double valorUnitario;

    @ManyToOne
    @JoinColumn(name = "id_entrada_fk") // chave estrangeira
    private Entrada entrada;

    @ManyToOne
    @JoinColumn(name = "id_produto_fk")
    private Produto idProduto;


    @Override
    public String toString() {
        return "ItensEntrada [idProduto=" + idProduto + ", quantidade=" + quantidade + ", valorUnitario="
                + valorUnitario + "]";
    }

}
