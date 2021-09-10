package com.muf.mp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Data 
@Document (collection = "BuktiPotongPajak")
public class ListBuktiPotongModel3 {
	@Id
	private String id;
	private String TAHUN_PAJAK;
	private String MASA_PAJAK;
	private String NOMOR_BUPOT;
	private String IDENTITAS_DIPOTONG;
	private String NAMA_DIPOTONG;
	private String NAMA_FILE;
	private String DEALER_CODE;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTAHUN_PAJAK() {
		return TAHUN_PAJAK;
	}
	@JsonProperty("TAHUN_PAJAK")
	public void setTAHUN_PAJAK(String tAHUN_PAJAK) {
		TAHUN_PAJAK = tAHUN_PAJAK;
	}
	public String getMASA_PAJAK() {
		return MASA_PAJAK;
	}
	@JsonProperty("MASA_PAJAK")
	public void setMASA_PAJAK(String mASA_PAJAK) {
		MASA_PAJAK = mASA_PAJAK;
	}
	public String getNOMOR_BUPOT() {
		return NOMOR_BUPOT;
	}
	@JsonProperty("NOMOR_BUPOT")
	public void setNOMOR_BUPOT(String nOMOR_BUPOT) {
		NOMOR_BUPOT = nOMOR_BUPOT;
	}
	public String getIDENTITAS_DIPOTONG() {
		return IDENTITAS_DIPOTONG;
	}
	@JsonProperty("IDENTITAS_DIPOTONG")
	public void setIDENTITAS_DIPOTONG(String iDENTITAS_DIPOTONG) {
		IDENTITAS_DIPOTONG = iDENTITAS_DIPOTONG;
	}
	public String getNAMA_DIPOTONG() {
		return NAMA_DIPOTONG;
	}
	@JsonProperty("NAMA_DIPOTONG")
	public void setNAMA_DIPOTONG(String nAMA_DIPOTONG) {
		NAMA_DIPOTONG = nAMA_DIPOTONG;
	}
	public String getNAMA_FILE() {
		return NAMA_FILE;
	}
	@JsonProperty("NAMA_FILE")
	public void setNAMA_FILE(String nAMA_FILE) {
		NAMA_FILE = nAMA_FILE;
	}
	public String getDEALER_CODE() {
		return DEALER_CODE;
	}
	@JsonProperty("DEALER_CODE")
	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
	}
	
	
}
