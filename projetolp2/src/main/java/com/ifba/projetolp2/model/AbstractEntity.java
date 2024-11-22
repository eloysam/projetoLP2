package com.ifba.projetolp2.model;

// pegado do arquivo aula1608-ifbademo

import java.io.Serializable;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public void setId(ID id){
        this.id = id;
    }
    public ID getId(){
        return this.id;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractEntity<?> other = (AbstractEntity<?>) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AbstractEntity [id=" + id + "]";
    }
    
}

