package com.proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.model.UserModel;

@Service
public class UserService {
	
	@Autowired     //CREATE OBJECT OF USER REPOSITORY INTERFACE
	private UserRepository userrepositoryobj;
	
	// METHOD FOR ADD USER DETAILS
	public UserModel addUserDetails(UserModel umobj) 
	{
		System.out.println("INSIDDE ADDUSERDETAILS METHOD OF SERVICE CLASS");
		umobj= userrepositoryobj.save(umobj);
		return umobj;
	}

	//METHOD FOR SEARCH EMAIL FOR LOGIN THE USER
	public UserModel searchUserByEmail(String email)
	{
		System.out.println("INSIDE searchStudentByEmail METHOD in SERVICE CLASS");
		UserModel umobj = userrepositoryobj.findByEmail(email);
		return umobj; 
		
	}
	
}
