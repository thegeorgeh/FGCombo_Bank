package com.qa.InProject.persistence.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "playerId")
	private Long playerId;
	@Column(name = "playerName")
	private String playerName;
	@Column(name = "imageUrl")
	private String imageUrl;
	@Column(name = "fightingStyle")
	private int fightingStyle;
	
	public Player()
	{
		
	}
	
	public Player(String playerName, String imageUrl, int fightingStyle)
	{
		this.playerName = playerName;
		this.imageUrl = imageUrl;
		this.fightingStyle = fightingStyle;
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

	public int getfightingStyle() {
		return fightingStyle;
	}

	public void setfightingStyle(int fightingStyle) {
		this.fightingStyle = fightingStyle;
	}
	
}

