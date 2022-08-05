package com.tcs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Repositery.StudentRepositery;
import com.tcs.model.Student;

@Service
public class ServiceIMPI implements StudentServiceI {
	@Autowired
	private StudentRepositery studentRepositery;
	

	@Override
	public Student savedata(Student student) {
		
		Student save = studentRepositery.save(student);
		return save;
	}

	@Override
	public List<Student> getalldata() {
		
		List<Student> list = studentRepositery.findAll();
		return list;
	}

	@Override
	public List<Student> getStudentByAge(int age) {
		
		 List<Student> findByAge = studentRepositery.findByAge(age);
		
		return findByAge;
	}
	
	
	

}
