package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bloodstock")
public class BloodStock {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bloodgroup",columnDefinition = "text", nullable = false, updatable = false)
	private String bloodgroup;
	
	@Column(name="quantity")
	private int quantity;
	
	public BloodStock() {
		// TODO Auto-generated constructor stub
	}
	
	public BloodStock(String bloodgrp, int quantity) {
		this.bloodgroup=bloodgrp;
		this.quantity=quantity;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgrp) {
		this.bloodgroup = bloodgrp;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
