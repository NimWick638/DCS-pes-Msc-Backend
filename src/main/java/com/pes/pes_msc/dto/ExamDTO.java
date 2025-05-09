package com.pes.pes_msc.dto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ExamDTO {
    private String examId;
    private String courseId; // Reference to Course (as ID only)
    private LocalDate examDate;
    private LocalTime examTime;
    private String location;
}
