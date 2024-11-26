package com.ifba.projetolp2.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "estoque")
public class Estoque extends AbstractEntity<Long>{ // extender de produto, atibutos para produto
     
    private String qtdProduto;

    @OneToMany(mappedBy = "estoque")
    private List<Produto> produtos; // lista de produtos

    public String getQtdProduto(){
        return this.qtdProduto;
    }
    public void setQtdProduto(String qtdProduto){
        this.qtdProduto = qtdProduto;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
