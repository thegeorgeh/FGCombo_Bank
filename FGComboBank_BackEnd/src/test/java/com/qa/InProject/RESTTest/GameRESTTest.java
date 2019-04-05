package com.qa.InProject.RESTTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.InProject.CONSTANTS;
//import com.qa.business.AlgorithmServiceImpl;
import com.qa.InProject.Business.service.GameServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.Game;
import com.qa.InProject.REST.GameController;

@RunWith(MockitoJUnitRunner.class)
public class GameRESTTest {

	@InjectMocks
	GameController uCon;

	@Mock
	GameServiceImpl svc;

	@Mock
	Game game;

	@Before
	public void setup() {
//		uCon.svc;
	}

	@Test
	public void testGetAllGames() {
		List<Game> MOCK_LIST = Arrays.asList(game, game, game);
		Mockito.when(svc.getAllGames()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, uCon.getAllGames());
	}

	@Test
	public void testGetAGame() {
		Game MOCK_OBJECT = new Game();
		Mockito.when(svc.getGame(CONSTANTS.TEST_LONG)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, uCon.getGame(CONSTANTS.TEST_LONG));
	}

	@Test
	public void testUpdateAGame() {
		Mockito.when(svc.updateGame(CONSTANTS.TEST_LONG, CONSTANTS.TEST_STRING)).thenReturn(CONSTANTS.TEST_STRING);
		assertEquals(CONSTANTS.TEST_STRING, uCon.updateGame(CONSTANTS.TEST_LONG, CONSTANTS.TEST_STRING));
	}

	@Test
	public void testDeleteGame() {
		Mockito.when(svc.removeGame(CONSTANTS.TEST_LONG)).thenReturn(CONSTANTS.TEST_STRING);
		assertEquals(CONSTANTS.TEST_STRING, uCon.removeGame(CONSTANTS.TEST_LONG));
	} 
	
}
