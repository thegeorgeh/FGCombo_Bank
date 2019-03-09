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

	@RequestMapping("/addPlayer/{gameID}/{playerName}")

	public Player addPlayer(@PathVariable Long gameID, @PathVariable String playerName) {
		Player result = svc.addPlayer(gameID, playerName);

		return result;
	}
	
	@RequestMapping("/updatePlayer/{playerID}/{playerName}")
	public String updatePlayer(@PathVariable Long playerID, @PathVariable String playerName) {
		return svc.updatePlayer(playerID, playerName);
	}

	@RequestMapping("/getPlayer/{playerID}")
	public Player getPlayer(@PathVariable Long playerID) {

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
	
	@RequestMapping("/getPlayerCombos/{playerID}")
	public List<Combo> getPlayerCombos(@PathVariable Long playerID){ 
		return svc.getPlayerCombos(playerID);
	}
}
