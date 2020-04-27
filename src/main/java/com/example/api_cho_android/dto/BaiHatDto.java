package com.example.api_cho_android.dto;

import java.util.ArrayList;
import java.util.List;

public class BaiHatDto {

     private int idBaiHat;

	private String tenBaiHat;
	
	private String tenTacGia;

	private String link;
	
	private String theLoai;
	
	private int luotNghe;
	
	private String lyrics;

	private int idAlbum;
	
	private int idCaSi;

    private CaSiDto caSi;
	
    private AlbumDto album;

	private List<CommentDto> listComment = new ArrayList<CommentDto>();

	public int getIdBaiHat() {
		return idBaiHat;
	}

	public void setIdBaiHat(int idBaiHat) {
		this.idBaiHat = idBaiHat;
	}

	public String getTenBaiHat() {
		return tenBaiHat;
	}

	public void setTenBaiHat(String tenBaiHat) {
		this.tenBaiHat = tenBaiHat;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public int getLuotNghe() {
		return luotNghe;
	}

	public void setLuotNghe(int luotNghe) {
		this.luotNghe = luotNghe;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public int getIdCaSi() {
		return idCaSi;
	}

	public void setIdCaSi(int idCaSi) {
		this.idCaSi = idCaSi;
	}

	public CaSiDto getCaSi() {
		return caSi;
	}

	public void setCaSi(CaSiDto caSi) {
		this.caSi = caSi;
	}

	public AlbumDto getAlbum() {
		return album;
	}

	public void setAlbum(AlbumDto album) {
		this.album = album;
	}

	public List<CommentDto> getListComment() {
		return listComment;
	}

	public void setListComment(List<CommentDto> listComment) {
		this.listComment = listComment;
	}

	public BaiHatDto(int idBaiHat, String tenBaiHat, String tenTacGia, String link, String theLoai, int luotNghe,
			String lyrics, int idAlbum, int idCaSi) {
		super();
		this.idBaiHat = idBaiHat;
		this.tenBaiHat = tenBaiHat;
		this.tenTacGia = tenTacGia;
		this.link = link;
		this.theLoai = theLoai;
		this.luotNghe = luotNghe;
		this.lyrics = lyrics;
		this.idAlbum = idAlbum;
		this.idCaSi = idCaSi;
	}

	public BaiHatDto() {
		super();
	}
	
	
	
}
