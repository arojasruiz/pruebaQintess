package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TeamDTO;
import com.example.demo.service.TeamsService;

@RestController
@RequestMapping("/teams")
public class TeamsController {
	
	@Autowired	
	private TeamsService service;

	@GetMapping("/allTeams")
	public List<TeamDTO> getAllTeams(){
		return service.getAllTeams();		
	}
	
	@GetMapping("/teamsByCountry")
	public List<TeamDTO> getTeamsByCountry(@RequestParam(name = "country") String country){
		return service.getTeamsByCountry(country);
	}
	
	@GetMapping("/teamsByScore")
	public List<TeamDTO> getTeamsByScore(@RequestParam(name = "score") int score){
		return service.getTeamsByScore(score);
	}
	
	@GetMapping("/teamByHighestScore")
	public TeamDTO getTeamByHighestScore(@RequestParam(name = "score") int score) {
		return service.getTeamByHighestScore(score);
	}
	
	@GetMapping("/teamByName")
	public TeamDTO getTeamByName(@RequestParam(name = "name") String name) {
		return service.getTeamByName(name);
	}

}
