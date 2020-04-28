package com.example.api_cho_android.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.api_cho_android.keyclass.KeyForComment;



@Entity
@Table(name="comment")
@IdClass(KeyForComment.class)
public class Comment {

	@Id
	@Column(name = "IDBAIHAT", nullable = false)
	private int idBaiHat;
	
	@Id
	@Column(name = "IDNGUOIDUNG", nullable = false)
	private int idNguoiDung;
	
	@Id
	@Column(name = "THOIDIEMBINHLUAN", nullable = false)
	private Date thoiDiemBinhLuan;	
	
	@Column(name = "NOIDUNG", nullable = false)
	private String noiDung;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDBAIHAT", insertable = false, updatable = false)
	private BaiHat baiHat;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDNGUOIDUNG", insertable = false, updatable = false)
	private NguoiDung nguoiDung;

	public int getIdBaiHat() {
		return idBaiHat;
	}

	public void setIdBaiHat(int idBaiHat) {
		this.idBaiHat = idBaiHat;
	}

	public int getIdNguoiDung() {
		return idNguoiDung;
	}

	public void setIdNguoiDung(int idNguoiDung) {
		this.idNguoiDung = idNguoiDung;
	}

	public Date getThoiDiemBinhLuan() {
		return thoiDiemBinhLuan;
	}

	public void setThoiDiemBinhLuan(Date thoiDiemBinhLuan) {
		this.thoiDiemBinhLuan = thoiDiemBinhLuan;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public BaiHat getBaiHat() {
		return baiHat;
	}

	public void setBaiHat(BaiHat baiHat) {
		this.baiHat = baiHat;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public Comment(int idBaiHat, int idNguoiDung, Date thoiDiemBinhLuan, String noiDung) {
		super();
		this.idBaiHat = idBaiHat;
		this.idNguoiDung = idNguoiDung;
		this.thoiDiemBinhLuan = thoiDiemBinhLuan;
		this.noiDung = noiDung;
	}
	public Comment()
	{
		
	};
	
}
