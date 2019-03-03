package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import com.qa.InProject.persistence.Domain.*;

public interface GameService {
	public Game addGame(String gameName);
	public Optional<Game> getGame(Long gameId);
	public List<Game> getAllGames();
	public String removeGame(Long gameId);
	public String updateGame(Long gameId);
}