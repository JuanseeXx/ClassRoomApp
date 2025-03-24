package com.example.APIClassRoom.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Enrollment")
    private Integer idEnrollment;

    @ManyToOne
    @JoinColumn(name = "id_Student", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_Course", nullable = false)
    private Course course;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date enrollmentDate = new Date();

    public Enrollment(){

    }

    public Enrollment(Integer idEnrollment, Student student, Course course, Date enrollmentDate) {
        this.idEnrollment = idEnrollment;
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Integer getIdEnrollment() {
        return idEnrollment;
    }

    public void setIdEnrollment(Integer idEnrollment) {
        this.idEnrollment = idEnrollment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
