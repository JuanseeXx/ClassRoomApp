package com.example.APIClassRoom.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Course")
    private Integer idCourse;

    @Column(nullable = false, length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_Teacher", nullable = false)
    private Teacher teacher;

    public Course(){

    }

    public Course(Integer idCourse, String name, Teacher teacher) {
        this.idCourse = idCourse;
        this.name = name;
        this.teacher = teacher;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}