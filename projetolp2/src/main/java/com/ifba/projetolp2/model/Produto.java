package com.ifba.projetolp2.model;

import java.util.List;
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

    @OneToMany(mappedBy = "produto")
    private List<Itens_entrada> itens_entrada;

    @OneToMany(mappedBy = "produto")
    private List<VendaItens> vendaIt;

    @Override
    public String toString() {
        return "Produto [categoria=" + categoria + ", nomeProduto=" + nomeProduto + ", dataFabricacao=" + dataFabricacao
                + ", dataValidade=" + dataValidade + "]";
    }

    
}
