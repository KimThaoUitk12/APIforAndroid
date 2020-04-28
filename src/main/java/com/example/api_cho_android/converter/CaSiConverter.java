package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.api_cho_android.dto.CaSiDto;
import com.example.api_cho_android.model.CaSi;

@Component
public class CaSiConverter {

	@Autowired
	private AlbumConverter albumConverter;
	
	@Autowired
	private BaiHatConverter baiHatConverter;
	
	public CaSiDto convertToDto(CaSi caSi) {
		CaSiDto caSiDto = new CaSiDto();
		caSiDto.setIdCaSi(caSi.getIdCaSi());
		caSiDto.setTenCaSi(caSi.getTenCaSi());
		caSiDto.setListAlbum(albumConverter.convertToDto(caSi.getListAlbum()));
		caSiDto.setListBaiHat(baiHatConverter.convertToDto(caSi.getListBaiHat()));
		return caSiDto;
	}
	public CaSi convertToEntity(CaSiDto caSiDto) {
		CaSi caSi = new CaSi();
		caSi.setIdCaSi(caSiDto.getIdCaSi());
		caSi.setTenCaSi(caSiDto.getTenCaSi());
	
		return caSi;
	}

	public List<CaSiDto> convertToDto(List<CaSi> listCaSi) {
		List<CaSiDto> listDto = new ArrayList<CaSiDto>();
		for (CaSi entity : listCaSi) {
			CaSiDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<CaSi> convertToEntity(List<CaSiDto> listCaSiDto) {
		List<CaSi> listEntity = new ArrayList<CaSi>();
		for (CaSiDto dto : listCaSiDto) {
			CaSi entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
}
