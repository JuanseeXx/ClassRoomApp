package com.example.APIClassRoom.models;

import com.example.APIClassRoom.herlpers.TypeUser;
import jakarta.persistence.Entity;

@Entity
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String telephone;
    private TypeUser typeUser;

    public User() {
    }

    public User(Integer id, String name, String email, String password, String telephone, TypeUser typeUser) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.typeUser = typeUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }


}
