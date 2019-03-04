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
	@Column(name = "gameName")
	private String gameName;
	@Column(name = "playerId")
	private Long playerId;
	@Column(name = "playerName")
	private String playerName;
	@Column(name = "imageUrl")
	private String imageUrl;
	@Column(name = "fightingStyle")
	private String fightingStyle;
	
	@OneToMany
	@JoinColumn(name = "playerName", nullable = false, insertable = false, updatable = false)
	private Set<Combo> combos;
	
	public Player()
	{
		
	}
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
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

	public Player(String gameName, String playerName, String imageUrl, String fightingStyle)
	{
		super();
		this.playerName = playerName;
		this.imageUrl = imageUrl;
		this.fightingStyle = fightingStyle;
		this.gameName = gameName;
		this.combos = combos;
	}


	public Long getId() {
		return playerId;
	}

	public void setId(Long id) {
		this.playerId = id;
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

