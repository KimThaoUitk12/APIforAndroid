package com.example.api_cho_android.model;

import com.example.api_cho_android.keyclass.KeyForDownload;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="download")
@IdClass(KeyForDownload.class)
public class Download {
    @Id
    @Column(name = "IDBAIHAT", nullable = false)
    private int idBaiHat;
    @Id
    @Column(name = "IDNGUOIDUNG", nullable = false)
    private int idNguoiDung;
    @Id
    @Column(name = "THOIDIEMTAI", nullable = false)
    private Date thoiDiemTai;

    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDBAIHAT", insertable = false, updatable = false)
	private BaiHat baiHat;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDNGUOIDUNG", insertable = false, updatable = false)
	private NguoiDung nguoiDung;
  
    

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



	



	public Date getThoiDiemTai() {
		return thoiDiemTai;
	}



	public void setThoiDiemTai(Date thoiDiemTai) {
		this.thoiDiemTai = thoiDiemTai;
	}



	public Download(int idBaiHat, int idNguoiDung, Date thoiDiemTai) {
		super();
		this.idBaiHat = idBaiHat;
		this.idNguoiDung = idNguoiDung;
		this.thoiDiemTai = thoiDiemTai;
	}



	public Download() {
    }
}
