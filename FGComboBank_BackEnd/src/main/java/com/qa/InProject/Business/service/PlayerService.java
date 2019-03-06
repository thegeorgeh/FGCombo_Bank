package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.qa.InProject.persistence.Domain.*;

public interface PlayerService {
	public Player addPlayer(String gameName, String playerName, Set<Combo> combos);
	public Optional<Player> getPlayer(Long playerId);
	public List<Player> getAllPlayers();
	public String removePlayer(Long playerId);
	public String updatePlayer(Long playerId);
}
