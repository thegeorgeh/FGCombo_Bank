package com.qa.InProject.REST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.InProject.Business.service.PlayerServiceImpl;
import com.qa.InProject.persistence.Domain.Player;

@RestController
public class PlayerController {

	@Autowired
	public PlayerServiceImpl svc;

	@RequestMapping("/addPlayer/{playerName}")

	public Player addPlayer(@PathVariable String playerName) {
		Player result = svc.addPlayer(playerName);

		return result;
	}

	@RequestMapping("/getPlayer/{playerID}")
	public Optional<Player> getPlayer(@PathVariable Long playerID) {

		return svc.getPlayer(playerID);
	}

	@RequestMapping("/getAllPlayers")
	public List<Player> getAllPlayers() {
		List<Player> allClasses = svc.getAllPlayers();

		return allClasses;
	}

	@RequestMapping("/removePlayer/{playerID}")
	public String removePlayer(@PathVariable Long playerID) {
		return svc.removePlayer(playerID);
	}

}
