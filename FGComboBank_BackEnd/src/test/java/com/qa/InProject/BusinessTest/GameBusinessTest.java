package com.qa.InProject.BusinessTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.InProject.Business.service.GameServiceImpl;
import com.qa.InProject.persistence.Domain.Game;
import com.qa.InProject.persistence.Repository.GameRepository;

@RunWith(MockitoJUnitRunner.class)
public class GameBusinessTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	@InjectMocks
	GameServiceImpl svc;

	@Mock
	GameRepository repo;

	@Mock
	Game Game;

	@Before
	public void setup() {

	}

	@Test
	public void testGetAllGames() {
		List<Game> MOCK_LIST = Arrays.asList(Game, Game, Game);
		Mockito.when(repo.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllGames());
	}

	@Test
	public void testGetAGame() {
		Game MOCK_OBJECT = new Game();
		Mockito.when(repo.findById(testLong)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(MOCK_OBJECT, svc.getGame(testLong));
	}

	@Test
	public void testUpdateGame() {
//		// TODO add update method
//		Mockito.when(testString).thenReturn(testString); 
//		 assertEquals(testString, svc.updateGame(testLong));
	}

	@Test
	public void testDeleteGame() {
//		Mockito.when(repo.deleteById(testLong));  
//		repo.deleteById(testLong);  

//		Mockito.when();
		// .thenReturn(testString)
//		assertEquals(testString, svc.deleteGame(testLong));
	}
}