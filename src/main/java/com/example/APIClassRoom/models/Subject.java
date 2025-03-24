package com.example.APIClassRoom.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Subject")
    private Integer idSubject;

    @Column(nullable = false, length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_Course", nullable = false)
    private Course course;

    public Subject(){

    }

    public Subject(Integer idSubject, String name, Course course) {
        this.idSubject = idSubject;
        this.name = name;
        this.course = course;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
