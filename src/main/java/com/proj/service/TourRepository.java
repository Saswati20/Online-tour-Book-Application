package com.proj.service;

import org.springframework.data.repository.CrudRepository;

import com.proj.model.TourModel;

public interface TourRepository extends CrudRepository<TourModel, String>{

}
