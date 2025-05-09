package com.pes.pes_msc.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @Column(name = "course_id", length = 20)
    private String courseId;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "credit", nullable = false)
    private Integer credit;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "semester", length = 20, nullable = false)
    private String semester;

    @Column(name = "status", length = 20, nullable = false)
    private String status;



}