package com.ifba.projetolp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public class Venda extends AbstractEntity<Long>{
    @Id
    private Long idVenda;
    private Long idVendedor;
    private double valorVenda;
    private String dataVenda;

    public Long getIdVenda(){
        return this.idVenda;
    }
    public void setIdVenda(Long idVenda){
        this.idVenda = idVenda;
    }
    public Long getIdVendedor(){
        return this.idVendedor;
    }
    public void setIdVendedor(Long idVendedor){
        this.idVendedor = idVendedor;
    }
    public double getValorVenda(){
        return this.valorVenda;
    }
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    public String getDataVenda(){
        return this.dataVenda;
    }
    public void setDataVenda(String dataVenda){
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return "Venda [idVendedor=" + idVendedor + ", valorVenda=" + valorVenda + ", dataVenda=" + dataVenda + "]";
    }
}
