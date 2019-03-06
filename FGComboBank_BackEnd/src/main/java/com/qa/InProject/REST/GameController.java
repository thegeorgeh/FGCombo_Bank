package com.qa.InProject.REST;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.InProject.Business.service.GameServiceImpl;
import com.qa.InProject.persistence.Domain.Game;
import com.qa.InProject.persistence.Domain.Player;

@RestController
public class GameController {

	@Autowired
	public GameServiceImpl svc;

	@RequestMapping("/addGame/{userName}/{gameName}/{player}")
	public Game addGame(@PathVariable String userName, @PathVariable String gameName, @PathVariable Set<Player> player) {
		Game result = svc.addGame(userName, gameName, player);

		return result;
	}
	
	@RequestMapping("/updateGame/{gameId}")
	public String updateGame(@PathVariable Long gameId) {
		return svc.updateGame(gameId);
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
