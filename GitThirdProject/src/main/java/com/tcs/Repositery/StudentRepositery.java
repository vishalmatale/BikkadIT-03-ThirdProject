package com.tcs.Repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.model.Student;
@Repository
public interface StudentRepositery extends JpaRepository<Student, Integer> {

	public List<Student>findByAge(int age);
	
}
