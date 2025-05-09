package com.pes.pes_msc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "course_enrollment")
@Getter
@Setter
public class CourseEnrollment {
    @EmbeddedId
    private CourseEnrollmentId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "s_id")
    private Student student;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;
}

@Embeddable
@Getter
@Setter
class CourseEnrollmentId implements Serializable {
    private String studentId;
    private String courseId;
}