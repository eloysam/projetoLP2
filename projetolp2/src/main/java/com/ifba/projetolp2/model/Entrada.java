package com.ifba.projetolp2.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "entrada")
@Data
public class Entrada extends AbstractEntity<Long>{
    //private Long idEntrada;
    private String data;
    private double valor;

    @OneToMany(mappedBy = "entrada")
    private List<Itens_entrada> itensEntrada;
    
    @Override
    public String toString() {
        return "Entrada [data=" + data + ", valor=" + valor + ", itensEntrada=" + itensEntrada
                + "]";
    }

    
}
