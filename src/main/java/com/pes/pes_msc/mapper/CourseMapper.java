package com.pes.pes_msc.mapper;

import com.pes.pes_msc.dto.CourseDTO;
import com.pes.pes_msc.entity.Course;


public class CourseMapper {

    public static CourseDTO toDTO(Course course) {
        if (course == null) return null;

        return new CourseDTO(
                course.getCourseId(),
                course.getName(),
                course.getCredit(),
                course.getYear(),
                course.getSemester(),
                course.getStatus()
        );
    }

    public static Course toEntity(CourseDTO courseDTO) {
        if (courseDTO == null) return null;

        Course course = new Course();
        course.setCourseId(courseDTO.getCourseId());
        course.setName(courseDTO.getName());
        course.setCredit(courseDTO.getCredit());
        course.setYear(courseDTO.getYear());
        course.setSemester(courseDTO.getSemester());
        course.setStatus(courseDTO.getStatus());
        return course;
    }
}
