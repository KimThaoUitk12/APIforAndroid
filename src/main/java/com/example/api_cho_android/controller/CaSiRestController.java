package com.example.api_cho_android.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_cho_android.converter.CaSiConverter;
import com.example.api_cho_android.dto.CaSiDto;
import com.example.api_cho_android.model.CaSi;
import com.example.api_cho_android.service.CaSiService;



@RestController
@RequestMapping("/api")
public class CaSiRestController {


	@Autowired
	private CaSiService caSiService;
	
	@Autowired
	private CaSiConverter caSiConverter;
	
	// lấy tất cả ca sĩ
	@GetMapping("/casi/find-all")
	public List<CaSiDto> findAllCaSi(){
		List<CaSi> listCaSi =  new ArrayList<CaSi>();
		listCaSi = caSiService.findAll();
	return caSiConverter.convertToDto(listCaSi);
	}
	
	
	// tìm ca sĩ by id ca sĩ
	@GetMapping("/casi/find-by-idcasi")
	public CaSiDto findCaSiByIdCaSI(@RequestParam(value="id") int id) {
		return caSiConverter.convertToDto(caSiService.findById(id));
	}
	
	// tìm ca sĩ by ten ca si
	@GetMapping("/casi/find-by-tencasi")
	public List<CaSiDto> findByTenCaSi(@RequestParam(value="tenCaSi")  String tenCaSi){
		List<CaSi> listCaSi =  new ArrayList<CaSi>();
		listCaSi = caSiService.findByName(tenCaSi);
		return caSiConverter.convertToDto(listCaSi);
	}
	
   // thêm ca sĩ
	@PostMapping("/casi/add-casi")
	public CaSiDto addNewCaSI(@RequestBody CaSiDto caSiDto) {
		CaSi caSi = caSiConverter.convertToEntity(caSiDto);
		CaSiDto dto = caSiConverter.convertToDto(caSiService.addNew(caSi));
		return dto;
	}
   // xóa ca sĩ
	@DeleteMapping("/casi/delete-casi")
	public void deleteCaSi(@RequestParam(value="id") int id) {
		caSiService.delete(id);
	}
	// sửa ca sĩ
	@PutMapping("/casi/edit-casi")
	public CaSiDto editCaSi(@RequestBody CaSiDto caSiDto) {
		CaSi caSi = caSiConverter.convertToEntity(caSiDto);
		CaSiDto dto = caSiConverter.convertToDto(caSiService.edit(caSi));
		return dto;
	}
	
}
