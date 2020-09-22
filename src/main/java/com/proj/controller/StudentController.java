package com.proj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.proj.model.StudentModel;
import com.proj.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studservice;
			
	@RequestMapping(method=RequestMethod.POST, value="/student")
    public ModelAndView addStudent(StudentModel smobj)
	{
		System.out.println("INSIDE addStudent Method IN CONTROLLER CLASS");
		
		//RETURN INSERTED OBJECT
		smobj = studservice.addStudentRecord(smobj);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("regsuccessmsg", "THANKS FOR REG..NOW LOGIN");
		mv.setViewName("registration.jsp");
		
		return mv;
	}
	
	@RequestMapping("/searchstudent")
	public ModelAndView getStudent(@RequestParam int roll)
	{
		System.out.println("INSIDE getAllStudent Method IN CONTROLLER CLASS "+roll);
		
		StudentModel smobj = studservice.getStudentRecordFromDB(roll);
		System.out.println(smobj.getName());
		ModelAndView mv = new ModelAndView();
		
		if (smobj.getName() != null)
		{
			mv.addObject("stinfo",smobj);	
		}
		else
		{
			mv.addObject("msg", "INVALID ROLL NO");
		}
		
		mv.setViewName("search.jsp");
		
		return mv;
	}
	
	@RequestMapping("/searchstudentbyemail")
	public ModelAndView getStudent(@RequestParam String email)
	{
		System.out.println("INSIDE getAllStudent Method IN CONTROLLER CLASS "+email);
		
		List<StudentModel> stdlist = studservice.searchStudentByEmail(email);
		System.out.println(stdlist.size());
		ModelAndView mv = new ModelAndView();
		
		if (stdlist.size() > 0)
		{
			mv.addObject("stinfo",stdlist);	
		}
		else
		{
			mv.addObject("msg", "INVALID ROLL NO");
		}
		
		mv.setViewName("search.jsp");
		
		return mv;
	}

	
	
	@RequestMapping("/student")
	public ArrayList<StudentModel> getAllStudent()
	{
		System.out.println("INSIDE getAllStudent Method IN CONTROLLER CLASS");
		
		return studservice.getAllStudentRecordFromDB();
	}
	
	@RequestMapping("/deletestudent")
	public ModelAndView deleteStudent(@RequestParam int roll)
	{
		System.out.println("INSIDE deleteUser Method IN CONTROLLER CLASS");
		
		studservice.deleteStudentRecord(roll);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "RECORD DELETED");
		mv.setViewName("search.jsp");
		return mv;
	}
	
}