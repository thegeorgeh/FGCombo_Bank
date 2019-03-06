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
import com.qa.InProject.Business.service.UserServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.User;
import com.qa.InProject.REST.UserController;

@RunWith(MockitoJUnitRunner.class)
public class UserRESTTest {
	private static final String testString = "test";
	private static final String testUserName = "username";
	private static final String testUserPassword = "password";
	private static final Long testLong = 1L;
	@InjectMocks
	UserController uCon;

	@Mock
	UserServiceImpl svc;

	@Mock
	User user;

	@Before
	public void setup() {
//		uCon.svc;
	}

	@Test
	public void testGetAllUsers() {
		List<User> MOCK_LIST = Arrays.asList(user, user, user);
		Mockito.when(svc.getAllUsers()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, uCon.getAllUsers());
	}

	@Test
	public void testGetAUser() {
		User MOCK_OBJECT = new User();
		Mockito.when(svc.getUser(testLong)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(Optional.of(MOCK_OBJECT), uCon.getUser(testLong));
	}

	@Test
	public void testUpdateAUser() {
		Mockito.when(svc.updateUser(testLong)).thenReturn(testString);
		assertEquals(testString, uCon.updateUser(testLong));
	}

	@Test
	public void testDeleteUser() {
		Mockito.when(svc.removeUser(testLong)).thenReturn(testString);
		assertEquals(testString, uCon.removeUser(testLong));
	} 
	
}
	


