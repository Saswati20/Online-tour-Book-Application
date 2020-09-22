package com.proj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TourModel implements Serializable{

	@Id
	private String tour_to;
	private String tour_from;
	private String duration;
	private String description;
	private String date;
	private int fare;
	
	public TourModel() {}

	public String getTour_from() {
		return tour_from;
	}

	public void setTour_from(String tour_from) {
		this.tour_from = tour_from;
	}

	public String getTour_to() {
		return tour_to;
	}

	public void setTour_to(String tour_to) {
		this.tour_to = tour_to;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	

}
