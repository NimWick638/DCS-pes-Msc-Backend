package com.pes.pes_msc.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
    @Id
    @Column(name = "s_id", length = 20)
    private String studentId;

    @Column(name = "title", length = 3, nullable = false)
    private String title = "Mr.";

    @Column(name = "f_name", length = 30)
    private String firstName;

    @Column(name = "s_name", length = 30)
    private String lastName;

    @Column(name = "nic", length = 15)
    private String nic;

    @Column(name = "gpa")
    private Float gpa;

    @Lob
    @Column(name = "profile_pic")
    private byte[] profilePic;

    @Column(name = "dob")
    private LocalDate dateOfBirth;

}