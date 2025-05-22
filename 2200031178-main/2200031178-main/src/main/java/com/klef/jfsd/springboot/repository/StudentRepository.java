package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Student;

@Repository // This is telling this is a repository layer
public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
