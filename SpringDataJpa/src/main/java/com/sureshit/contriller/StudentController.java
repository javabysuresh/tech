package com.sureshit.contriller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sureshit.Entity.Student;
import com.sureshit.service.StudentService;
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/post")
	public List<Student> save() {
		return studentService.saveStd();
	} 
	
	@GetMapping("/get")
	@ResponseBody
	public List<Student> get() {
		return studentService.getStd();
	}


}
