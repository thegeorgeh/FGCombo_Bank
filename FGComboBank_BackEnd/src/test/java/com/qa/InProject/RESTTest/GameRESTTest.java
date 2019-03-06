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

//import com.qa.business.AlgorithmServiceImpl;
import com.qa.InProject.Business.service.GameServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.Game;
import com.qa.InProject.REST.GameController;

@RunWith(MockitoJUnitRunner.class)
public class GameRESTTest {
	private static final String testString = "test";
	private static final String testGameName = "gamename";
	private static final String testPlayer = "player";
	private static final Long testLong = 1L;
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
		Mockito.when(svc.getGame(testLong)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(Optional.of(MOCK_OBJECT), uCon.getGame(testLong));
	}

	@Test
	public void testUpdateAGame() {
		Mockito.when(svc.updateGame(testLong)).thenReturn(testString);
		assertEquals(testString, uCon.updateGame(testLong));
	}

	@Test
	public void testDeleteGame() {
		Mockito.when(svc.removeGame(testLong)).thenReturn(testString);
		assertEquals(testString, uCon.removeGame(testLong));
	} 
	
}
