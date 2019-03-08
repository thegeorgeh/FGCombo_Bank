package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.qa.InProject.persistence.Domain.*;

public interface PlayerService {
	public Player addPlayer(Long gameID, String playerName);
	public Optional<Player> getPlayer(Long playerID);
	public List<Player> getAllPlayers();
	public String removePlayer(Long playerID);
	public String updatePlayer(Long playerID);
}
