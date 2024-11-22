package com.ifba.projetolp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clienteFornecedor")
public class ClienteFornecedor extends AbstractEntity<Long> {
    @Id
    private String endereco;
    private String infoCartao;
    private String infoEnvios;
    private double saldo;
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getInfoCartao() {
        return infoCartao;
    }
    public void setInfoCartao(String infoCartao) {
        this.infoCartao = infoCartao;
    }
    public String getInfoEnvios() {
        return infoEnvios;
    }
    public void setInfoEnvios(String infoEnvios) {
        this.infoEnvios = infoEnvios;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "ClienteFornecedor [endereco=" + endereco + ", infoCartao=" + infoCartao + ", infoEnvios=" + infoEnvios
                + ", saldo=" + saldo + "]";
    }

    
}
