package com.example.APIClassRoom.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Student")
    private Integer idStudent;

    @OneToOne
    @JoinColumn(name = "id_User", nullable = false)
    private User user;

    @Column(nullable = false)
    private Integer grade;

    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false, length = 255)
    private String address;

    public Student(){

    }

    public Student(Integer idStudent, User user, Integer grade, Date birthDate, String address) {
        this.idStudent = idStudent;
        this.user = user;
        this.grade = grade;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

