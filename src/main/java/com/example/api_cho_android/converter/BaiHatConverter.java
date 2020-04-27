package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_cho_android.dto.BaiHatDto;
import com.example.api_cho_android.model.BaiHat;

@Component
public class BaiHatConverter {

	@Autowired
	private CommentConverter commentConverter;
	
	public BaiHatDto convertToDto(BaiHat baiHat) {
		BaiHatDto baiHatDto = new BaiHatDto();
		baiHatDto.setIdBaiHat(baiHat.getIdBaiHat());
		baiHatDto.setLink(baiHat.getLink());
		baiHatDto.setLuotNghe(baiHat.getLuotNghe());
		baiHatDto.setLyrics(baiHat.getLyrics());
		baiHatDto.setTenBaiHat(baiHat.getTenBaiHat());
		baiHatDto.setTenTacGia(baiHat.getTenTacGia());
		baiHatDto.setTheLoai(baiHat.getTheLoai());
		baiHatDto.setIdAlbum(baiHat.getIdAlbum());
		baiHatDto.setIdCaSi(baiHat.getIdCaSi());
		baiHatDto.setListComment(commentConverter.convertToDto(baiHat.getListComment()));
		return baiHatDto;
	}
	public BaiHat convertToEntity(BaiHatDto baiHatDto) {
		BaiHat baiHat = new BaiHat();
		baiHat.setIdBaiHat(baiHatDto.getIdBaiHat());
		baiHat.setLink(baiHatDto.getLink());
		baiHat.setLuotNghe(baiHatDto.getLuotNghe());
		baiHat.setLyrics(baiHatDto.getLyrics());
		baiHat.setTenBaiHat(baiHatDto.getTenBaiHat());
		baiHat.setTenTacGia(baiHatDto.getTenTacGia());
		baiHat.setTheLoai(baiHatDto.getTheLoai());
		baiHat.setIdAlbum(baiHatDto.getIdAlbum());
		baiHat.setIdCaSi(baiHatDto.getIdCaSi());
	
		return baiHat;
	}

	public List<BaiHatDto> convertToDto(List<BaiHat> listBaiHat) {
		List<BaiHatDto> listDto = new ArrayList<BaiHatDto>();
		for (BaiHat entity : listBaiHat) {
			BaiHatDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<BaiHat> convertToEntity(List<BaiHatDto> listBaiHatDto) {
		List<BaiHat> listEntity = new ArrayList<BaiHat>();
		for (BaiHatDto dto : listBaiHatDto) {
			BaiHat entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
}
