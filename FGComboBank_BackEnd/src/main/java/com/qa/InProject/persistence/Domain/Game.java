package com.qa.InProject.persistence.Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
public class Game {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "userName")
	private String userName;
	@Column(name = "gameId")
	private Long gameId;
	@Column(name = "gameName")
	private String gameName;
	@Column(name = "releaseYear")
	private int releaseYear;
	
	@OneToMany
	@JoinColumn(name = "gameName", nullable = false, insertable = false, updatable = false)
	private Set<Player> players;

	public Game()
	{
		
	}
	
	public Game(String userName, String gameName, int releaseYear, Set<Player> players)
	{
		super();
		this.gameName = gameName;
		this.releaseYear = releaseYear;
		
		this.userName = userName;
		this.players = players;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
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

	public void getGameName(Long gameId) {
		// TODO Auto-generated method stub
		
	}
	
}
