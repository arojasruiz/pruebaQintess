package com.example.demo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TeamDTO;
import com.example.demo.repositorie.TeamsRepository;

@Service
public class TeamsServiceImp implements TeamsService{
	@Autowired
	private TeamsRepository repo;

	@Override
	public List<TeamDTO> getAllTeams() {				
		return repo.createTeams();
	}

	@Override
	public List<TeamDTO> getTeamsByCountry(String country) {
		System.out.println("Obtener equipos según País. ");
		List<TeamDTO> teams = repo.createTeams();
		List<TeamDTO> teamsByCountry = new ArrayList<>();
		for(TeamDTO team : teams) {
			if (team.getCountry().toLowerCase().equals(country.toLowerCase())) {
				teamsByCountry.add(team);
			}			 
		}		 
		System.out.println("Listado de equipos según País. ");
		return teamsByCountry;
	}

	@Override
	public List<TeamDTO> getTeamsByScore(int score) {
		System.out.println("Obtener equipos según mayor o igual a puntuación. ");
		List<TeamDTO> teams = repo.createTeams();
		List<TeamDTO> teamsByScore = new ArrayList<>();
		for(TeamDTO team : teams) {
			if (team.getScore() >= score) {
				teamsByScore.add(team);					 
			}			 
		 }				 
		System.out.println("Listado de equipos según mayor o igual a puntuación. ");
		return teamsByScore;
	}

	@Override
	public TeamDTO getTeamByHighestScore(int score) {
		System.out.println("Equipo según mayor puntuación. ");
		List<TeamDTO> teams = repo.createTeams();
		TeamDTO teamsByHighestScore = null;
		for(TeamDTO team : teams) {			
			if (team.getScore() > score) {
				teamsByHighestScore = new TeamDTO();
				teamsByHighestScore.setName(team.getName());
				teamsByHighestScore.setCountry(team.getCountry());
				teamsByHighestScore.setYear(team.getYear());
				teamsByHighestScore.setScore(team.getScore());
			}
		 }				 
		System.out.println("Equipo según mayor puntuación. ");
		return teamsByHighestScore;
	}

	@Override
	public TeamDTO getTeamByName(String name) {
		System.out.println("Obtener equipo según Nombre. ");
		List<TeamDTO> teams = repo.createTeams();
		TeamDTO teamByName = null;
		for(TeamDTO team : teams) {
			 if (team.getName().toLowerCase().equals(name.toLowerCase())) {
				 teamByName = new TeamDTO();
				 teamByName.setName(team.getName());
				 teamByName.setCountry(team.getCountry());
				 teamByName.setYear(team.getYear());
			 }
		}		 
		System.out.println("Datos de equipos según Nombre. ");
		return teamByName;
	}
	
}