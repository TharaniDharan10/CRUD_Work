package com.example.Student.Management.System;

import com.example.Student.Management.System.Repository.StudentRepository;
import com.example.Student.Management.System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student();
//		student1.setName("Mohan");
//		student1.setAge(18);
//		student1.setCourse("Physics");
//		student1.setEmail("Mohan@gmail.com");
//		studentRepository.save(student1);

	}
}
