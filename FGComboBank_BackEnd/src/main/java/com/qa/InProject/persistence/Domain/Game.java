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
	@Column(name = "gameID")
	private Long gameID;
//	@Column(name = "userID")
//	private Long userID;

	@Column(name = "gameName")
	private String gameName;
	@Column(name = "releaseYear")
	private int releaseYear;
	
	@OneToMany
	@JoinColumn(name = "gameID", nullable = false, insertable = false, updatable = false)
	private Set<Player> players;
	

	public Game()
	{
		
	}

	public Game(String gameName, Set<Player> players)
	{
		super();
		this.gameName = gameName;

		
//		this.userID = userID;
		this.players = players;
	}

//	public Long getUserID() {
//		return userID;
//	}
//
//	public void setUserID(Long userID) {
//		this.userID = userID;
//	}

	public Long getGameID() {
		return gameID;
	}

	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public Long getID() {
		return gameID;
	}

	public void setID(Long id) {
		this.gameID = id;
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

	public void getGameName(Long gameID) {
		// TODO Auto-generated method stub
		
	}
	
} 
 