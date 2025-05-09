package com.pes.pes_msc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "exam_results")
@Data
public class ExamResult {
    @EmbeddedId
    private ExamResultId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "s_id")
    private Student student;

    @ManyToOne
    @MapsId("examId")
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @Column(name = "results", length = 10)
    private String results;
}

@Embeddable
@Data
class ExamResultId implements Serializable {
    private String studentId;
    private String examId;
}