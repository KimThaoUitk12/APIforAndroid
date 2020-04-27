package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.api_cho_android.dto.AlbumDto;
import com.example.api_cho_android.model.Album;



@Component
public class AlbumConverter {

/*	@Autowired
	private DrinkConverter drinkConverter;*/
	
	public AlbumDto convertToDto(Album album) {
		AlbumDto albumDto = new AlbumDto();
		albumDto.setIdAlbum(album.getIdAlbum());
		albumDto.setSoLuongBai(album.getSoLuongBai());
		albumDto.setTenAlbum(album.getTenAlbum());
		albumDto.setIdCasi(album.getIdAlbum());
	
		return albumDto;
	}
	public Album convertToEntity(AlbumDto albumDto) {
		Album album = new Album();
		album.setIdAlbum(albumDto.getIdAlbum());
		album.setSoLuongBai(albumDto.getSoLuongBai());
		album.setTenAlbum(albumDto.getTenAlbum());
		album.setIdCasi(albumDto.getIdAlbum());
		return album;
	}

	public List<AlbumDto> convertToDto(List<Album> listAlbum) {
		List<AlbumDto> listDto = new ArrayList<AlbumDto>();
		for (Album entity : listAlbum) {
			AlbumDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<Album> convertToEntity(List<AlbumDto> listAlbumDto) {
		List<Album> listEntity = new ArrayList<Album>();
		for (AlbumDto dto : listAlbumDto) {
			Album entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
	
}
