package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository repository;
	@Override
	public String addStudent(Student s) 
	{
		repository.save(s);
		return "Person Added Successfully";
	}


	@Override
	public List<Student> displayAllStudents() 
	{
		return (List<Student>) repository.findAll();
	}


}


