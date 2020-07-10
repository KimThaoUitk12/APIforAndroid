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
import org.springframework.web.bind.annotation.RequestParam;
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
	
	// lây top 100 bài hát có lượt nghe nhiều nhất
	@GetMapping("/baihat/find-bxh")
	public List<BaiHatDto> findTop20Bxh(){
		List<BaiHat> listBaiHat=  new ArrayList<BaiHat>();
		listBaiHat = baiHatService.findTop20Bxh();
		return baiHatConverter.convertToDto(listBaiHat);
	}
	
	// tìm bài hát by id bai hát
	@GetMapping("/baihat/find-by-idbaihat")
	public BaiHatDto findBaiHatByIdBaiHat(@RequestParam(value="id")  int id) {
		return baiHatConverter.convertToDto(baiHatService.findById(id));
	}
		
    // tìm ca si by id bài hát	
	@GetMapping("/casi/find-casi-by-idbaihat")
	public CaSiDto findCaSiByIdBaiHat(@RequestParam(value="id")  int id) {
		return caSiConverter.convertToDto(baiHatService.findCaSiByIdBaiHat(id));
	}
	
	//tìm bài hát by tên bài hát
	@GetMapping("/baihat/find-by-tenbaihat")
	public List<BaiHatDto> findBaiHatByTenBaiHat(@RequestParam(value="tenBaiHat")  String tenBaiHat) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByTenBaiHat(tenBaiHat));
	}
	
	//tìm bài hát by id ca sĩ
	@GetMapping("/baihat/find-by-idcasi")
	public List<BaiHatDto> findBaiHatByIdCasi(@RequestParam(value="id")  int id) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByIdCasi(id));
	}
	
	// tìm bài hát by id album
	@GetMapping("/baihat/find-by-idalbum")
	public List<BaiHatDto> findBaiHatByIdAlbum(@RequestParam(value="id")  int id) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByIdAlbum(id));
	}
	
	//Lấy 10 số bài hát ngẫu nhiên gợi ý
	@GetMapping("/baihat/find-random")
	public List<BaiHatDto> findRandom(){
		List<BaiHat> listBaiHat=  new ArrayList<BaiHat>();
		listBaiHat = baiHatService.findRandom();
		return baiHatConverter.convertToDto(listBaiHat);
	}
	
	// thêm bai hat
	@PostMapping("/baihat/add-baihat")
	public BaiHatDto addNewBaiHat(@RequestBody BaiHatDto baihatDto) {
		BaiHat baiHat = baiHatConverter.convertToEntity(baihatDto);
		BaiHatDto dto = baiHatConverter.convertToDto(baiHatService.addNew(baiHat));
		return dto;
	}

	// xóa bài hát
	@DeleteMapping("/baihat/delete-baihat")
	public void deleteBaiHat(@RequestParam(value="id")  int id) {
		baiHatService.delete(id);
	}
	
	// sửa bài hát
	@PutMapping("/baihat/edit-baihat")
	public BaiHatDto editBaiHat(@RequestBody BaiHatDto baiHatDto) {
		BaiHat baiHat = baiHatConverter.convertToEntity(baiHatDto);
		BaiHatDto dto = baiHatConverter.convertToDto(baiHatService.edit(baiHat));
		return dto;
	}
	
	@PutMapping("/baihat/change-luotnghe")
	public BaiHatDto editBaiHat(@RequestParam(value="id")  int id) {	
		BaiHatDto dto = baiHatConverter.convertToDto(baiHatService.changeLuotNghe(id));
		return dto;
	}
	
	@GetMapping("/baihat/find-by-stringlike")
	public List<BaiHatDto> findBaiHatByStringLike(@RequestParam(value="tenBaiHat")  String tenBaiHat) {
		return baiHatConverter.convertToDto(baiHatService.findBaiHatByStringLike(tenBaiHat));
	}
}
