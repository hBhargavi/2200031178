package com.klef.jfsd.springboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;

@RestController
@RequestMapping("evaluation-service")
public class StudentController 
{
@Autowired
private StudentService service;
@GetMapping("/")
public String home()
{
	return "Spring Boot Rest API and JPA";
}
@PostMapping("register")
public String addstudent(@RequestBody Student student)
{
	return service.addStudent(student);
}
@GetMapping("viewall")
public List<Student> viewallstudents()
{
	return service.displayAllStudents();
}
}
