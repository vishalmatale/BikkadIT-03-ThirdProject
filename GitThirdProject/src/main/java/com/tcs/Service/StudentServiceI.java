package com.tcs.Service;

import com.tcs.model.Student;



public interface StudentServiceI {
	
	
	public int savedata(Student student);
	
	public java.util.List<Student>getalldata();
	
	public Student getStudentById();
	
	

}
