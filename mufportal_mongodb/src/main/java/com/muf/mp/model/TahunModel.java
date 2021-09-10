package com.muf.mp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TahunModel {
	private String Tahun;

	public String getTahun() {
		return Tahun;
	}
	@JsonProperty("TAHUN_POTONG")
	public void setTahun(String tahun) {
		Tahun = tahun;
	}
	
}
