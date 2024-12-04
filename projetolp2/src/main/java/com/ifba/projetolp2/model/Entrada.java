package com.ifba.projetolp2.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "entrada")
@Data
public class Entrada extends AbstractEntity<Long>{
    //private Long idEntrada;
    @Column
    private String data;
    @Column
    private double valor;

    @OneToMany(mappedBy = "entrada", cascade = CascadeType.ALL) // por na outra classe haver um atributo com o @joincolunm, esse relacionamento é bidimencional
    private List<Itens_entrada> itensEntrada;
    
    @Override
    public String toString() {
        return "Entrada [data=" + data + ", valor=" + valor + ", itensEntrada=" + itensEntrada
                + "]";
    }

    
}
