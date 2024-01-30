package com.student.student.service;

import java.util.List;

import com.student.student.entity.Student;

public interface StudentService {
	List<Student> getAll();
	void create(Student student);
	void update(Student student);
	void deleteById(int stuId);
	Student getById(int stuId);
	

}
