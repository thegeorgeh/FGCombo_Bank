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
import com.qa.InProject.Business.service.PlayerServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.Player;
import com.qa.InProject.REST.PlayerController;

@RunWith(MockitoJUnitRunner.class)
public class PlayerRESTTest {

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
		Mockito.when(svc.getPlayer(CONSTANTS.TEST_LONG)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, uCon.getPlayer(CONSTANTS.TEST_LONG));
	}

	@Test
	public void testUpdateAPlayer() {
		Mockito.when(svc.updatePlayer(CONSTANTS.TEST_LONG, CONSTANTS.TEST_STRING)).thenReturn(CONSTANTS.TEST_STRING);
		assertEquals(CONSTANTS.TEST_STRING, uCon.updatePlayer(CONSTANTS.TEST_LONG, CONSTANTS.TEST_STRING));
	}

	@Test
	public void testDeletePlayer() {
		Mockito.when(svc.removePlayer(CONSTANTS.TEST_LONG)).thenReturn(CONSTANTS.TEST_STRING);
		assertEquals(CONSTANTS.TEST_STRING, uCon.removePlayer(CONSTANTS.TEST_LONG));
	} 
	
}

