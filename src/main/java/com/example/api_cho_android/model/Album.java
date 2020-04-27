package com.example.api_cho_android.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="album")
public class Album {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDALBUM", nullable = false)
    private int idAlbum;

	
	@Column(name = "SOLUONGBAI", nullable = false)
	private int soLuongBai;
	
	@Column(name = "TENAlBUM", nullable = false)
	private String tenAlbum;
	
	@Column(name = "IDCASI", nullable = false)
	private int idCaSi;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "IDCASI", nullable=true, insertable = false, updatable = false)
	private CaSi caSi;


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


	public CaSi getCaSi() {
		return caSi;
	}


	public void setCaSi(CaSi caSi) {
		this.caSi = caSi;
	}


	public Album(int idAlbum, int soLuongBai, String tenAlbum, int idCasi) {
		super();
		this.idAlbum = idAlbum;
		this.soLuongBai = soLuongBai;
		this.tenAlbum = tenAlbum;
		this.idCaSi = idCasi;
	}


	public Album() {
		super();
	}
	
	
}
