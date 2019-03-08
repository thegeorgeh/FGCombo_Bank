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

import com.qa.InProject.Business.service.ComboService;
import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Repository.ComboRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class ComboDomainTest {
	
	@Mock(name="comboRepository")
    private ComboRepository comboRepo;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void updateCombo_WithValidInput_ShouldReturnUpdatedInput() {
		Long playerID = 1L;
	    Long comboID = 1L;
	    String comboName = "Name";
	    int comboDamage = 37;
	    String comboInput = "Input";
	    
	 
	    Combo combo = new Combo();
	    combo.setPlayerID(playerID);
	    combo.setComboName(comboName);
	    combo.setComboID(comboID);
	    combo.setComboDamage(comboDamage);
	    combo.setComboInput(comboInput);
	    
	    assertEquals(playerID, combo.getPlayerID());
	    assertEquals(comboID, combo.getComboID());
	    assertEquals(comboName, combo.getComboName());
	    assertEquals(comboDamage, combo.getComboDamage());
	    assertEquals(comboInput, combo.getComboInput());

	}
}
