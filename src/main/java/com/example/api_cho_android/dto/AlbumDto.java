package com.example.api_cho_android.dto;


public class AlbumDto {
	
     private int idAlbum;
	
	private int soLuongBai;

	private String tenAlbum;
	
	private int idCaSi;
	
	private CaSiDto caSi;

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public int getSoLuongBai() {
		return soLuongBai;
	}

	public void setSoLuongBai(int soLuongBai) {
		this.soLuongBai = soLuongBai;
	}

	public String getTenAlbum() {
		return tenAlbum;
	}

	public void setTenAlbum(String tenAlbum) {
		this.tenAlbum = tenAlbum;
	}

	public int getIdCasi() {
		return idCaSi;
	}

	public void setIdCasi(int idCasi) {
		this.idCaSi = idCasi;
	}

	public CaSiDto getCaSi() {
		return caSi;
	}

	public void setCaSi(CaSiDto caSi) {
		this.caSi = caSi;
	}

	public AlbumDto(int idAlbum, int soLuongBai, String tenAlbum, int idCasi) {
		super();
		this.idAlbum = idAlbum;
		this.soLuongBai = soLuongBai;
		this.tenAlbum = tenAlbum;
		this.idCaSi = idCasi;
	}

	public AlbumDto() {
		super();
	}
	
	

}
