package com.student.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>  {

}
