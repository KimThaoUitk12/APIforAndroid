package com.example.api_cho_android.dto;


public class BaiHat_PlayListDto {

	private int idBaiHat;

    private int idPlayList;

    private BaiHatDto baiHat;

	public int getIdBaiHat() {
		return idBaiHat;
	}

	public void setIdBaiHat(int idBaiHat) {
		this.idBaiHat = idBaiHat;
	}

	public int getIdPlayList() {
		return idPlayList;
	}

	public void setIdPlayList(int idPlayList) {
		this.idPlayList = idPlayList;
	}

	

	public BaiHatDto getBaiHat() {
		return baiHat;
	}

	public void setBaiHat(BaiHatDto baiHat) {
		this.baiHat = baiHat;
	}

	public BaiHat_PlayListDto(int idBaiHat, int idPlayList) {
		super();
		this.idBaiHat = idBaiHat;
		this.idPlayList = idPlayList;
	}

	public BaiHat_PlayListDto() {
		super();
	}
    
    
}
