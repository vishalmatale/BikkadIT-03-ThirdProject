package com.tcs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Service.StudentServiceI;
import com.tcs.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceI studentServiceI;
	
	@PostMapping(value="/savestudent", consumes= {"Application/json"})
	public ResponseEntity<String>savedata(@RequestBody Student student){
		
		    Student save = (Student) studentServiceI.savedata(student);
	
		    String msg=save.getId()+" data save sucessfully";
		    
		    return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	@GetMapping(value= "/getAll")
	public ResponseEntity<List<Student>>getAllStudent(){
		
		List<Student> studentList = studentServiceI.getalldata();
		return new ResponseEntity<List<Student>>(studentList,HttpStatus.OK);
		}
	
	@GetMapping(value= "/getByAge/{age}")
	public ResponseEntity<List<Student>>getByAge(@PathVariable int age){
		
		List<Student> ByAge = studentServiceI.getStudentByAge(age);
		return new ResponseEntity<List<Student>>(ByAge,HttpStatus.OK);
		}
	
	

}
