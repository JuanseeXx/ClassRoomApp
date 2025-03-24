package com.example.APIClassRoom.models;

import com.example.APIClassRoom.herlpers.TypeUser;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_User")
    private Integer idUser;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(length = 20)
    private String telephone;

    @Enumerated(EnumType.STRING)
    @Column(name = "User_Type", nullable = false)
    private TypeUser typeUser;

    public User() {
    }

    public User(Integer id, String name, String email, String password, String telephone, TypeUser typeUser) {
        this.idUser = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.typeUser = typeUser;
    }

    public Integer getId() {
        return idUser;
    }

    public void setId(Integer id) {
        this.idUser = id;
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
