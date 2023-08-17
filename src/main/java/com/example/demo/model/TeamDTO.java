package com.example.demo.model;

public class TeamDTO {
	String country;
	String name;
	int year;
	int score;	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public TeamDTO(String name, String country, int year, int score) {
		super();
		this.name = name;
		this.country = country;		
		this.year = year;
		this.score = score;
	}

	public TeamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}	
	

}