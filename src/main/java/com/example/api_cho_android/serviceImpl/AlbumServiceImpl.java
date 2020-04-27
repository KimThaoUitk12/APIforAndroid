package com.example.api_cho_android.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api_cho_android.model.Album;
import com.example.api_cho_android.repository.AlbumRepository;
import com.example.api_cho_android.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumRepository albumRepository ;
	
	@Override
	public List<Album> findAll() {
		List<Album> listAlbum = new ArrayList<Album>();
		listAlbum = albumRepository.findAll();
		return listAlbum;
	}

	@Override
	public Album findById(int id) {
		Album album = new Album();
		album = albumRepository.findById(id).get();
		return album;
	}

	@Override
	public Album addNew(Album album) {
		Album entity = albumRepository.saveAndFlush(album);
		return entity;
	}

	@Override
	public void delete(int id) {
		albumRepository.deleteById(id);
		
	}
	@Override
	public Album edit(Album album) {
		Album editAlbum = new Album();
		editAlbum = albumRepository.findById(album.getIdAlbum()).get();
		editAlbum.setSoLuongBai(album.getSoLuongBai());
		editAlbum.setTenAlbum(album.getTenAlbum());
		editAlbum.setIdCasi(album.getIdAlbum());
		Album entity = albumRepository.saveAndFlush(editAlbum);
		return entity;
	}

	@Override
	public List<Album> findAlbumByTenAlbum(String tenAlbum) {
		List<Album> listAlbum = new ArrayList<Album>();
		listAlbum = albumRepository.findAlbumByTenAlbum(tenAlbum);
		return listAlbum;
	}

	@Override
	public List<Album> findAlbumByIdCaSi(int idCaSi) {
		List<Album> listAlbum = new ArrayList<Album>();
		listAlbum = albumRepository.findAlbumByIdCaSi(idCaSi);
		return listAlbum;
	}

}
