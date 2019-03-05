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
		String playerName = "Name";
	    Long comboId = 1L;
	    String comboName = "Name";
	    int comboDamage = 37;
	    String comboInput = "Input";
	    
	 
	    Combo combo = new Combo();
	    combo.setPlayerName(playerName);
	    combo.setComboName(comboName);
	    combo.setId(comboId);
	    combo.setcomboDamage(comboDamage);
	    combo.setcomboInput(comboInput);
	    
	    assertEquals(playerName, combo.getPlayerName());
	    assertEquals(comboId, combo.getId());
	    assertEquals(comboName, combo.getComboName());
	    assertEquals(comboDamage, combo.getcomboDamage());
	    assertEquals(comboInput, combo.getcomboInput());

	}
}
