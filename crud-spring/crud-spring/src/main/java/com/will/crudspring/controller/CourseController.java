package com.will.crudspring.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.will.crudspring.model.Course;
import com.will.crudspring.repository.CourseReposity;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {


  private final CourseReposity courseReposity;



  @GetMapping
  public List<Course> list() {
    return courseReposity.findAll();
  }


}
