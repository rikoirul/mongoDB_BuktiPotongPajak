package com.muf.mp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BulanModel {
	private String bulan;

	public String getBulan() {
		return bulan;
	}
	@JsonProperty("BULAN_POTONG")
	public void setBulan(String bulan) {
		this.bulan = bulan;
	}
	
}
