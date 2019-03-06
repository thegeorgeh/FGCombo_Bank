package com.qa.InProject.REST;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.InProject.Business.service.PlayerServiceImpl;
import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Domain.Player;

@RestController
public class PlayerController {

	@Autowired
	public PlayerServiceImpl svc;

	@RequestMapping("/addPlayer/{gameName}/{playerName}/{combos}")

	public Player addPlayer(@PathVariable String gameName, @PathVariable String playerName, @PathVariable Set<Combo> combos) {
		Player result = svc.addPlayer(gameName, playerName, combos);

		return result;
	}
	
	@RequestMapping("/updatePlayer/{playerId}")
	public String updatePlayer(@PathVariable Long playerId) {
		return svc.updatePlayer(playerId);
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
