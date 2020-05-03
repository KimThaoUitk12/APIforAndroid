package com.example.api_cho_android.dto;

import java.util.ArrayList;
import java.util.List;


public class PlayListDto {

	  private int idPlayList;
	  
	    private String tenPlayList;
	 
	    private int idNguoiDung;

	   private List<BaiHat_PlayListDto> listBaiHat_PlayList = new ArrayList<BaiHat_PlayListDto>();

	public int getIdPlayList() {
		return idPlayList;
	}

	public void setIdPlayList(int idPlayList) {
		this.idPlayList = idPlayList;
	}

	public String getTenPlayList() {
		return tenPlayList;
	}

	public void setTenPlayList(String tenPlayList) {
		this.tenPlayList = tenPlayList;
	}

	public int getIdNguoiDung() {
		return idNguoiDung;
	}

	public void setIdNguoiDung(int idNguoiDung) {
		this.idNguoiDung = idNguoiDung;
	}

	public List<BaiHat_PlayListDto> getListBaiHat_PlayList() {
		return listBaiHat_PlayList;
	}

	public void setListBaiHat_PlayList(List<BaiHat_PlayListDto> listBaiHat_PlayList) {
		this.listBaiHat_PlayList = listBaiHat_PlayList;
	}

	public PlayListDto(int idPlayList, String tenPlayList, int idNguoiDung) {
		super();
		this.idPlayList = idPlayList;
		this.tenPlayList = tenPlayList;
		this.idNguoiDung = idNguoiDung;
	}

	public PlayListDto() {
		super();
	}

	   
	   
}
