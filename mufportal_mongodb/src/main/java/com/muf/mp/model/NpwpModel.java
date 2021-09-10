package com.muf.mp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NpwpModel {
	private String NO_NPWP;

	public String getNO_NPWP() {
		return NO_NPWP;
	}
	
	@JsonProperty("NO_NPWP")
	public void setNO_NPWP(String nO_NPWP) {
		NO_NPWP = nO_NPWP;
	}

	
}
