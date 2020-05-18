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

import com.example.api_cho_android.converter.AlbumConverter;
import com.example.api_cho_android.converter.CaSiConverter;
import com.example.api_cho_android.dto.AlbumDto;
import com.example.api_cho_android.dto.BaiHatDto;
import com.example.api_cho_android.dto.CaSiDto;
import com.example.api_cho_android.model.Album;
import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.service.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumRestController {
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	private AlbumConverter albumConverter;
	
	@Autowired
	private CaSiConverter caSiConverter;
	
	//Lấy tất cả album
	@GetMapping("/album/find-all")
	public List<AlbumDto> findAllAlbum(){
		List<Album> listAlbum=  new ArrayList<Album>();
		listAlbum = albumService.findAll();
		return albumConverter.convertToDto(listAlbum);
	}
	
	// Tìm album by id album
	@GetMapping("/album/find-by-idalbum")
	public AlbumDto findAlbumByIdAlbum(@RequestParam(value="id") int id) {
		return albumConverter.convertToDto(albumService.findById(id));
	}
	
	// Tìm album by tên album
	@GetMapping("/album/find-by-tenalbum")
	public List<AlbumDto> findAlbumByTenAlbum(@RequestParam(value="tenAlbum") String tenAlbum) {
		return albumConverter.convertToDto(albumService.findAlbumByTenAlbum(tenAlbum));
	}
	
	// tìm album by id ca sĩ
	@GetMapping("/album/find-by-idcasi")
	public List<AlbumDto> findAlbumByIdCaSi(@RequestParam(value="id") int id) {
		return albumConverter.convertToDto(albumService.findAlbumByIdCaSi(id));
	}
	
	//tìm ca sĩ by id album
	@GetMapping("/casi/find-casi-by-idalbum")
	public CaSiDto findCaSiByIdAlbum(@RequestParam(value="id") int id) {
		return caSiConverter.convertToDto(albumService.findCaSiByIdAlbum(id));
	}
	
	//lấy 3 album ngẫu nhiên gợi ý
      @GetMapping("/album/find-random")
     public List<AlbumDto> findRandom(){
	List<Album> listAlbum=  new ArrayList<Album>();
	listAlbum = albumService.findRandom();
	return albumConverter.convertToDto(listAlbum);
}
	// Thêm album
	@PostMapping("/album/add-album")
	public AlbumDto addNewAlbum(@RequestBody AlbumDto albumDto) {
		Album album = albumConverter.convertToEntity(albumDto);
		AlbumDto dto = albumConverter.convertToDto(albumService.addNew(album));
		return dto;
	}

	// xóa album
	@DeleteMapping("/album/delete-album")
	public void deleteAlbum(@RequestParam(value="id") int id) {
		albumService.delete(id);
	}
	
	//sưa album
	@PutMapping("/album/edit-album")
	public AlbumDto editAlbum(@RequestBody AlbumDto albumDto) {
		Album album = albumConverter.convertToEntity(albumDto);
		AlbumDto dto = albumConverter.convertToDto(albumService.edit(album));
		return dto;
	}
}
