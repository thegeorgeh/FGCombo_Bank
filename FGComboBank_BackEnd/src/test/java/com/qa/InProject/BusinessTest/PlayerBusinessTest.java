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

import com.qa.InProject.Business.service.PlayerServiceImpl;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.persistence.Repository.PlayerRepository;

@RunWith(MockitoJUnitRunner.class)
public class PlayerBusinessTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	@InjectMocks
	PlayerServiceImpl svc;

	@Mock
	PlayerRepository repo;

	@Mock
	Player Player;

	@Before
	public void setup() {

	}

	@Test
	public void testGetAllPlayers() {
		List<Player> MOCK_LIST = Arrays.asList(Player, Player, Player);
		Mockito.when(repo.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllPlayers());
	}

	@Test
	public void testGetAPlayer() {
		Player MOCK_OBJECT = new Player();
		Mockito.when(repo.findById(testLong)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(MOCK_OBJECT, svc.getPlayer(testLong));
	}

	@Test
	public void testUpdatePlayer() {
//		// TODO add update method
//		Mockito.when(testString).thenReturn(testString); 
//		 assertEquals(testString, svc.updatePlayer(testLong));
	}

	@Test
	public void testDeletePlayer() {
//		Mockito.when(repo.deleteById(testLong));  
//		repo.deleteById(testLong);  

//		Mockito.when();
		// .thenReturn(testString)
//		assertEquals(testString, svc.deletePlayer(testLong));
	}
}
