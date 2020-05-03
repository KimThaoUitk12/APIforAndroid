package com.example.api_cho_android.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="baihat")
public class BaiHat {

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name = "IDBAIHAT", nullable = false)
	private int idBaiHat;
	
	@Column(name = "TENBAIHAT", nullable = false)
	private String tenBaiHat;
	
	@Column(name = "TENTACGIA", nullable = false)
	private String tenTacGia;
	
	@Column(name = "LINK", nullable = false)
	private String link;
	
	@Column(name = "THELOAI", nullable = false)
	private String theLoai;
	
	@Column(name = "LUOTNGHE", nullable = false)
	private int luotNghe;
	
	@Column(name = "LYRICS", nullable = false)
	private String lyrics;
	
	@Column(name = "IDAlBUM", nullable = false)
	private int idAlbum;
	
	@Column(name = "IDCASI", nullable = false)
	private int idCaSi;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDCASI", nullable=true, insertable = false, updatable = false)
    private CaSi caSi;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDAlBUM", nullable=true, insertable = false, updatable = false)
    private Album album;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "baiHat", cascade = CascadeType.ALL)
	private List<Comment> listComment = new ArrayList<Comment>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "baiHat", cascade = CascadeType.ALL)
	private List<Download> listDownload = new ArrayList<Download>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "baiHat", cascade = CascadeType.ALL)
	private List<BaiHat_PlayList> listBaiHat_PlayList = new ArrayList<BaiHat_PlayList>();
	
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
	
	
	public CaSi getCaSi() {
		return caSi;
	}
	public void setCaSi(CaSi caSi) {
		this.caSi = caSi;
	}
	
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album Album) {
		this.album = Album;
	}
	
	
	public List<Comment> getListComment() {
		return listComment;
	}
	public void setListComment(List<Comment> listComment) {
		this.listComment = listComment;
	}
	
	
	public BaiHat(int idBaiHat, String tenBaiHat, String tenTacGia, String link, String theLoai, int luotNghe,
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
	public BaiHat() {
		super();
	}
	

	
}
