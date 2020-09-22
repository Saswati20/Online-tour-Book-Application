package com.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController 
{
	@RequestMapping("/welcomep")
	public String openIndexPage()
	{
		return "welcome.jsp";
	}
	
	@RequestMapping("/registration")
	public String openRegPage()
	{
		return "registration.jsp";
	}
	
	@RequestMapping("/adminlogin")
	public String openAdminLoginPage()
	{
		return "adminlogin.jsp";
	}
	
	@RequestMapping("/search")
	public String openSearchPage()
	{
		return "search.jsp";
	}
	
	@RequestMapping("/viewall")
	public String openViewAllPage()
	{
		return "viewallstudent.jsp";
	}
	
	@RequestMapping("/searchbymail")
	public String openSearchbyEmailPage()
	{
		return "searchbyemail.jsp";
	}
	
		
}
