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
import com.qa.InProject.Business.service.PlayerService;
import com.qa.InProject.persistence.Repository.PlayerRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class PlayerDomainTest {

    @Before
    public void setUp(){
        
    }
	
	@Test
	public void updatePlayer_WithValidInput_ShouldReturnUpdatedInput() {
	 
	    
		CONSTANTS.PLAYER_MOCK_OBJECT.setGameID(CONSTANTS.TEST_LONG);
	    CONSTANTS.PLAYER_MOCK_OBJECT.setPlayerName(CONSTANTS.TEST_STRING);
	    CONSTANTS.PLAYER_MOCK_OBJECT.setPlayerID(CONSTANTS.TEST_LONG);
	    CONSTANTS.PLAYER_MOCK_OBJECT.setFightingStyle(CONSTANTS.TEST_STRING);
	    
	    assertEquals(CONSTANTS.TEST_LONG, CONSTANTS.PLAYER_MOCK_OBJECT.getGameID());
	    assertEquals(CONSTANTS.TEST_LONG, CONSTANTS.PLAYER_MOCK_OBJECT.getPlayerID());
	    assertEquals(CONSTANTS.TEST_STRING, CONSTANTS.PLAYER_MOCK_OBJECT.getPlayerName());
	    assertEquals(CONSTANTS.TEST_STRING, CONSTANTS.PLAYER_MOCK_OBJECT.getFightingStyle());

	}
}
