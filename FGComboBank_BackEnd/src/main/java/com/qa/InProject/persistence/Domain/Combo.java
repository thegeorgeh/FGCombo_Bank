package com.qa.InProject.persistence.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Combo {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "playerName")
	private String playerName;
	@Column(name = "comboId")
	private Long comboId;
	@Column(name = "comboName")
	private String comboName;
	@Column(name = "comboInput")
	private String comboInput;
	@Column(name = "comboDamage")
	private int comboDamage;


	public Combo()
	{
		
	}
	
	public Combo(String playerName, String comboName, String comboInput)
	{
		super();
		this.comboName = comboName;
		this.comboInput = comboInput;
		this.playerName = playerName;
	}


	public Long getId() {
		return comboId;
	}

	public void setId(Long id) {
		this.comboId = id;
	}

	public String getComboName() {
		return comboName;
	}

	public void setComboName(String comboName) {
		this.comboName = comboName;
	}
	
	public String getcomboInput() {
		return comboInput;
	}

	public void setcomboInput(String comboInput) {
		this.comboInput = comboInput;
	}

	public int getcomboDamage() {
		return comboDamage;
	}

	public void setcomboDamage(int comboDamage) {
		this.comboDamage = comboDamage;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}

