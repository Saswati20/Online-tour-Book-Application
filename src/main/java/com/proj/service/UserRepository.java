package com.proj.service;


import org.springframework.data.repository.CrudRepository;

import com.proj.model.UserModel;


public interface UserRepository extends CrudRepository<UserModel, String>{
	
	UserModel findByEmail(String email);

}