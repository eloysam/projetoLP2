package com.ifba.projetolp2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "venda")
@Data
public class Venda extends AbstractEntity<Long>{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedor;
    private double valorVenda;
    private String dataVenda;

    @Override
    public String toString() {
        return "Venda [idVendedor=" + idVendedor + ", valorVenda=" + valorVenda + ", dataVenda=" + dataVenda + "]";
    }
}
