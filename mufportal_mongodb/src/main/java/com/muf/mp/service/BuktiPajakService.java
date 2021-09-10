package com.muf.mp.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.muf.mp.model.BulanModel;
import com.muf.mp.model.ListBuktiPotongModel;
import com.muf.mp.model.ListBuktiPotongModel2;
import com.muf.mp.model.ListBuktiPotongModel3;
import com.muf.mp.model.NpwpModel;
import com.muf.mp.model.TahunModel;
import com.muf.mp.repository.BuktiPajakRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuktiPajakService {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	private final BuktiPajakRepository buktiPajakRepository;
	
	public BuktiPajakService(BuktiPajakRepository buktiPajakRepository) {
		this.buktiPajakRepository = buktiPajakRepository;
	}
	
	public List<ListBuktiPotongModel> getAllBuktiPotong(){
		return buktiPajakRepository.findAll();
	}
	
	public List<NpwpModel> getNomorNPWP(String dealerCode){
		List<NpwpModel> hasil = new ArrayList<NpwpModel>();
		Query query = new Query();
		//column dlc belum ada. test menggunakan nama
		query.addCriteria(Criteria.where("DEALER CODE").is(dealerCode));
		List<String> result = mongoTemplate.getCollection("BuktiPotongPajak").distinct("IDENTITAS DIPOTONG", query.getQueryObject());
		for (int i=0; i<result.size(); i++){
			NpwpModel npwpModel = new NpwpModel();
			System.out.println(result.get(i));
			if (result.get(i) == ""){
				npwpModel.setNO_NPWP("KOSONG");
			} else {
				npwpModel.setNO_NPWP(result.get(i));
			}
			hasil.add(npwpModel);
		}	
		return hasil;
	}
	
	public List<TahunModel> getTahunPotong(String dealerCode, String npwp){
		List<TahunModel> hasil = new ArrayList<TahunModel>();
		Query query = new Query();
		//column dlc belum ada. test menggunakan nama
		query.addCriteria(Criteria.where("DEALER CODE").is(dealerCode).and("IDENTITAS DIPOTONG").is(npwp));
		List<String> result = mongoTemplate.getCollection("BuktiPotongPajak").distinct("TAHUN PAJAK", query.getQueryObject());
		for (int i=0; i<result.size(); i++){
			TahunModel tahunModel = new TahunModel();
			System.out.println(result.get(i));
			if (result.get(i) == ""){
				tahunModel.setTahun("KOSONG");
			} else {
				tahunModel.setTahun(result.get(i));
			}
			hasil.add(tahunModel);
		}	
		return hasil;
	}
	
	public List<BulanModel> getBulanPotong(String dealerCode, String npwp, String tahun){
		List<BulanModel> hasil = new ArrayList<BulanModel>();
		Query query = new Query();
		//column dlc belum ada. test menggunakan nama
		query.addCriteria(Criteria.where("DEALER CODE").is(dealerCode).and("IDENTITAS DIPOTONG").is(npwp).and("TAHUN PAJAK").is(tahun));
		List<String> result = mongoTemplate.getCollection("BuktiPotongPajak").distinct("MASA PAJAK", query.getQueryObject());
		for (int i=0; i<result.size(); i++){
			BulanModel bulanModel = new BulanModel();
			System.out.println(result.get(i));
			if (result.get(i) == ""){
				bulanModel.setBulan("KOSONG");
			} else {
				bulanModel.setBulan(result.get(i));
			}
			hasil.add(bulanModel);
		}	
		return hasil;
	}
	
	public List<ListBuktiPotongModel> cariBuktiPotong(String noNpwp, String tahun, String bulan){
		Query query = new Query();
		query.addCriteria(Criteria.where("IDENTITAS_DIPOTONG").is(noNpwp).and("TAHUN_PAJAK").is(tahun).and("MASA_PAJAK").is(bulan));
		List<ListBuktiPotongModel> result = mongoTemplate.find(query, ListBuktiPotongModel.class);
		return result;
	}
	
	public List<ListBuktiPotongModel2> cariBuktiPotong2(String noNpwp, String tahun, String bulan){
		Query query = new Query();
		query.addCriteria(Criteria.where("IDENTITAS DIPOTONG").is(noNpwp).and("TAHUN PAJAK").is(tahun).and("MASA PAJAK").is(bulan));
		List<ListBuktiPotongModel2> result = mongoTemplate.find(query, ListBuktiPotongModel2.class);
		return result;
	}
	
	public List<ListBuktiPotongModel3> cariBuktiPotong3(String noNpwp, String tahun, String bulan){
		Query query = new Query();
		List<ListBuktiPotongModel3> result = new ArrayList<ListBuktiPotongModel3>();
		query.addCriteria(Criteria.where("IDENTITAS DIPOTONG").is(noNpwp).and("TAHUN PAJAK").is(tahun).and("MASA PAJAK").is(bulan));
		List<ListBuktiPotongModel2> model = mongoTemplate.find(query, ListBuktiPotongModel2.class);
		for (int i=0;i<model.size();i++){
			ListBuktiPotongModel3 data = new ListBuktiPotongModel3();
			data.setId(model.get(i).getId());
			data.setDEALER_CODE(model.get(i).getDEALER_CODE());
			data.setTAHUN_PAJAK(model.get(i).getTAHUN_PAJAK());
			data.setMASA_PAJAK(model.get(i).getMASA_PAJAK());
			data.setNOMOR_BUPOT(model.get(i).getNOMOR_BUPOT());
			data.setIDENTITAS_DIPOTONG(model.get(i).getIDENTITAS_DIPOTONG());
			data.setNAMA_DIPOTONG(model.get(i).getNAMA_DIPOTONG());
			data.setNAMA_FILE(model.get(i).getNOMOR_BUPOT()+"_"+model.get(i).getIDENTITAS_DIPOTONG());
			result.add(data);
		}
		return result;
	}

	
}
