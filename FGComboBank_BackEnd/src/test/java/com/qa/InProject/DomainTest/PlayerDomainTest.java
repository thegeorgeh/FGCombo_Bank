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
		Long gameID = 1L;
	    Long playerID = 1L;
	    String playerName = "Name";
	    String playerImage = "Image";
	    String fightingStyle = "fight";
	 
	    Player player = new Player();
	    player.setGameID(gameID);
	    player.setPlayerName(playerName);
	    player.setPlayerID(playerID);
	    player.setImageUrl(playerImage);
	    player.setFightingStyle(fightingStyle);
	    
	    assertEquals(gameID, player.getGameID());
	    assertEquals(playerID, player.getPlayerID());
	    assertEquals(playerName, player.getPlayerName());
	    assertEquals(playerImage, player.getImageUrl());
	    assertEquals(fightingStyle, player.getFightingStyle());

	}
}
