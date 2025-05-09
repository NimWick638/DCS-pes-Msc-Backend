package com.pes.pes_msc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicalrequest")
@Data
public class MedicalRequest {
    @EmbeddedId
    private MedicalRequestId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "s_id")
    private Student student;

    @ManyToOne
    @MapsId("examId")
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @Column(name = "documents", columnDefinition = "TEXT")
    private String documents;

    @Column(name = "status", length = 50)
    private String status;
}

@Embeddable
@Data
class MedicalRequestId implements Serializable {
    private String studentId;
    private String examId;
}