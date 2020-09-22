package com.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.proj.model.UserModel;
import com.proj.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userserviceobj;
	
	// FOR ADDING USER TO DATABASE
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public ModelAndView addUser(UserModel usermodelobj) 
	{
		System.out.println("INSIDE OF ADDUSER METHOD OF CONTROLLER CLASS");
		usermodelobj = userserviceobj.addUserDetails(usermodelobj);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("regsucessmsg", "THANKS FOR REGISTRATION NOW LOGIN");
		mv.setViewName("userregistration.jsp");
		return mv;
	}
	
	// MATCH EMAIL AND PASSWORD FOR USER LOGIN
	@RequestMapping("/searchuserbyemail")
	public ModelAndView getUserByEmail(@RequestParam String email,String password) 
	{
		System.out.println("INSIDE getUserByEmail Method IN CONTROLLER CLASS "+email);
		UserModel founduser = userserviceobj.searchUserByEmail(email);
		System.out.println(founduser.getEmail());
		System.out.println(founduser.getPassword());
		ModelAndView mv = new ModelAndView();
		
		if(email.equals(founduser.getEmail()) && password.equals(founduser.getPassword()) )
		{
			mv.addObject("msg","VALID");	
		}
		else
		{
			mv.addObject("msg", "INVALID Email ID OR Password");
		}
		
		mv.setViewName("userlogin.jsp");
		return mv;
	}
	

}
