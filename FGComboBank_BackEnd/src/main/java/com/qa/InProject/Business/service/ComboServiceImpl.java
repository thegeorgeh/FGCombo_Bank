package com.qa.InProject.Business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Repository.ComboRepository;



@Service
public class ComboServiceImpl implements ComboService {

	private ComboRepository repo;	
	
	public ComboServiceImpl(ComboRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public Combo addCombo(Long playerID, String comboName, String comboInput) {
		Combo combo = new Combo();
		combo.setPlayerID(playerID);
		combo.setComboName(comboName);
		combo.setComboInput(comboInput);
		
		return repo.save(combo);
	}

	@Override
	public List<Combo> getAllCombos() {
		return repo.findAll();
	}

	@Override
	public Combo getCombo(Long comboID) {
		return repo.findById(comboID).get();
	}

	@Override
	public String updateCombo(Long comboID, String comboName, String comboInput) {
		Combo combo = getCombo(comboID);
		combo.setComboName(comboName);
		combo.setComboInput(comboInput);
	
		repo.save(combo);
		return "User " + comboID + " updated";
	}

	@Override
	public String removeCombo(Long comboID) {
		repo.deleteById(comboID);
		return "Combo "+comboID+" deleted";
	}
	
	public void setRepo(ComboRepository repo)
	{
		this.repo = repo;
	}
 
} 

