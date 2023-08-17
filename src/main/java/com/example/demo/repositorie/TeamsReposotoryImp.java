package com.example.demo.repositorie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.TeamDTO;

@Repository
public class TeamsReposotoryImp implements TeamsRepository{
	
	
	public TeamsReposotoryImp() {
		super();
		// TODO Auto-generated constructor stub
	}

//	private List<TeamDTO> createTeams() {
//		
//		}

	@Override
	public List<TeamDTO> createTeams() {
		System.out.println("Creación de equipos.");
		List<TeamDTO> Teams = new ArrayList<>();
		Teams.add(new TeamDTO("Bayern Munich", "Alemania", 1971, 3));
		Teams.add(new TeamDTO("Inter Milan", "Italia", 1897, 6));
		Teams.add(new TeamDTO("AC Milan", "Italia", 1906, 9));
		Teams.add(new TeamDTO("Barcelona", "España", 1869, 12));
		Teams.add(new TeamDTO("Napoli", "Italia", 1869, 1));
		Teams.add(new TeamDTO("PSG", "Francia", 1868, 3));
		Teams.add(new TeamDTO("Villarreal", "España", 1862, 5));
		Teams.add(new TeamDTO("Tottenham Hotspur", "Inglaterra", 1861, 7));
		Teams.add(new TeamDTO("Manchester City", "Inglaterra", 2020, 9));
		Teams.add(new TeamDTO("Atlético Madrid", "España", 1837, 11));
		Teams.add(new TeamDTO("Real Madrid", "España", 2031,1));
		Teams.add(new TeamDTO("Ajax", "Holanda", 1908, 2));
		Teams.add(new TeamDTO("Chelsea FC", "Inglaterra", 1847, 3));
		Teams.add(new TeamDTO("Benfica", "Portugal", 1829, 4));
		Teams.add(new TeamDTO("Arsenal", "Inglaterra", 1840, 5));
		Teams.add(new TeamDTO("Palmeiras", "Brasil", 1840, 6));
		Teams.add(new TeamDTO("Flamengo", "Brasil", 1844, 7));
		Teams.add(new TeamDTO("FC Porto", "Portugal", 1830, 8));
		Teams.add(new TeamDTO("Liverpool FC", "Inglaterra", 1994, 9));
		Teams.add(new TeamDTO("Real Betis", "España", 1783, 10));
		Teams.add(new TeamDTO("Borussia Dortmund", "Alemania", 1805, 15));
		Teams.add(new TeamDTO("Sporting", "Portugal", 1760, 14));
		Teams.add(new TeamDTO("PSV Eindhoven", "Holanda", 1759, 13));
		Teams.add(new TeamDTO("Roma", "Italia", 1779, 11));
		Teams.add(new TeamDTO("RB Leipzig", "Alemania", 1775, 12));
		Teams.add(new TeamDTO("Union Berlin", "Alemania", 1777, 10));
		Teams.add(new TeamDTO("Red Bull Salzburg", "Austria", 1755, 9));
		Teams.add(new TeamDTO("Lazio", "Italia", 1789, 8));
		Teams.add(new TeamDTO("Atalanta", "Italia", 1760, 7));
		Teams.add(new TeamDTO("Flora Tallinn", "Estonia", 1726, 6));
		Teams.add(new TeamDTO("Rangers", "Escocia", 1759, 5));
		Teams.add(new TeamDTO("Real Sociedad", "España", 1723, 4));
		Teams.add(new TeamDTO("Star Belgrade", "Serbia", 1759, 3));
		Teams.add(new TeamDTO("Sevilla", "España", 1737, 2));
		Teams.add(new TeamDTO("Marseille", "Francia", 1725, 1));
		Teams.add(new TeamDTO("Newcastle United", "Inglaterra", 1725, 5));
		Teams.add(new TeamDTO("Bayer Leverkusen", "Alemania", 1752, 4));
		Teams.add(new TeamDTO("Brighton & Hove Albion", "Inglaterra", 1735, 3));
		Teams.add(new TeamDTO("Monaco", "Francia", 1723, 2));
		Teams.add(new TeamDTO("Freiburg", "Alemania", 1710, 1));
		Teams.add(new TeamDTO("Feyenoord", "Holanda", 1709, 10));
		Teams.add(new TeamDTO("Slavia Prague R.", "Checa", 1719, 9));
		Teams.add(new TeamDTO("Celtic", "Escocia", 1716, 8));
		Teams.add(new TeamDTO("Shakhtar Donetsk", "Ucrania", 1709, 7));
		Teams.add(new TeamDTO("Manchester United", "Inglaterra", 1709, 6));
		Teams.add(new TeamDTO("River Plate", "Argentina", 1699, 5));
		Teams.add(new TeamDTO("Olympiakos", "Grecia", 1704, 4));
		Teams.add(new TeamDTO("Lyon", "Francia", 1707, 3));
		Teams.add(new TeamDTO("Juventus", "Italia", 1798, 2));
		Teams.add(new TeamDTO("Atlético Mineiro", "Brasil", 1703, 1));
		System.out.println("Equipos creados.");
		return Teams;
	}

	@Override
	public List<TeamDTO> getAllTeams() {
				
		return null;
	}

	@Override
	public List<TeamDTO> getTeamsByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamDTO> getTeamsByScore(int score) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO getTeamByHighestScore(int score) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO getTeamByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
