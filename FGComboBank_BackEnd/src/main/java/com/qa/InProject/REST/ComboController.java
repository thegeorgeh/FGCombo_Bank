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

	@RequestMapping("/addCombo/{comboName}")

	public Combo addCombo(@PathVariable String comboName) {
		Combo result = svc.addCombo(comboName);

		return result;
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