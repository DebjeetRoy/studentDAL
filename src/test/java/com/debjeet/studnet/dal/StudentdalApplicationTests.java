package com.debjeet.studnet.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.debjeet.studnet.dal.entities.Student;
import com.debjeet.studnet.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository repo;
	
	@Test
	void createStudent() {
		repo.save(new Student("Dev","Java Course", 30d));
	}
	
	@Test
	void testFindStudentById() {
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student.setStuFees(60d);
		repo.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		repo.deleteById(1l);
	}
}
