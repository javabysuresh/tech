package com.sureshit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureshit.Entity.Student;
import com.sureshit.repo.StudentRepo;
@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;
	
	List<Student> s=new ArrayList<>();
		
	public List<Student> saveStd() {
		
		s.add(new Student(1,"Suresh", "A"));
		s.add(new Student(2,"Ramesh", "B"));
		s.add(new Student(3,"Chary", "C"));
		s.add(new Student(4,"Chari", "D"));
		s.add(new Student(5,"Seen", "E"));

		studentRepo.saveAll(s);
		
		for (Student student : s) {
			System.out.println(student);
		}
		return s;
	}
 		
		
	public List<Student> getStd() {
			
			studentRepo.findAll();
			
			//iterate elts into list format
			for (Student student : s) {
				System.out.println(student);
			}
			
			return s;
			
		}
}
