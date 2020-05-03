package com.example.api_cho_android.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="casi" )
public class CaSi  implements Serializable {

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name = "IDCASI", nullable = false)
	private int idCaSi;
	
	@Column(name="TENCASI",nullable=false)
	private String tenCaSi;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caSi", cascade = CascadeType.ALL)
	private List<BaiHat> listBaiHat = new ArrayList<BaiHat>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caSi", cascade = CascadeType.ALL)
	private List<Album> listAlbum = new ArrayList<Album>();

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

	public List<BaiHat> getListBaiHat() {
		return listBaiHat;
	}

	public void setListBaiHat(List<BaiHat> listBaiHat) {
		this.listBaiHat = listBaiHat;
	}

	
	public List<Album> getListAlbum() {
		return listAlbum;
	}

	public void setListAlbum(List<Album> listAlbum) {
		this.listAlbum = listAlbum;
	}

	public CaSi(int idCaSi, String tenCaSi) {
		super();
		this.idCaSi = idCaSi;
		this.tenCaSi = tenCaSi;
	}

	public CaSi() {
		
	}
	
}
