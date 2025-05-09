package com.pes.pes_msc.repository;

import com.pes.pes_msc.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<Course, String> {

}