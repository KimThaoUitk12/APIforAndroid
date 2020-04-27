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

import com.example.api_cho_android.converter.AlbumConverter;
import com.example.api_cho_android.dto.AlbumDto;
import com.example.api_cho_android.model.Album;
import com.example.api_cho_android.service.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumRestController {
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	private AlbumConverter albumConverter;
	
	@GetMapping("/album/find-all")
	public List<AlbumDto> findAllAlbum(){
		List<Album> listAlbum=  new ArrayList<Album>();
		listAlbum = albumService.findAll();
		return albumConverter.convertToDto(listAlbum);
	}
	
	
	@GetMapping("/album/find-by-idalbum/{id}")
	public AlbumDto findAlbumByIdAlbum(@PathVariable int id) {
		return albumConverter.convertToDto(albumService.findById(id));
	}
	
	@GetMapping("/album/find-by-tenalbum/{tenAlbum}")
	public List<AlbumDto> findAlbumByTenAlbum(@PathVariable String tenAlbum) {
		return albumConverter.convertToDto(albumService.findAlbumByTenAlbum(tenAlbum));
	}
	@GetMapping("/album/find-by-idcasi/{id}")
	public List<AlbumDto> findAlbumByIdCaSi(@PathVariable int id) {
		return albumConverter.convertToDto(albumService.findAlbumByIdCaSi(id));
	}
	@PostMapping("/album/add-album")
	public AlbumDto addNewAlbum(@RequestBody AlbumDto albumDto) {
		Album album = albumConverter.convertToEntity(albumDto);
		AlbumDto dto = albumConverter.convertToDto(albumService.addNew(album));
		return dto;
	}

	@DeleteMapping("/album/delete-album/{id}")
	public void deleteAlbum(@PathVariable int id) {
		albumService.delete(id);
	}
	@PutMapping("/album/edit-album")
	public AlbumDto editAlbum(@RequestBody AlbumDto albumDto) {
		Album album = albumConverter.convertToEntity(albumDto);
		AlbumDto dto = albumConverter.convertToDto(albumService.edit(album));
		return dto;
	}
}
