package com.proj.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.proj.model.StudentModel;


public interface StudentRepository extends CrudRepository<StudentModel, Integer>
{
     List<StudentModel> findByEmail(String email);
}
