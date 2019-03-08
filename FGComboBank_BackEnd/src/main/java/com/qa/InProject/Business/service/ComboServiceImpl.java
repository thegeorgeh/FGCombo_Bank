package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.Combo;
import com.qa.InProject.persistence.Repository.ComboRepository;


@Service
public class ComboServiceImpl implements ComboService {

	@Autowired
	private ComboRepository repo;	
	
	@Override
	public Combo addCombo(Long playerID, String comboName, String comboInput) {
		Combo combo = new Combo();
		combo.setPlayerID(playerID);
		combo.setComboName(comboName);
		combo.setcomboInput(comboInput);
		
		return repo.save(combo);
	}

	@Override
	public List<Combo> getAllCombos() {
		return repo.findAll();
	}

	@Override
	public Optional<Combo> getCombo(Long comboID) {
		return repo.findById(comboID);
	}

	@Override
	public String updateCombo(Long comboID) {
		repo.findById(comboID);
		return null;
	}

	@Override
	public String removeCombo(Long comboID) {
		repo.findById(comboID);
		return null;
	}
	
	public void setRepo(ComboRepository repo)
	{
		this.repo = repo;
	}
 
} 

