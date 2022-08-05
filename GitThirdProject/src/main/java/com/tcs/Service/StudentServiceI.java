package com.tcs.Service;

import java.util.List;

import com.tcs.model.Student;

public interface StudentServiceI {
	
	
	public Student savedata(Student student);
	
	public List<Student>getalldata();
	
	public List<Student> getStudentByAge(int age);
	
	

}
