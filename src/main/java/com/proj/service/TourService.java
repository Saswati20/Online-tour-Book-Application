package com.proj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.model.TourModel;

@Service
public class TourService {
	
	@Autowired
	private TourRepository tourrepositoryobj;
	
	//FOR ADD TOUR 
	public TourModel addTourDetails(TourModel tmobj) 
	{
		tmobj = tourrepositoryobj.save(tmobj);
		return tmobj;
	}
	
	//FOR FETCH ALL DB FROM REPOSETORY AND SHOW THOSE DATA IN WEB OR JSP PAGE ON addtour.jsp PAGE
	public List<TourModel> showAllTour()
	{
		List<TourModel> alltour = new ArrayList<TourModel>();
		for(TourModel tm_obj:tourrepositoryobj.findAll()) 
		{
			alltour.add(tm_obj);
		}
		//tourrepositoryobj.findAll().forEach(alltour::add);
		return alltour;
	}

}
