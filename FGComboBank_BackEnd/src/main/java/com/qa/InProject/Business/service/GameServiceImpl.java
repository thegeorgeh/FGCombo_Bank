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
	public Game addGame(String userName, String gameName, Set<Player> player) {
		Game game = new Game();
		game.setUserName(userName);
		game.setGameName(gameName);
		game.setPlayers(player);
		
		return repo.save(game);
	}

	@Override
	public List<Game> getAllGames() {
		return repo.findAll();
	}

	@Override
	public Optional<Game> getGame(Long gameId) {
		return repo.findById(gameId);
	}

	@Override
	public String updateGame(Long gameId) {
		repo.findById(gameId);
		return null;
	}

	@Override
	public String removeGame(Long gameId) {
		repo.findById(gameId);
		return null;
	}
	
	public void setRepo(GameRepository repo)
	{
		this.repo = repo;
	}

}
