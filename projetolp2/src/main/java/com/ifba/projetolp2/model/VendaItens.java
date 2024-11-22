package com.ifba.projetolp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vendaItens")
public class VendaItens extends AbstractEntity<Long> {
    private String nomeProduto;
    private int valorUnitario;
    private int quantidade;
    private double valorTotal;
    Venda idVenda = new Venda();
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public int getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Venda getIdVenda() {
        return idVenda;
    }
    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }
    
    @Override
    public String toString() {
        return "VendaItens [nomeProduto=" + nomeProduto + ", valorUnitario=" + valorUnitario + ", quantidade="
                + quantidade + ", valorTotal=" + valorTotal + ", idVenda=" + idVenda + "]";
    }

    
}
