package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "semail", nullable = false, unique = true)
	    private String email;
  @Column(name = "sname",nullable = false,length = 50)
  private String name;
  @Column(name = "smobileNo",nullable = false,length = 10)
  private String mobileNo;
  @Column(name = "sgithubUsername",nullable = false)
  private String githubUsername;
  @Column(name = "srollNo",nullable = false,length = 30)
  private String rollNo;
  @Column(name = "scollegeName",nullable = false,length = 50,unique = true)
  private String collegeName;
  @Column(name = "saccessCode",nullable = false,length = 20,unique = true)
  private String accessCode;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getGithubUsername() {
	return githubUsername;
}
public void setGithubUsername(String githubUsername) {
	this.githubUsername = githubUsername;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getAccessCode() {
	return accessCode;
}
public void setAccessCode(String accessCode) {
	this.accessCode = accessCode;
}

}
