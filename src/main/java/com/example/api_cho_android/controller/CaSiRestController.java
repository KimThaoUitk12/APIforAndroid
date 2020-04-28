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
	
	@GetMapping("/casi/find-all")
	public List<CaSiDto> findAllCaSi(){
		List<CaSi> listCaSi =  new ArrayList<CaSi>();
		listCaSi = caSiService.findAll();
		return caSiConverter.convertToDto(listCaSi);
	}
	
	@GetMapping("/casi/find-by-idcasi/{id}")
	public CaSiDto findCaSiByIdCaSI(@PathVariable int id) {
		return caSiConverter.convertToDto(caSiService.findById(id));
	}
	
/*	@GetMapping("/casi/find-by-idalbum/{id}")
	public CaSiDto findCaSiByIdAbum(@PathVariable int id) {
		return caSiConverter.convertToDto(caSiService.findCaSiByIdAbum(id));
	}
	@GetMapping("/casi/find-by-idbaihat/{id}")
	public CaSiDto findCaSiByIdBaiHat(@PathVariable int id) {
		return caSiConverter.convertToDto(caSiService.findCaSiByIdBaiHat(id));
	}*/
		
	@PostMapping("/casi/add-casi")
	public CaSiDto addNewCaSI(@RequestBody CaSiDto caSiDto) {
		CaSi caSi = caSiConverter.convertToEntity(caSiDto);
		CaSiDto dto = caSiConverter.convertToDto(caSiService.addNew(caSi));
		return dto;
	}

	@DeleteMapping("/casi/delete-casi/{id}")
	public void deleteCaSi(@PathVariable int id) {
		caSiService.delete(id);
	}
	@PutMapping("/casi/edit-casi")
	public CaSiDto editCaSi(@RequestBody CaSiDto caSiDto) {
		CaSi caSi = caSiConverter.convertToEntity(caSiDto);
		CaSiDto dto = caSiConverter.convertToDto(caSiService.edit(caSi));
		return dto;
	}
	
}
