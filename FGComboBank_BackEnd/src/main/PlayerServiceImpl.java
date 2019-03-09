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
	public Player addPlayer(Long gameID, String playerName) {
		Player player = new Player();
		player.setGameID(gameID);
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
		repo.deleteById(playerID);
		return "Player " + playerID + " deleted";
	}

	public void setRepo(PlayerRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Combo> getPlayerCombos(Long playerID) {
		Player player = repo.findById(playerID).get();
		return player.getCombos();
	}

//	@Override
//	public List<Player> getGamePlayers(Long gameID) {
//		Game game = repo.findById(gameID);
//		return null;
//	}

}
