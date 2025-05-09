package com.pes.pes_msc.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "exam_registration") // Note: Typo in original table name preserved
@Data
public class ExamRegistration {
    @EmbeddedId
    private ExamRegistrationId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "s_id")
    private Student student;

    @ManyToOne
    @MapsId("examId")
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;
}

@Embeddable
@Data
class ExamRegistrationId implements Serializable {
    private String studentId;
    private String examId;
}