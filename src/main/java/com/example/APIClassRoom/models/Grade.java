package com.example.APIClassRoom.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Grade")
    private Integer idGrade;

    @ManyToOne
    @JoinColumn(name = "id_Student", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_Subject", nullable = false)
    private Subject subject;

    @Column(nullable = false, precision = 5, scale = 2)
    private Double score;

    @Column(nullable = false)
    private Date evaluationDate;

    public Grade(){

    }

    public Grade(Integer idGrade, Student student, Subject subject, Double score, Date evaluationDate) {
        this.idGrade = idGrade;
        this.student = student;
        this.subject = subject;
        this.score = score;
        this.evaluationDate = evaluationDate;
    }

    public Integer getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(Integer idGrade) {
        this.idGrade = idGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
}
