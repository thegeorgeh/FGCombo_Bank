package com.qa.InProject.REST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.InProject.Business.service.ComboServiceImpl;
import com.qa.InProject.persistence.Domain.Combo;

@RestController
public class ComboController {

	@Autowired
	public ComboServiceImpl svc;

	@RequestMapping("/addCombo/{playerName}/{comboName}/{comboInput}")
	public Combo addCombo(@PathVariable String playerName, @PathVariable String comboName, @PathVariable String comboInput) {
		Combo result = svc.addCombo(playerName, comboName, comboInput);

		return result;
	}
	
	@RequestMapping("/updateCombo/{comboId}")
	public String updateCombo(@PathVariable Long comboId) {
		return svc.updateCombo(comboId);
	}


	@RequestMapping("/getCombo/{comboID}")
	public Optional<Combo> getCombo(@PathVariable Long comboID) {

		return svc.getCombo(comboID);
	}

	@RequestMapping("/getAllCombos")
	public List<Combo> getAllCombos() {
		List<Combo> allClasses = svc.getAllCombos();

		return allClasses;
	}

	@RequestMapping("/removeCombo/{comboID}")
	public String removeCombo(@PathVariable Long comboID) {
		return svc.removeCombo(comboID);
	}

}