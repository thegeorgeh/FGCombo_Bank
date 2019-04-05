package com.qa.InProject.DomainTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.InProject.CONSTANTS;
import com.qa.InProject.Business.service.ComboService;
import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Repository.ComboRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class ComboDomainTest {
	


    @Before
    public void setUp(){

    }
	
	@Test
	public void updateCombo_WithValidInput_ShouldReturnUpdatedInput() {
	    
	    CONSTANTS.COMBO_MOCK_OBJECT.setPlayerID(CONSTANTS.TEST_LONG);
	    CONSTANTS.COMBO_MOCK_OBJECT.setComboName(CONSTANTS.TEST_STRING);
	    CONSTANTS.COMBO_MOCK_OBJECT.setComboID(CONSTANTS.TEST_LONG);
	    CONSTANTS.COMBO_MOCK_OBJECT.setComboDamage(CONSTANTS.TEST_INT);
	    CONSTANTS.COMBO_MOCK_OBJECT.setComboInput(CONSTANTS.TEST_STRING);
	    
	    assertEquals(CONSTANTS.TEST_LONG, CONSTANTS.COMBO_MOCK_OBJECT.getPlayerID());
	    assertEquals(CONSTANTS.TEST_LONG, CONSTANTS.COMBO_MOCK_OBJECT.getComboID());
	    assertEquals(CONSTANTS.TEST_STRING, CONSTANTS.COMBO_MOCK_OBJECT.getComboName());
	    assertEquals(CONSTANTS.TEST_INT, CONSTANTS.COMBO_MOCK_OBJECT.getComboDamage());
	    assertEquals(CONSTANTS.TEST_STRING, CONSTANTS.COMBO_MOCK_OBJECT.getComboInput());

	}
}
