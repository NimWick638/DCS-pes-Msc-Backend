package com.pes.pes_msc.service.impl;

import com.pes.pes_msc.dto.StudentDTO;
import com.pes.pes_msc.entity.Student;
import com.pes.pes_msc.exception.ResourceNotFoundException;
import com.pes.pes_msc.mapper.StudentMapper;
import com.pes.pes_msc.repository.StudentRepository;
import com.pes.pes_msc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student newStudent = StudentMapper.toEntity(studentDTO);
        Student savedStudent = studentRepository.save(newStudent);
        return StudentMapper.toDTO(savedStudent);
    }

    @Override
    public StudentDTO getStudentById(String studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Student with id " + studentId + " not found"));
        return StudentMapper.toDTO(student);

    }
    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(StudentMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO updateStudent(String studentId, StudentDTO dto) {
        Student existing = studentRepository.findById(studentId).orElse(null);
        if (existing == null) return null;

        existing.setTitle(dto.getTitle());
        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setNic(dto.getNic());
        existing.setGpa(dto.getGpa());
        existing.setProfilePic(dto.getProfilePic());
        existing.setDateOfBirth(dto.getDateOfBirth());

        return StudentMapper.toDTO(studentRepository.save(existing));
    }

    @Override
    public void deleteStudent(String studentId) {
        studentRepository.deleteById(studentId);
    }
}