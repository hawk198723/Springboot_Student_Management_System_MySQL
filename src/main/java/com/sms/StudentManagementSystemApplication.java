package com.sms;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;
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
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Jason","Warner", "jasn@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Leah","Hill", "leah@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Xavier","Stwarts", "X@gmail.com");
//		studentRepository.save(student3);
	}
}
