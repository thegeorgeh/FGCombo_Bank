package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Repository.PlayerRepository;


@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repo;	
	
	@Override
	public Player addPlayer(Long playerID, String playerName) {
		Player player = new Player();
		player.setPlayerID(playerID);
		player.setPlayerName(playerName);
		return repo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return repo.findAll();
	
	}

	@Override
	public Player getPlayer(Long playerID) {
		return repo.findById(playerID).get();
	}

	@Override
	public String updatePlayer(Long playerID, String playerName) {
		Player player = getPlayer(playerID);
		player.setPlayerName(playerName);
	
		repo.save(player);
		return "User " + playerID + " updated";
	}

	@Override
	public String removePlayer(Long playerID) {
		repo.findById(playerID);
		return null;
	}
	
	public void setRepo(PlayerRepository repo)
	{
		this.repo = repo;
	}

}

