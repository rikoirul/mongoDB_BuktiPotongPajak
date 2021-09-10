package com.muf.mp.model;

import lombok.Data;

@Data
public class Body {
	private String NAME;
	private String NPWP;
	private String lastName;
	private String tahun;
	private String bulan;
	private String dealer_code;
	
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getNPWP() {
		return NPWP;
	}
	public void setNPWP(String nPWP) {
		NPWP = nPWP;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTahun() {
		return tahun;
	}
	public void setTahun(String tahun) {
		this.tahun = tahun;
	}
	public String getBulan() {
		return bulan;
	}
	public void setBulan(String bulan) {
		this.bulan = bulan;
	}
	public String getDealer_code() {
		return dealer_code;
	}
	public void setDealer_code(String dealer_code) {
		this.dealer_code = dealer_code;
	}
	
	
}
