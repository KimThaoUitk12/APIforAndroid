package com.example.api_cho_android.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_cho_android.converter.BaiHatConverter;
import com.example.api_cho_android.converter.CaSiConverter;
import com.example.api_cho_android.dto.BaiHatDto;
import com.example.api_cho_android.dto.CaSiDto;
import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.service.BaiHatService;

@RestController
@RequestMapping("/api")
public class BaiHatRestController {

	@Autowired
	private BaiHatService baiHatService;
	
	@Autowired
	private BaiHatConverter baiHatConverter;
	
	@Autowired
	private CaSiConverter caSiConverter;
	
	@GetMapping("/baihat/find-all")
	public List<BaiHatDto> findAllBaiHat(){
		List<BaiHat> listBaiHat=  new ArrayList<BaiHat>();
		listBaiHat = baiHatService.findAll();
		return baiHatConverter.convertToDto(listBaiHat);
	}
	@GetMapping("/baihat/find-bxh")
	public List<BaiHatDto> findTop100Bxh(){
		List<BaiHat> listBaiHat=  new ArrayList<BaiHat>();
		listBaiHat = baiHatService.findTop100Bxh();
		return baiHatConverter.convertToDto(listBaiHat);
	}
	@GetMapping("/baihat/find-by-idbaihat/{id}")
	public BaiHatDto findBaiHatByIdBaiHat(@PathVariable int id) {
		return baiHatConverter.convertToDto(baiHatService.findById(id));
	}
		
	@GetMapping("/casi/find-casi-by-idbaihat/{id}")
	public CaSiDto findCaSiByIdBaiHat(@PathVariable int id) {
		return caSiConverter.convertToDto(baiHatService.findCaSiByIdBaiHat(id));
	}
	@GetMapping("/baihat/find-by-tenbaihat/{tenBaiHat}")
	public List<BaiHatDto> findBaiHatByTenBaiHat(@PathVariable String tenBaiHat) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByTenBaiHat(tenBaiHat));
	}
	
	@GetMapping("/baihat/find-by-idcasi/{id}")
	public List<BaiHatDto> findBaiHatByIdCasi(@PathVariable int id) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByIdCasi(id));
	}
	
	
	@GetMapping("/baihat/find-by-idalbum/{id}")
	public List<BaiHatDto> findBaiHatByIdAlbum(@PathVariable int id) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByIdAlbum(id));
	}
	@GetMapping("/baihat/find-random")
	public List<BaiHatDto> findRandom(){
		List<BaiHat> listBaiHat=  new ArrayList<BaiHat>();
		listBaiHat = baiHatService.findRandom();
		return baiHatConverter.convertToDto(listBaiHat);
	}
	
	@PostMapping("/baihat/add-baihat")
	public BaiHatDto addNewBaiHat(@RequestBody BaiHatDto baihatDto) {
		BaiHat baiHat = baiHatConverter.convertToEntity(baihatDto);
		BaiHatDto dto = baiHatConverter.convertToDto(baiHatService.addNew(baiHat));
		return dto;
	}

	@DeleteMapping("/baihat/delete-baihat/{id}")
	public void deleteBaiHat(@PathVariable int id) {
		baiHatService.delete(id);
	}
	@PutMapping("/baihat/edit-baihat")
	public BaiHatDto editBaiHat(@RequestBody BaiHatDto baiHatDto) {
		BaiHat baiHat = baiHatConverter.convertToEntity(baiHatDto);
		BaiHatDto dto = baiHatConverter.convertToDto(baiHatService.edit(baiHat));
		return dto;
	}
}