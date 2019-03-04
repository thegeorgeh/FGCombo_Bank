package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Repository.PlayerRepository;


@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repo;	
	
	@Override
	public Player addPlayer(String playerName) {
		Player player = new Player();
		player.setPlayerName(playerName);
		
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
