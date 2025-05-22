package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Student;

public interface StudentService 
{
public String addStudent(Student s);
//public String updateStudent(Student s);

public List<Student> displayAllStudents();

}
