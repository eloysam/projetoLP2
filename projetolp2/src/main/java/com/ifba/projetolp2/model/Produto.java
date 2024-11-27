package com.ifba.projetolp2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Produto extends AbstractEntity<Long>{
    
    private String categoria;
    private String nomeProduto;
    private String dataFabricacao;
    private String dataValidade;
    private String qtdProduto;

    /*@ManyToOne
    @JoinColumn(name = "id_estoque_fk")
    private Estoque estoque;*/

    @Override
    public String toString() {
        return "Produto [categoria=" + categoria + ", nomeProduto=" + nomeProduto + ", dataFabricacao=" + dataFabricacao
                + ", dataValidade=" + dataValidade + "]";
    }

    
}
