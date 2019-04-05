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
import com.qa.InProject.Business.service.ComboServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.REST.ComboController;

@RunWith(MockitoJUnitRunner.class)
public class ComboRESTTest {

	@InjectMocks
	ComboController uCon;

	@Mock
	ComboServiceImpl svc;

	@Mock
	Combo combo;

	@Before
	public void setup() {
//		uCon.svc;
	}

	@Test
	public void testGetAllCombos() {
		List<Combo> MOCK_LIST = Arrays.asList(combo, combo, combo);
		Mockito.when(svc.getAllCombos()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, uCon.getAllCombos());
	}

	@Test
	public void testGetACombo() {
		Combo MOCK_OBJECT = new Combo();
		Mockito.when(svc.getCombo(CONSTANTS.TEST_LONG)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, uCon.getCombo(CONSTANTS.TEST_LONG));
	}

	@Test
	public void testUpdateACombo() {
		Mockito.when(svc.updateCombo(CONSTANTS.TEST_LONG, CONSTANTS.TEST_STRING, CONSTANTS.TEST_STRING)).thenReturn(CONSTANTS.TEST_STRING);
		assertEquals(CONSTANTS.TEST_STRING, uCon.updateCombo(CONSTANTS.TEST_LONG, CONSTANTS.TEST_STRING, CONSTANTS.TEST_STRING));
	}

	@Test
	public void testDeleteCombo() {
		Mockito.when(svc.removeCombo(CONSTANTS.TEST_LONG)).thenReturn(CONSTANTS.TEST_STRING);
		assertEquals(CONSTANTS.TEST_STRING, uCon.removeCombo(CONSTANTS.TEST_LONG));
	} 
	
}

