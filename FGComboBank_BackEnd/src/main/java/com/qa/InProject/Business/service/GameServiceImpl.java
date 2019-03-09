package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.Game;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository repo;

	@Override
	public Game addGame(String gameName) {
		Game game = new Game();
		game.setGameName(gameName);

		return repo.save(game);
	}

	@Override
	public List<Game> getAllGames() {
		return repo.findAll();
	}

	@Override
	public Game getGame(Long gameID) {
		return repo.findById(gameID).get();
	}

	@Override
	public String updateGame(Long gameID, String gameName) {
		Game game = getGame(gameID);
		game.setGameName(gameName);

		repo.save(game);
		return "User " + gameID + " updated";
	}

	@Override
	public String removeGame(Long gameID) {
		repo.deleteById(gameID);
		return "Game " + gameID + " deleted";
	}

	public void setRepo(GameRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Player> getGamePlayers(Long gameID) {
		Game game = repo.findById(gameID).get();

		return game.getPlayers();
	}

}
