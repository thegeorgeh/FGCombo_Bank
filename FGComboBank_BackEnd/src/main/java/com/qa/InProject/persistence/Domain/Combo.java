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
	@Column(name = "comboID")
	private Long comboID;
	@Column(name = "playerID")
	private Long playerID;
	@Column(name = "comboName")
	private String comboName;
	@Column(name = "comboInput")
	private String comboInput;
	@Column(name = "comboDamage")
	private int comboDamage;


	public Combo()
	{
		
	}
	
	public Combo(Long playerID, String comboName, String comboInput)
	{
		super();
		this.comboName = comboName;
		this.comboInput = comboInput;
		this.playerID = playerID;
	}


	public Long getID() {
		return comboID;
	}

	public void setID(Long id) {
		this.comboID = id;
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
	
	public Long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(Long playerID) {
		this.playerID = playerID;
	}
}

