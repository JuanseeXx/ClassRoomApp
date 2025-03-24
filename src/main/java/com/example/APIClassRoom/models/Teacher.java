package com.example.APIClassRoom.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Teacher")
    private Integer idTeacher;

    @OneToOne
    @JoinColumn(name = "id_User", nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String specialty;

    public Teacher(){

    }

    public Teacher(Integer idTeacher, User user, String specialty) {
        this.idTeacher = idTeacher;
        this.user = user;
        this.specialty = specialty;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}