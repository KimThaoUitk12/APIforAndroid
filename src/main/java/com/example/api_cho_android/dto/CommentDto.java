package com.example.api_cho_android.dto;

import java.util.Date;



public class CommentDto {

    private int idBaiHat;
	
	private int idNguoiDung;
	
	private Date thoiDiemBinhLuan;	
	
	private String noiDung;
	
	//private BaiHatDto baiHat;
	
	//private NguoiDungDto nguoiDung;

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

	/*public BaiHatDto getBaiHat() {
		return baiHat;
	}

	public void setBaiHat(BaiHatDto baiHat) {
		this.baiHat = baiHat;
	}
*/
/*	public NguoiDungDto getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDungDto nguoiDung) {
		this.nguoiDung = nguoiDung;
	}*/

	public CommentDto(int idBaiHat, int idNguoiDung, Date thoiDiemBinhLuan, String noiDung) {
		super();
		this.idBaiHat = idBaiHat;
		this.idNguoiDung = idNguoiDung;
		this.thoiDiemBinhLuan = thoiDiemBinhLuan;
		this.noiDung = noiDung;
	}

	public CommentDto() {
		super();
	}
	
	
}
