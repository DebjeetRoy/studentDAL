package com.debjeet.studnet.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studenttab")
public class Student {

	public Student() {
		super();
	}

	public Student(String stuName, String stuCourse, Double stuFees) {
		super();
		this.stuName = stuName;
		this.stuCourse = stuCourse;
		this.stuFees = stuFees;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sname")
	private String stuName;
	
	@Column(name = "scourse")
	private String stuCourse;
	
	@Column(name = "sfee")
	private Double stuFees;
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public String getStuCourse() {
		return stuCourse;
	}
	
	public void setStuCourse(String stuCourse) {
		this.stuCourse = stuCourse;
	}
	
	public Double getStuFees() {
		return stuFees;
	}
	
	public void setStuFees(Double stuFees) {
		this.stuFees = stuFees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuCourse=" + stuCourse + ", stuFees=" + stuFees + "]";
	}
}
