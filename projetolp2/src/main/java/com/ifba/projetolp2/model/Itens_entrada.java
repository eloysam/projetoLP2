package com.ifba.projetolp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "itensEntrada")
public class Itens_entrada {
    @Id
    private Long idItensEntrada;
    private int idProduto;
    private int quantidade;
    private double valorUnitario;

    @ManyToOne
    @JoinColumn(name = "id_entrada_fk") // chave estrangeira
    private Entrada entrada;

    public Entrada getEntrada() {
        return entrada;
    }
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
    public Long getIdItensEntreda(){
        return this.idItensEntrada;
    }
    public void setIdItensEntreda(Long idItensEntrada){
        this.idItensEntrada = idItensEntrada;
    }
    public int getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double getValorUnitario(){
        return this.valorUnitario;
    }
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "ItensEntrada [idProduto=" + idProduto + ", quantidade=" + quantidade + ", valorUnitario="
                + valorUnitario + "]";
    }

}
