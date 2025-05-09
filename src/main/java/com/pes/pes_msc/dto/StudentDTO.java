package com.pes.pes_msc.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
    private String studentId;
    private String title;
    private String firstName;
    private String lastName;
    private String nic;
    private Float gpa;
    private byte[] profilePic;
    private LocalDate dateOfBirth;
}
