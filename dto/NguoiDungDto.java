package com.example.api_cho_android.dto;

import java.util.ArrayList;
import java.util.List;


public class NguoiDungDto {

	    private int idNguoiDung;
	    
	    private String ten;
	    
	    private String email;
	    
	    private String pass;
	    
	    private List<PlayListDto> listPlayList = new ArrayList<PlayListDto>();
	    
	    private List<DownloadDto> listDownload  = new ArrayList<DownloadDto>();

		public int getIdNguoiDung() {
			return idNguoiDung;
		}

		public void setIdNguoiDung(int idNguoiDung) {
			this.idNguoiDung = idNguoiDung;
		}

		public String getTen() {
			return ten;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

	

		public List<PlayListDto> getListPlayList() {
			return listPlayList;
		}

		public void setListPlayList(List<PlayListDto> listPlayList) {
			this.listPlayList = listPlayList;
		}

		public List<DownloadDto> getListDownload() {
			return listDownload;
		}

		public void setListDownload(List<DownloadDto> listDownload) {
			this.listDownload = listDownload;
		}

		public NguoiDungDto(int idNguoiDung, String ten, String email, String pass) {
			super();
			this.idNguoiDung = idNguoiDung;
			this.ten = ten;
			this.email = email;
			this.pass = pass;
		}

		public NguoiDungDto() {
			super();
		}

	    
	    
}
