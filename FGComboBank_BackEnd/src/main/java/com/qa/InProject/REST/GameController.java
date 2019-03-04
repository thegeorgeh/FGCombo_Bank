package com.qa.InProject.REST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.InProject.Business.service.GameServiceImpl;
import com.qa.InProject.persistence.Domain.Game;

@RestController
public class GameController {

	@Autowired
	public GameServiceImpl svc;

	@RequestMapping("/addGame/{gameName}")
	public Game addGame(@PathVariable String gameName) {
		Game result = svc.addGame(gameName);

		return result;
	}

	@RequestMapping("/getGame/{gameId}")
	public Optional <Game> getGame(@PathVariable Long gameId) {
		return svc.getGame(gameId);
	}


	@RequestMapping("/getAllGames")
	public List<Game> getAllGames() {
		List<Game> allClasses = svc.getAllGames();

		return allClasses;
	}

	@RequestMapping("/removeGame/{gameId}")
	public String removeGame(@PathVariable Long gameId) {
		return svc.removeGame(gameId);
	}

}
