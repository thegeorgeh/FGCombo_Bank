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

import com.qa.InProject.Business.service.GameService;
import com.qa.InProject.persistence.Domain.Game;
import com.qa.InProject.persistence.Repository.GameRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class GameDomainTest {
	
	@Mock(name="gameRepository")
    private GameRepository gameRepo;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void updateGame_WithValidInput_ShouldReturnUpdatedInput() {
	    Long gameId = 1L;
	    String userName = "Name";
	    String gameName = "Name";
	    String gameImage = "Image";
	    int releaseYear = 2019;
	    
	 
	    Game game = new Game();
	    game.setUserName(userName);
	    game.setGameName(gameName);
	    game.setGameId(gameId);
	    game.setReleaseYear(releaseYear);
	    
	    assertEquals(userName, game.getUserName());
	    assertEquals(gameId, game.getId());
	    assertEquals(gameName, game.getGameName());
	    assertEquals(releaseYear, game.getReleaseYear());

	}
}
