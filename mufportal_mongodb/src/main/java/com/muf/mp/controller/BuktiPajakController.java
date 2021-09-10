package com.muf.mp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muf.mp.model.Body;
import com.muf.mp.model.BulanModel;
import com.muf.mp.model.ListBuktiPotongModel;
import com.muf.mp.model.ListBuktiPotongModel2;
import com.muf.mp.model.ListBuktiPotongModel3;
import com.muf.mp.model.NpwpModel;
import com.muf.mp.model.TahunModel;
import com.muf.mp.service.BuktiPajakService;

import lombok.AllArgsConstructor;

@RestController
public class BuktiPajakController {
	public static final Logger logger = LoggerFactory.getLogger(BuktiPajakController.class);

	private final BuktiPajakService buktiPajakService;

	public BuktiPajakController(BuktiPajakService buktiPajakService) {
		this.buktiPajakService = buktiPajakService;
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
	public List<ListBuktiPotongModel> getAllBuktiPotong() {
		return buktiPajakService.getAllBuktiPotong();
	}

	@CrossOrigin
	@RequestMapping(value = "/getNomorNPWP", method = RequestMethod.POST)
	public List<NpwpModel> getNomorNPWP(@RequestBody Body body) {
		return buktiPajakService.getNomorNPWP(body.getDealer_code());
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getTahunPotong", method = RequestMethod.POST)
	public List<TahunModel> getTahunPotong(@RequestBody Body body) {
		return buktiPajakService.getTahunPotong(body.getDealer_code(), body.getNPWP());
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getBulanPotong", method = RequestMethod.POST)
	public List<BulanModel> getBulanPotong(@RequestBody Body body) {
		return buktiPajakService.getBulanPotong(body.getDealer_code(), body.getNPWP(), body.getTahun());
	}

	// collection: test
/*	@RequestMapping(value = "/cariBuktiPotong", method = RequestMethod.POST)
	public List<ListBuktiPotongModel> getName(@RequestBody Body body) {
		return buktiPajakService.cariBuktiPotong(body.getNPWP(), body.getTahun(), body.getBulan());
	}*/

	@CrossOrigin
	@RequestMapping(value = "/cariBuktiPotong2", method = RequestMethod.POST)
	public List<ListBuktiPotongModel2> getNamed(@RequestBody Body body) {
		return buktiPajakService.cariBuktiPotong2(body.getNPWP(), body.getTahun(), body.getBulan());
	}
	
	@CrossOrigin
	@RequestMapping(value = "/cariBuktiPotong", method = RequestMethod.POST)
	public List<ListBuktiPotongModel3> cariBuktiPotong3(@RequestBody Body body) {
		return buktiPajakService.cariBuktiPotong3(body.getNPWP(), body.getTahun(), body.getBulan());
	}


}
