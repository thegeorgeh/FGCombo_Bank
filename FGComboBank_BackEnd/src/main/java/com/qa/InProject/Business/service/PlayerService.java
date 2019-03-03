package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import com.qa.InProject.persistence.Domain.*;

public interface PlayerService {
	public Player addPlayer(String playerName);
	public Optional<Player> getPlayer(Long playerId);
	public List<Player> getAllPlayers();
	public String removePlayer(Long playerId);
	public String updatePlayer(Long playerId);
}
