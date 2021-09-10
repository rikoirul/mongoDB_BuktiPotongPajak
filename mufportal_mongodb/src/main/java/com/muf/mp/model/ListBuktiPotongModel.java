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
@Document (collection = "test")
public class ListBuktiPotongModel {
	@Id
	private String id;
	private String JENIS_PPH;
	private String TAHUN_PAJAK;
	private String MASA_PAJAK;
	private String NOMOR_BUPOT;
	private String IDENTITAS_DIPOTONG;
	private String JENIS_IDENTITAS_DIPOTONG;
	private String NAMA_DIPOTONG;
	private String KODE_OBJEK_PAJAK;
	private BigDecimal JUMLAH_BRUTO;
	private BigDecimal PPH_DIPOTONG;
	private String STATUS_BUKTI_POTONG;
	private int PEMB_KE;
	private String NAMA_DOK_REF;
	private String NOMOR_DOK_REF;
	private Date TGL_DOK_REF;
	private String STATUS_PELAPORAN;
	
	public ListBuktiPotongModel(String JENIS_PPH, String TAHUN_PAJAK, String MASA_PAJAK, String NOMOR_BUPOT,
			String IDENTITAS_DIPOTONG, String JENIS_IDENTITAS_DIPOTONG, String NAMA_DIPOTONG, String KODE_OBJEK_PAJAK, BigDecimal JUMLAH_BRUTO,
			BigDecimal PPH_DIPOTONG, String STATUS_BUKTI_POTONG, int PEMB_KE, String NAMA_DOK_REF, String NOMOR_DOK_REF,
			Date TGL_DOK_REF, String STATUS_PELAPORAN) {
		this.JENIS_PPH = JENIS_PPH;
		this.TAHUN_PAJAK = TAHUN_PAJAK;
		this.MASA_PAJAK = MASA_PAJAK;
		this.NOMOR_BUPOT = NOMOR_BUPOT;
		this.IDENTITAS_DIPOTONG = IDENTITAS_DIPOTONG;
		this.JENIS_IDENTITAS_DIPOTONG = JENIS_IDENTITAS_DIPOTONG;
		this.NAMA_DIPOTONG = NAMA_DIPOTONG;
		this.KODE_OBJEK_PAJAK = KODE_OBJEK_PAJAK;
		this.JUMLAH_BRUTO = JUMLAH_BRUTO;
		this.PPH_DIPOTONG = PPH_DIPOTONG;
		this.STATUS_BUKTI_POTONG = STATUS_BUKTI_POTONG;
		this.PEMB_KE = PEMB_KE;
		this.NAMA_DOK_REF = NAMA_DOK_REF;
		this.NOMOR_DOK_REF = NOMOR_DOK_REF;
		this.TGL_DOK_REF = TGL_DOK_REF;
		this.STATUS_PELAPORAN = STATUS_PELAPORAN;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJENIS_PPH() {
		return JENIS_PPH;
	}
	@JsonProperty("JENIS_PPH")
	public void setJENIS_PPH(String jENIS_PPH) {
		JENIS_PPH = jENIS_PPH;
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
	public String getJENIS_IDENTITAS_DIPOTONG() {
		return JENIS_IDENTITAS_DIPOTONG;
	}
	@JsonProperty("JENIS_IDENTITAS_DIPOTONG")
	public void setJENIS_IDENTITAS_DIPOTONG(String jENIS_IDENTITAS_DIPOTONG) {
		JENIS_IDENTITAS_DIPOTONG = jENIS_IDENTITAS_DIPOTONG;
	}
	public String getNAMA_DIPOTONG() {
		return NAMA_DIPOTONG;
	}
	@JsonProperty("NAMA_DIPOTONG")
	public void setNAMA_DIPOTONG(String nAMA_DIPOTONG) {
		NAMA_DIPOTONG = nAMA_DIPOTONG;
	}
	public String getKODE_OBJEK_PAJAK() {
		return KODE_OBJEK_PAJAK;
	}
	@JsonProperty("OBJEK_PAJAK")
	public void setKODE_OBJEK_PAJAK(String kODE_OBJEK_PAJAK) {
		KODE_OBJEK_PAJAK = kODE_OBJEK_PAJAK;
	}
	public BigDecimal getJUMLAH_BRUTO() {
		return JUMLAH_BRUTO;
	}
	@JsonProperty("JUMLAH_BRUTO")
	public void setJUMLAH_BRUTO(BigDecimal jUMLAH_BRUTO) {
		JUMLAH_BRUTO = jUMLAH_BRUTO;
	}
	public BigDecimal getPPH_DIPOTONG() {
		return PPH_DIPOTONG;
	}
	@JsonProperty("PPH_DIPOTONG")
	public void setPPH_DIPOTONG(BigDecimal pPH_DIPOTONG) {
		PPH_DIPOTONG = pPH_DIPOTONG;
	}
	public String getSTATUS_BUKTI_POTONG() {
		return STATUS_BUKTI_POTONG;
	}
	@JsonProperty("STATUS_BUKTI_POTONG")
	public void setSTATUS_BUKTI_POTONG(String sTATUS_BUKTI_POTONG) {
		STATUS_BUKTI_POTONG = sTATUS_BUKTI_POTONG;
	}
	public int getPEMB_KE() {
		return PEMB_KE;
	}
	@JsonProperty("PEMB_KE")
	public void setPEMB_KE(int pEMB_KE) {
		PEMB_KE = pEMB_KE;
	}
	public String getNAMA_DOK_REF() {
		return NAMA_DOK_REF;
	}
	@JsonProperty("NAMA_DOK_REF")
	public void setNAMA_DOK_REF(String nAMA_DOK_REF) {
		NAMA_DOK_REF = nAMA_DOK_REF;
	}
	public String getNOMOR_DOK_REF() {
		return NOMOR_DOK_REF;
	}
	@JsonProperty("NOMOR_DOK_REF")
	public void setNOMOR_DOK_REF(String nOMOR_DOK_REF) {
		NOMOR_DOK_REF = nOMOR_DOK_REF;
	}
	public Date getTGL_DOK_REF() {
		return TGL_DOK_REF;
	}
	@JsonProperty("TGL_DOK_REF")
	public void setTGL_DOK_REF(Date tGL_DOK_REF) {
		TGL_DOK_REF = tGL_DOK_REF;
	}
	public String getSTATUS_PELAPORAN() {
		return STATUS_PELAPORAN;
	}
	@JsonProperty("STATUS_PELAPORAN")
	public void setSTATUS_PELAPORAN(String sTATUS_PELAPORAN) {
		STATUS_PELAPORAN = sTATUS_PELAPORAN;
	}
	


	
	
	
	
/*	public ListBuktiPotongModel(String firstName, String lastName, String email, Gender gender, Address address,
			List<String> favoriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.favoriteSubjects = favoriteSubjects;
		this.totalSpentInBooks = totalSpentInBooks;
		this.created = created;
	}*/
	
	
	
	
}
