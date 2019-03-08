package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import com.qa.InProject.persistence.Domain.*;

public interface ComboService {
	public Combo addCombo(Long playerID, String comboName, String comboInput);
	public Optional<Combo> getCombo(Long comboID);
	public List<Combo> getAllCombos();
	public String removeCombo(Long comboID);
	public String updateCombo(Long comboID);
}
