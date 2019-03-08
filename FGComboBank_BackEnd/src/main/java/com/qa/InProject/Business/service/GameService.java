package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.qa.InProject.persistence.Domain.*;

public interface GameService {
	public Game addGame(String gameName);
	public Game getGame(Long gameID);
	public List<Game> getAllGames();
	public String removeGame(Long gameID);
	public String updateGame(Long gameID, String gameName);
	
}