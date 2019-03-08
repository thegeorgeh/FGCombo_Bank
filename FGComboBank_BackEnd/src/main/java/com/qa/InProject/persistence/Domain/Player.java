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
public class Player {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "playerID")
	private Long playerID;
	@Column(name = "gameID")
	private Long gameID;

	@Column(name = "playerName")
	private String playerName;
	@Column(name = "imageUrl")
	private String imageUrl;
	@Column(name = "fightingStyle")
	private String fightingStyle;
	
	@OneToMany
	@JoinColumn(name = "playerID", nullable = false, insertable = false, updatable = false)
	private Set<Combo> combos;
	
	public Player()
	{
		
	}
	
	public Long getGameID() {
		return gameID;
	}

	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}

	public Long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(Long playerID) {
		this.playerID = playerID;
	}

	public String getFightingStyle() {
		return fightingStyle;
	}

	public void setFightingStyle(String fightingStyle) {
		this.fightingStyle = fightingStyle;
	}

	public Set<Combo> getCombos() {
		return combos;
	}

	public void setCombos(Set<Combo> combos) {
		this.combos = combos;
	}

	public Player(Long gameID, String playerName, Set<Combo> combos)
	{
		super();
		this.playerName = playerName;
		this.gameID = gameID;
		this.combos = combos;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String PlayerName) {
		this.playerName = PlayerName;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	
}  

