package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_cho_android.dto.DownloadDto;
import com.example.api_cho_android.model.Download;

@Component
public class DownloadConverter {

	@Autowired
	private BaiHatConverter baiHatConverter;

	public DownloadDto convertToDto(Download download ) {
		DownloadDto dto = new DownloadDto();
		dto.setIdBaiHat(download.getIdBaiHat());
		dto.setIdNguoiDung(download.getIdNguoiDung());
		dto.setThoiDiemTai(download.getThoiDiemTai());
		dto.setBaiHat(baiHatConverter.convertToDto(download.getBaiHat()));
		return dto;
	}
	
	public Download convertToEntity(DownloadDto dto) {
		Download download = new Download();
		download.setIdBaiHat(dto.getIdBaiHat());
		download.setIdNguoiDung(dto.getIdNguoiDung());
		download.setThoiDiemTai(dto.getThoiDiemTai());
		return download;
	}
	
	public List<DownloadDto> convertToDto(List<Download> listdownload) {
		List<DownloadDto> listDto = new ArrayList<DownloadDto>();
		for (Download entity : listdownload) {
			DownloadDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<Download> convertToEntity(List<DownloadDto> listDownloadDto) {
		List<Download> listEntity = new ArrayList<Download>();
		for (DownloadDto dto : listDownloadDto) {
			Download entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
}
