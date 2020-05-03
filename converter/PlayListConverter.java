package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_cho_android.dto.PlayListDto;
import com.example.api_cho_android.model.PlayList;

@Component
public class PlayListConverter {

	@Autowired
	private BaiHat_PlayListConverter baiHat_PlayListConverter;

	public PlayListDto convertToDto(PlayList playList) {
		PlayListDto playListDto = new PlayListDto();
		playListDto.setIdPlayList(playList.getIdPlayList());
		playListDto.setTenPlayList(playList.getTenPlayList());
		playListDto.setIdNguoiDung(playList.getIdNguoiDung());
		playListDto.setListBaiHat_PlayList(baiHat_PlayListConverter.convertToDto(playList.getListBaiHat_PlayList()));
		return playListDto;
	}
	public PlayList convertToEntity(PlayListDto playListDto) {
		PlayList playList = new PlayList();
		playList.setIdPlayList(playListDto.getIdPlayList());
		playList.setTenPlayList(playListDto.getTenPlayList());
		playList.setIdNguoiDung(playListDto.getIdNguoiDung());
		return playList;
	}

	public List<PlayListDto> convertToDto(List<PlayList> listPlayList) {
		List<PlayListDto> listDto = new ArrayList<PlayListDto>();
		for (PlayList entity : listPlayList) {
			PlayListDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<PlayList> convertToEntity(List<PlayListDto> listPlayListDto) {
		List<PlayList> listEntity = new ArrayList<PlayList>();
		for (PlayListDto dto : listPlayListDto) {
			PlayList entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
	
}
