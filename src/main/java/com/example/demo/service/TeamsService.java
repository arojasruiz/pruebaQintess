package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TeamDTO;

public interface TeamsService {
	
	public List<TeamDTO> getAllTeams();
	public List<TeamDTO> getTeamsByCountry(String country);
	public List<TeamDTO> getTeamsByScore(int score);
	public TeamDTO getTeamByHighestScore(int score);
	public TeamDTO getTeamByName(String name);

}