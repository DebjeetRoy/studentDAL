package com.debjeet.studnet.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.debjeet.studnet.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
