package com.will.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.will.crudspring.model.Course;
import com.will.crudspring.repository.CourseReposity;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

  @Bean
  CommandLineRunner initDatabase(CourseReposity courseReposity) {
    return args -> {
      courseReposity.deleteAll();

      Course c = new Course();
      c.setName("Angular com Spring");
      c.setCategory("front-end");;
      courseReposity.save(c);
    };
  }

}
