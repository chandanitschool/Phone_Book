package com.tcs.com.repo;

import org.springframework.data.repository.CrudRepository;

import com.tcs.com.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
