package com.ifba.projetolp2.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "venda")
@Data
public class Venda extends AbstractEntity<Long>{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, length = 10)
    private Long idVendedor;
    @Column(nullable = false, unique = true, length = 60)
    private double valorVenda;
    private String dataVenda;

    @OneToMany(mappedBy = "venda")
    private List<VendaItens> vendaItens; 

    @Override
    public String toString() {
        return "Venda [idVendedor=" + idVendedor + ", valorVenda=" + valorVenda + ", dataVenda=" + dataVenda + "]";
    }
}
