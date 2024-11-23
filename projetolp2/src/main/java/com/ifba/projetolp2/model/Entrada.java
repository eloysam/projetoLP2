package com.ifba.projetolp2.model;

import java.util.List;
import jakarta.persistence.*;


@Entity
@Table(name = "entrada")
public class Entrada extends AbstractEntity<Long>{
    //private Long idEntrada;
    private String data;
    private double valor;
    private Admin idAdmin;

    @OneToMany(mappedBy = "entrada")
    private List<Itens_entrada> itensEntrada;

    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    public double getvalor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public Admin getIdAdmin(){
        return this.idAdmin;
    }
    public void setIdAdmin(Admin idAdmin){
        this.idAdmin = idAdmin;
    }
    
    public List<Itens_entrada> getItensEntrada() {
        return itensEntrada;
    }
    public void setItensEntrada(List<Itens_entrada> itensEntrada) {
        this.itensEntrada = itensEntrada;
    }
    
    @Override
    public String toString() {
        return "Entrada [data=" + data + ", valor=" + valor + ", idAdmin=" + idAdmin + ", itensEntrada=" + itensEntrada
                + "]";
    }

    
}
