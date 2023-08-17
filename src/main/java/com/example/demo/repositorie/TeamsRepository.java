package com.example.demo.repositorie;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.TeamDTO;

@Repository
public interface TeamsRepository {
	
	public List<TeamDTO> createTeams();
	public List<TeamDTO> getAllTeams();
	public List<TeamDTO> getTeamsByCountry(String country);
	public List<TeamDTO> getTeamsByScore(int score);
	public TeamDTO getTeamByHighestScore(int score);
	public TeamDTO getTeamByName(String name);

}
