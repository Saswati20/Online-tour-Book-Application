package com.proj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.model.StudentModel;

//By default Service Class is Singleton and register it in spring framework
@Service
public class StudentService 
{
	@Autowired   //CREATE OBJECT OF STUDENT REPOSITORY Interface
	private StudentRepository srobj;
	
	public StudentModel addStudentRecord(StudentModel sobj) 
	{
		System.out.println("INSIDE addStudentRecord METHOD in SERVICE CLASS");
		System.out.println("Name "+sobj.getName());
						
		//save return the object which it saved
		sobj =srobj.save(sobj);
		
		return sobj;
	}
	
	public StudentModel getStudentRecordFromDB(int roll)
	{
		System.out.println("INSIDE getStudentRecordFromDB METHOD in SERVICE CLASS");
		
		StudentModel foundstudent = srobj.findById(roll).orElse(new StudentModel());
	    
		return foundstudent;
	}
	
	public List<StudentModel> searchStudentByEmail(String email)
	{
		System.out.println("INSIDE searchStudentByEmail METHOD in SERVICE CLASS");
		
		List<StudentModel> stdlist = srobj.findByEmail(email);
	    
		return stdlist;
	}
		
	public void deleteStudentRecord(int roll) 
	{
		System.out.println("INSIDE deleteStudentRecord METHOD in SERVICE CLASS");
		
		srobj.deleteById(roll);
	}
	
	
	public ArrayList<StudentModel> getAllStudentRecordFromDB()
	{
		System.out.println("INSIDE getAllUserDgetAllStudentRecordFromDB METHOD in SERVICE CLASS \n");
		
		ArrayList<StudentModel> allstudentdetails = new ArrayList<StudentModel>();
		srobj.findAll().forEach(allstudentdetails::add);
		return allstudentdetails;
	 }
	
	
	
	
	
	
}