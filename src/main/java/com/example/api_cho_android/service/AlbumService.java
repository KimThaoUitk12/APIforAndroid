package com.example.api_cho_android.service;

import java.util.List;


import com.example.api_cho_android.model.Album;

public interface AlbumService {

    public List<Album> findAll();
	
	public Album findById(int id);
	
	public Album addNew(Album album);
	
	public void delete(int id);
	
	public Album edit(Album album);
	
	public List<Album> findAlbumByTenAlbum(String tenAlbum);
	
	public List<Album> findAlbumByIdCaSi(int idCaSi);
}
