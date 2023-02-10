package com.crud_demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.crud_demo.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
