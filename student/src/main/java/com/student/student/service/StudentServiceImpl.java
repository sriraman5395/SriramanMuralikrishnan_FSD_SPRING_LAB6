package com.student.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
		 repository.save(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);
	}

	@Override
	public void deleteById(int stuId) {
		// TODO Auto-generated method stub
		repository.deleteById(stuId);
	}

	@Override
	public Student getById(int stuId) {
		// TODO Auto-generated method stub
		return repository.findById(stuId).orElse(null);
	}
	

}
