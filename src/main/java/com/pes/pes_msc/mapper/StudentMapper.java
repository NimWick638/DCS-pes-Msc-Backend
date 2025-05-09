package com.pes.pes_msc.mapper;

import com.pes.pes_msc.dto.StudentDTO;
import com.pes.pes_msc.entity.Student;
import lombok.AllArgsConstructor;
import lombok.*;


@NoArgsConstructor

public class StudentMapper {


    public static StudentDTO toDTO(Student student) {
        if (student == null) return null;

        return new StudentDTO(
                student.getStudentId(),
                student.getTitle(),
                student.getFirstName(),
                student.getLastName(),
                student.getNic(),
                student.getGpa(),
                student.getProfilePic(),
                student.getDateOfBirth()
        );
    }

    public static Student toEntity(StudentDTO dto) {
        if (dto == null) return null;

        Student student = new Student();
        student.setStudentId(dto.getStudentId());
        student.setTitle(dto.getTitle());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setNic(dto.getNic());
        student.setGpa(dto.getGpa());
        student.setProfilePic(dto.getProfilePic());
        student.setDateOfBirth(dto.getDateOfBirth());
        return student;
    }
}
