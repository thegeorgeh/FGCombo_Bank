package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Repository.PlayerRepository;


@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repo;	
	
	@Override
	public Player addPlayer(String gameName, String playerName, Set<Combo> combos) {
		Player player = new Player();
		player.setGameName(gameName);
		player.setPlayerName(playerName);
		player.setCombos(combos);
		
		return repo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return repo.findAll();
	}

	@Override
	public Optional<Player> getPlayer(Long playerId) {
		return repo.findById(playerId);
	}

	@Override
	public String updatePlayer(Long playerId) {
		repo.findById(playerId);
		return null;
	}

	@Override
	public String removePlayer(Long playerId) {
		repo.findById(playerId);
		return null;
	}
	
	public void setRepo(PlayerRepository repo)
	{
		this.repo = repo;
	}

}

