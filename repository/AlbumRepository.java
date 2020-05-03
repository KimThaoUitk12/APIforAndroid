package com.example.api_cho_android.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.api_cho_android.model.Album;

@Repository
public interface AlbumRepository  extends JpaRepository<Album, Integer>{

	@Query("select a from Album a where a.tenAlbum=?1")
	List<Album> findAlbumByTenAlbum(String tenAlbum);
	
	@Query("select a from Album a where a.idCaSi=?1")
	List<Album> findAlbumByIdCaSi(int idCaSi);
}
