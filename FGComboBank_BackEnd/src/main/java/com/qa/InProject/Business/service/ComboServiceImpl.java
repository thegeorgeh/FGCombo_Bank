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
	public Combo addCombo(String playerName, String comboName, String comboInput) {
		Combo combo = new Combo();
		combo.setPlayerName(playerName);
		combo.setComboName(comboName);
		combo.setcomboInput(comboInput);
		
		return repo.save(combo);
	}

	@Override
	public List<Combo> getAllCombos() {
		return repo.findAll();
	}

	@Override
	public Optional<Combo> getCombo(Long comboId) {
		return repo.findById(comboId);
	}

	@Override
	public String updateCombo(Long comboId) {
		repo.findById(comboId);
		return null;
	}

	@Override
	public String removeCombo(Long comboId) {
		repo.findById(comboId);
		return null;
	}
	
	public void setRepo(ComboRepository repo)
	{
		this.repo = repo;
	}

}

