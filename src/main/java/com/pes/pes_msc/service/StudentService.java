package com.pes.pes_msc.service;

import com.pes.pes_msc.dto.StudentDTO;
import java.util.List;

public interface StudentService {
    StudentDTO createStudent(StudentDTO student);
    StudentDTO getStudentById(String studentId);
    List<StudentDTO> getAllStudents();
    StudentDTO updateStudent(String studentId, StudentDTO studentDTO);
    void deleteStudent(String studentId);
}



