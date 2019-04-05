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

import com.qa.InProject.CONSTANTS;
import com.qa.InProject.Business.service.ComboServiceImpl;
import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Repository.ComboRepository;

@RunWith(MockitoJUnitRunner.class)
public class ComboBusinessTest {

	@InjectMocks
	ComboServiceImpl svc;

	@Mock
	ComboRepository repo;

	@Mock
	Combo Combo;

	@Before
	public void setup() {

	}

	@Test
	public void testGetAllCombos() {
		List<Combo> MOCK_LIST = Arrays.asList(Combo, Combo, Combo);
		Mockito.when(repo.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllCombos());
	}

	@Test
	public void testGetACombo() {
		Combo MOCK_OBJECT = new Combo();
		Mockito.when(repo.findById(CONSTANTS.TEST_LONG)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(MOCK_OBJECT, svc.getCombo(CONSTANTS.TEST_LONG));
	}

	@Test
	public void testUpdateCombo() {
//		// TODO add update method
//		Mockito.when(testLong, testString, testString).thenReturn(testString); 
//		 assertEquals(testString, svc.updateCombo(testLong, testString, testString));
	}

	@Test
	public void testDeleteCombo() {
//		Mockito.when(repo.deleteById(testLong));  
//		repo.deleteById(testLong);  

//		Mockito.when();
		// .thenReturn(testString)
//		assertEquals(testString, svc.deleteCombo(testLong));
	}
}
