package com.proj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController 
{
	/*
	@RequestMapping(method=RequestMethod.POST, value="/adminlogincheck")
	public String openPageAfterLoginCheck(HttpServletRequest req)
	{
		String uid = req.getParameter("userid");
		String pass = req.getParameter("password");
		
		HttpSession session = req.getSession(true);
		
		if(uid.equals("admin") && pass.equals("admin"))
		{
			session.setAttribute("msg", "Chandan");
		    return "afterlogin.jsp";
		}
		else
		{
			session.setAttribute("msg", "INVALID UID OR PASS");
			return "login.jsp";
		}
	}*/
	
	/*
	@RequestMapping(method=RequestMethod.POST, value="/adminlogincheck")
	public String openPageAfterLoginCheck(@RequestParam("userid") String uid, String password, HttpSession session)
	{
		if(uid.equals("admin") && password.equals("admin"))
		{
			session.setAttribute("msg", "Chandan");
		    return "afterlogin.jsp";
		}
		else
		{
			session.setAttribute("errmsg", "INVALID UID OR PASS");
			return "login.jsp";
		}
	}*/
	
	@RequestMapping(method=RequestMethod.GET, value="/adminlogincheck")
	public ModelAndView openPageAfterLoginCheck(@RequestParam("userid") String uid, String password)
	{
		ModelAndView mv = new ModelAndView();
		if(uid.equals("admin") && password.equals("admin"))
		{
			mv.addObject("msg", "Chandan");
			mv.setViewName("afterlogin.jsp");
		}
		else
		{
			mv.addObject("errmsg", "INVALID UID OR PASS");
			mv.setViewName("adminlogin.jsp");
		}
		
		return mv;
	}


}
