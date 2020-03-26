package com.sureshit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sureshit.Entity.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

	
	
	}


