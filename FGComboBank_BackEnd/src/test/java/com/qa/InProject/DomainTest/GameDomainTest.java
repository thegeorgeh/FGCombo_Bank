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

import com.qa.InProject.CONSTANTS;
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

	    
	    CONSTANTS.GAME_MOCK_OBJECT.setGameName(CONSTANTS.TEST_STRING);
	    CONSTANTS.GAME_MOCK_OBJECT.setGameID(CONSTANTS.TEST_LONG);
	    CONSTANTS.GAME_MOCK_OBJECT.setReleaseYear(CONSTANTS.TEST_INT);
	    
	    assertEquals(CONSTANTS.TEST_LONG, CONSTANTS.GAME_MOCK_OBJECT.getGameID());
	    assertEquals(CONSTANTS.TEST_STRING, CONSTANTS.GAME_MOCK_OBJECT.getGameName());
	    assertEquals(CONSTANTS.TEST_INT, CONSTANTS.GAME_MOCK_OBJECT.getReleaseYear());

	}
}
