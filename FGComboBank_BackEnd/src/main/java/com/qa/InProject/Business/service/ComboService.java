package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import com.qa.InProject.persistence.Domain.*;

public interface ComboService {
	public Combo addCombo(String playerName, String comboName, String comboInput);
	public Optional<Combo> getCombo(Long comboId);
	public List<Combo> getAllCombos();
	public String removeCombo(Long comboId);
	public String updateCombo(Long comboId);
}
