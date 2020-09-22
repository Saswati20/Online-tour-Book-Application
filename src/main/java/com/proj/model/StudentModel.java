package com.proj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //CREATE DATABASE TABLE & 4 Col FOR STUDENTMODEL CLASS AUTOMATIC
public class StudentModel implements Serializable
{
	@Id  //SET ROLL AS PRIMARY KEY
	private int roll;
	private String name;
	private String email;
	private double grade;
	private String password;
	
	public StudentModel(){}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
