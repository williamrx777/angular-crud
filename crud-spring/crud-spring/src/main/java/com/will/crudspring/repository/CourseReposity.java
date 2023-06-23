package com.will.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.will.crudspring.model.Course;

@Repository
public interface CourseReposity extends JpaRepository<Course, Long> {

}
