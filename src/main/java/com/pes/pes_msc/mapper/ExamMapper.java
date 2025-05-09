package com.pes.pes_msc.mapper;

import com.pes.pes_msc.dto.ExamDTO;
import com.pes.pes_msc.entity.Course;
import com.pes.pes_msc.entity.Exam;
import lombok.*;


public class ExamMapper {

    public static ExamDTO toDTO(Exam exam) {
        if (exam == null) return null;

        return new ExamDTO(
                exam.getExamId(),
                exam.getCourse() != null ? exam.getCourse().getCourseId() : null,
                exam.getExamDate(),
                exam.getExamTime(),
                exam.getLocation()
        );
    }

    public static Exam toEntity(ExamDTO dto, Course course) {
        if (dto == null) return null;

        Exam exam = new Exam();
        exam.setExamId(dto.getExamId());
        exam.setCourse(course); // Inject Course manually from service layer
        exam.setExamDate(dto.getExamDate());
        exam.setExamTime(dto.getExamTime());
        exam.setLocation(dto.getLocation());
        return exam;
    }
}
