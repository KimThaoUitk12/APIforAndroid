package com.example.api_cho_android.dto;

import java.util.ArrayList;
import java.util.List;

public class CaSiDto {

    private int idCaSi;
	
	private String tenCaSi;
	
	private List<BaiHatDto> listBaiHat = new ArrayList<BaiHatDto>();

	private List<AlbumDto> listAlbum = new ArrayList<AlbumDto>();

	public int getIdCaSi() {
		return idCaSi;
	}

	public void setIdCaSi(int idCaSi) {
		this.idCaSi = idCaSi;
	}

	public String getTenCaSi() {
		return tenCaSi;
	}

	public void setTenCaSi(String tenCaSi) {
		this.tenCaSi = tenCaSi;
	}

	public List<BaiHatDto> getListBaiHat() {
		return listBaiHat;
	}

	public void setListBaiHat(List<BaiHatDto> listBaiHat) {
		this.listBaiHat = listBaiHat;
	}

	public List<AlbumDto> getListAlbum() {
		return listAlbum;
	}

	public void setListAlbum(List<AlbumDto> listAlbum) {
		this.listAlbum = listAlbum;
	}

	public CaSiDto(int idCaSi, String tenCaSi) {
		super();
		this.idCaSi = idCaSi;
		this.tenCaSi = tenCaSi;
	}

	public CaSiDto() {
		super();
	}
	
	
}
