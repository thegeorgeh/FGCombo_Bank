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

import com.qa.InProject.Business.service.UserServiceImpl;
import com.qa.InProject.persistence.Domain.User;
import com.qa.InProject.persistence.Repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserBusinessTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	@InjectMocks
	UserServiceImpl svc;

	@Mock
	UserRepository repo;

	@Mock
	User User;

	@Before
	public void setup() {

	}

	@Test
	public void testGetAllUsers() {
		List<User> MOCK_LIST = Arrays.asList(User, User, User);
		Mockito.when(repo.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllUsers());
	}

	@Test
	public void testGetAUser() {
		User MOCK_OBJECT = new User();
		Mockito.when(repo.findById(testLong)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(Optional.of(MOCK_OBJECT), svc.getUser(testLong));
	}

	@Test
	public void testUpdateUser() {
//		 TODO add update method
//		Mockito.when(testString).thenReturn(testString); 
//		 assertEquals(testString, svc.updateUser(testLong));
	}

	@Test
	public void testDeleteUser() {
////		Mockito.when(repo.deleteById(testLong));  
////		repo.deleteById(testLong);  
//
////		Mockito.when();
//		// .thenReturn(testString)
//		assertEquals(testString, svc.deleteUser(testLong));
	}
}
