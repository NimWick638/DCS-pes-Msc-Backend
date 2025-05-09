package com.pes.pes_msc.service;


import com.pes.pes_msc.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO createCourse(CourseDTO courseDTO);
    CourseDTO getCourseById(String courseId);
    List<CourseDTO> getAllCourses();
    CourseDTO updateCourse(String courseId, CourseDTO courseDTO);
    void deleteCourse(String courseId);
}
