package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_cho_android.dto.BaiHat_PlayListDto;
import com.example.api_cho_android.model.BaiHat_PlayList;

@Component
public class BaiHat_PlayListConverter {

	@Autowired
	private BaiHatConverter baiHatConverter;

	public BaiHat_PlayListDto convertToDto(BaiHat_PlayList baiHat_PlayList) {
		BaiHat_PlayListDto dto = new BaiHat_PlayListDto();
		dto.setIdBaiHat(baiHat_PlayList.getIdBaiHat());
		dto.setIdPlayList(baiHat_PlayList.getIdPlayList());
		dto.setBaiHat(baiHatConverter.convertToDto(baiHat_PlayList.getBaiHat()));
		return dto;
	}
	
	public BaiHat_PlayList convertToEntity(BaiHat_PlayListDto dto) {
		BaiHat_PlayList baiHat_PlayList = new BaiHat_PlayList();
		baiHat_PlayList.setIdBaiHat(dto.getIdBaiHat());
		baiHat_PlayList.setIdPlayList(dto.getIdPlayList());	
		return baiHat_PlayList;
	}
	
	public List<BaiHat_PlayListDto> convertToDto(List<BaiHat_PlayList> listBaiHat_PlayList) {
		List<BaiHat_PlayListDto> listDto = new ArrayList<BaiHat_PlayListDto>();
		for (BaiHat_PlayList entity : listBaiHat_PlayList) {
			BaiHat_PlayListDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<BaiHat_PlayList> convertToEntity(List<BaiHat_PlayListDto> listBaiHat_PlayListDto) {
		List<BaiHat_PlayList> listEntity = new ArrayList<BaiHat_PlayList>();
		for (BaiHat_PlayListDto dto : listBaiHat_PlayListDto) {
			BaiHat_PlayList entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
	
}
