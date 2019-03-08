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
import com.qa.InProject.Business.service.PlayerServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.REST.PlayerController;

@RunWith(MockitoJUnitRunner.class)
public class PlayerRESTTest {
	private static final String testString = "test";
	private static final String testPlayerName = "playername";
	private static final String testPlayer = "player";
	private static final Long testLong = 1L;
	@InjectMocks
	PlayerController uCon;

	@Mock
	PlayerServiceImpl svc;

	@Mock
	Player player;

	@Before
	public void setup() {
//		uCon.svc;
	}

	@Test
	public void testGetAllPlayers() {
		List<Player> MOCK_LIST = Arrays.asList(player, player, player);
		Mockito.when(svc.getAllPlayers()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, uCon.getAllPlayers());
	}

	@Test
	public void testGetAPlayer() {
		Player MOCK_OBJECT = new Player();
		Mockito.when(svc.getPlayer(testLong)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, uCon.getPlayer(testLong));
	}

	@Test
	public void testUpdateAPlayer() {
		Mockito.when(svc.updatePlayer(testLong, testPlayerName)).thenReturn(testString);
		assertEquals(testString, uCon.updatePlayer(testLong, testPlayerName));
	}

	@Test
	public void testDeletePlayer() {
		Mockito.when(svc.removePlayer(testLong)).thenReturn(testString);
		assertEquals(testString, uCon.removePlayer(testLong));
	} 
	
}

