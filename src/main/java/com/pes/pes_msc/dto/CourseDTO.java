package com.pes.pes_msc.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CourseDTO {
    private String courseId;
    private String name;
    private Integer credit;
    private Integer year;
    private String semester;
    private String status;
}

