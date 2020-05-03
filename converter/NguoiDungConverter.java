package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_cho_android.dto.NguoiDungDto;
import com.example.api_cho_android.model.NguoiDung;

@Component
public class NguoiDungConverter {

	@Autowired
	private DownloadConverter downloadConverter;
	
	@Autowired
	private PlayListConverter playListConverter;
	
	public NguoiDungDto convertToDto(NguoiDung nguoiDung) {
		NguoiDungDto nguoiDungDto = new NguoiDungDto();
		nguoiDungDto.setIdNguoiDung(nguoiDung.getIdNguoiDung());
		nguoiDungDto.setTen(nguoiDung.getTen());
		nguoiDungDto.setEmail(nguoiDung.getEmail());
		nguoiDungDto.setPass(nguoiDung.getPass());
		nguoiDungDto.setListPlayList(playListConverter.convertToDto(nguoiDung.getListPlayList()));
		nguoiDungDto.setListDownload(downloadConverter.convertToDto(nguoiDung.getListDownload()));
		
		return nguoiDungDto;
	}
	public NguoiDung convertToEntity(NguoiDungDto nguoiDungDto) {
		NguoiDung nguoiDung = new NguoiDung();
		nguoiDung.setIdNguoiDung(nguoiDungDto.getIdNguoiDung());
		nguoiDung.setTen(nguoiDungDto.getTen());
		nguoiDung.setEmail(nguoiDungDto.getEmail());
		nguoiDung.setPass(nguoiDungDto.getPass());
	
		return nguoiDung;
	}

	public List<NguoiDungDto> convertToDto(List<NguoiDung> listNguoiDung) {
		List<NguoiDungDto> listNguoiDungDto = new ArrayList<NguoiDungDto>();
		for (NguoiDung entity : listNguoiDung) {
			NguoiDungDto dto = convertToDto(entity);
			listNguoiDungDto.add(dto);
		}
		return listNguoiDungDto;
	}
	public List<NguoiDung> convertToEntity(List<NguoiDungDto> listNguoiDungDto) {
		List<NguoiDung> listEntity = new ArrayList<NguoiDung>();
		for (NguoiDungDto dto : listNguoiDungDto) {
			NguoiDung entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
}
