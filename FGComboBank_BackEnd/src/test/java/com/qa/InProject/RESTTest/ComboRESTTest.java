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
import com.qa.InProject.Business.service.ComboServiceImpl;
//import com.qa.persistence.domain.Algorithm;
import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.REST.ComboController;

@RunWith(MockitoJUnitRunner.class)
public class ComboRESTTest {
	private static final String testString = "test";
	private static final String testComboName = "comboname";
	private static final String testPlayer = "player";
	private static final Long testLong = 1L;
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
		Mockito.when(svc.getCombo(testLong)).thenReturn(MOCK_OBJECT);
		assertEquals(Optional.of(MOCK_OBJECT), uCon.getCombo(testLong));
	}

	@Test
	public void testUpdateACombo() {
		Mockito.when(svc.updateCombo(testLong, testComboName, testComboName)).thenReturn(testString);
		assertEquals(testString, uCon.updateCombo(testLong, testComboName, testComboName));
	}

	@Test
	public void testDeleteCombo() {
		Mockito.when(svc.removeCombo(testLong)).thenReturn(testString);
		assertEquals(testString, uCon.removeCombo(testLong));
	} 
	
}

