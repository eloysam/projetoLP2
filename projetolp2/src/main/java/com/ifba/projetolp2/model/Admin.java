package com.ifba.projetolp2.model;

//import jakarta.persistence.*;

public class Admin extends Usuario{
    private String loginAdmin;

    public String getLoginAdmin() {
        return loginAdmin;
    }
    public void setLoginAdmin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public void atualizarCatalogo(){
        //CROUD
    }
}
