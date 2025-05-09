package com.pes.pes_msc.service.impl;

import com.pes.pes_msc.dto.CourseDTO;
import com.pes.pes_msc.entity.Course;
import com.pes.pes_msc.mapper.CourseMapper;
import com.pes.pes_msc.repository.CourseRepository;
import com.pes.pes_msc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        Course course = CourseMapper.toEntity(courseDTO);
        return CourseMapper.toDTO(courseRepository.save(course));
    }

    @Override
    public CourseDTO getCourseById(String courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        return course.map(CourseMapper::toDTO).orElse(null);
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        return courseRepository.findAll().stream()
                .map(CourseMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO updateCourse(String courseId, CourseDTO courseDTO) {
        Course existing = courseRepository.findById(courseId).orElse(null);
        if (existing == null) return null;

        existing.setName(courseDTO.getName());
        existing.setCredit(courseDTO.getCredit());
        existing.setYear(courseDTO.getYear());
        existing.setSemester(courseDTO.getSemester());
        existing.setStatus(courseDTO.getStatus());

        return CourseMapper.toDTO(courseRepository.save(existing));
    }

    @Override
    public void deleteCourse(String courseId) {
        courseRepository.deleteById(courseId);
    }
}
