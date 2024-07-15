package com.harjyot.springboot.service;

import java.util.List;

import com.harjyot.springboot.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(long id);
	void deleteStudentById(long id);

}
