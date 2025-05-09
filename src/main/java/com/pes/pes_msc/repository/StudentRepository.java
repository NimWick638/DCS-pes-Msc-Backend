package com.pes.pes_msc.repository;

import com.pes.pes_msc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}