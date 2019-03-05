package com.qa.InProject.DomainTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.InProject.Business.service.PlayerService;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Repository.PlayerRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class PlayerDomainTest {
	
	@Mock(name="playerRepository")
    private PlayerRepository playerRepo;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void updatePlayer_WithValidInput_ShouldReturnUpdatedInput() {
		String gameName = "Name";
	    Long playerId = 1L;
	    String playerName = "Name";
	    String playerImage = "Image";
	    String fightingStyle = "fight";
	 
	    Player player = new Player();
	    player.setGameName(gameName);
	    player.setPlayerName(playerName);
	    player.setPlayerId(playerId);
	    player.setImageUrl(playerImage);
	    player.setFightingStyle(fightingStyle);
	    
	    assertEquals(gameName, player.getGameName());
	    assertEquals(playerId, player.getPlayerId());
	    assertEquals(playerName, player.getPlayerName());
	    assertEquals(playerImage, player.getImageUrl());
	    assertEquals(fightingStyle, player.getFightingStyle());

	}
}
