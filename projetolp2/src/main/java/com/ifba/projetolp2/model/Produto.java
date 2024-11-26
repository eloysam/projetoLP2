package com.ifba.projetolp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto extends AbstractEntity<Long>{
    
    private String categoria;
    private String nomeProduto;
    private String dataFabricacao;
    private String dataValidade;

    @ManyToOne
    @JoinColumn(name = "id_estoque_fk")
    private Estoque estoque;

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto [categoria=" + categoria + ", nomeProduto=" + nomeProduto + ", dataFabricacao=" + dataFabricacao
                + ", dataValidade=" + dataValidade + "]";
    }

    
}
