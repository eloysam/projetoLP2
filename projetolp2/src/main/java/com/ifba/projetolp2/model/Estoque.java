package com.ifba.projetolp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estoque")
public class Estoque extends AbstractEntity<Long>{ // extender de produto, atibutos para produto
    private String categoria;
    private String nomeProduto; 
    private String qtdProduto;
    private String dataFabricacao;
    private String dataValidade;

    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public String getQtdProduto(){
        return this.qtdProduto;
    }
    public void setQtdProduto(String qtdProduto){
        this.qtdProduto = qtdProduto;
    }
    public String getDataFabricacao(){
        return this.dataFabricacao;
    }
    public void setDataFabricacao(String dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }
    public String getDataValidade(){
        return this.dataValidade;
    }
    public void setDataValidade (String dataValidade){
        this.dataValidade = dataValidade;
    }
}
