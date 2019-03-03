package com.qa.InProject.persistence.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "gameId")
	private Long gameId;
	@Column(name = "gameName")
	private String gameName;
	@Column(name = "releaseYear")
	private int releaseYear;
	
	public Game()
	{
		
	}
	
	public Game(String gameName, int releaseYear)
	{
		this.gameName = gameName;
		this.releaseYear = releaseYear;
	}


	public Long getId() {
		return gameId;
	}

	public void setId(Long id) {
		this.gameId = id;
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
	
}
