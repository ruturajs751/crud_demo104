package com.crud_demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud_demo.Repository.StudentRepository;
import com.crud_demo.entities.Student;

@SpringBootTest
class CrudDemo104ApplicationTests {
	@Autowired
	private StudentRepository studentrepo;
	
	@Test
	void saveOneStudent() {
		Student s=new Student();
		s.setName("aniket");
		s.setCourse("pharmacy");
		s.setFee(200);
		studentrepo.save(s);
		
	}
	@Test
	void deleteOneStudent() {
		studentrepo.deleteById(1L);
	}
	@Test
	void updateOneStudent() {
		Student s=new Student();
		s.setId(2L);
		s.setName("aniket");
		s.setCourse("M.pharma");
		s.setFee(200);
		studentrepo.save(s);
		
	}
	@Test
	void readOneStudent() {
		Optional<Student> findById = studentrepo.findById(2L);
		Student s = findById.get();
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}

}
