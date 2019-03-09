package com.qa.InProject.persistence.Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "games")
public class Game {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "gameID")
	private Long gameID;
	@Column(name = "gameName")
	private String gameName;
	@Column(name = "releaseYear")
	private int releaseYear;
	
	@OneToMany
	@JoinColumn(name = "gameID", nullable = false, insertable = false, updatable = false)
	private List<Player> players;
	
	public Game()
	{
		
	}

	public Game(Long gameID, String gameName, List<Player> players)
	{
		this.gameID = gameID;
		this.gameName = gameName;
		this.players = players;
	}

	public Long getGameID() {
		return gameID;
	}

	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
} 
 