package com.pes.pes_msc.service;

import com.pes.pes_msc.dto.ExamDTO;

import java.util.List;

public interface ExamService {
    ExamDTO createExam(ExamDTO examDTO);
    ExamDTO getExamById(String examId);
    List<ExamDTO> getAllExams();
    ExamDTO updateExam(String examId, ExamDTO examDTO);
    void deleteExam(String examId);
}
