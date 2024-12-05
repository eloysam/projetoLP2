package com.ifba.projetolp2.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fornecedor")
public class Fornecedor extends AbstractEntity<Long>{
    @Column
    private String endereco;
    @Column
    private String nome;
    @Column
    private String tipoDeProdutoFornecido;
    @Column
    private String telefone;
    @Column
    private String cnpj;

    @OneToMany // é um relacionamento unidimencional
    @JoinColumn(name = "id_fornecedor_fk")
    private List<Produto> produto;

    
}
