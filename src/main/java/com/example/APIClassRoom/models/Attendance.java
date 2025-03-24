package com.example.APIClassRoom.models;

import com.example.APIClassRoom.herlpers.AttendanceStatus;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Attendance")
    private Integer idAttendance;

    @ManyToOne
    @JoinColumn(name = "id_Student", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_Course", nullable = false)
    private Course course;

    @Column(nullable = false)
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AttendanceStatus status;

    public Attendance(){

    }

    public Attendance(Integer idAttendance, Student student, Course course, Date date, AttendanceStatus status) {
        this.idAttendance = idAttendance;
        this.student = student;
        this.course = course;
        this.date = date;
        this.status = status;
    }

    public Integer getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(Integer idAttendance) {
        this.idAttendance = idAttendance;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }
}

