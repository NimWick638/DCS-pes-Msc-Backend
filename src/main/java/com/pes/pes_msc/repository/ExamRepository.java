package com.pes.pes_msc.repository;

import com.pes.pes_msc.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, String> {
}