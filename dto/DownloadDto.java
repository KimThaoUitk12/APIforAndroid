package com.example.api_cho_android.dto;

import java.util.Date;



public class DownloadDto {
	    
	   private int idBaiHat;
	   
	    private int idNguoiDung;
	   
	    private Date thoiDiemTai;
	  
		private BaiHatDto baiHat;

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

		public BaiHatDto getBaiHat() {
			return baiHat;
		}

		public void setBaiHat(BaiHatDto baiHat) {
			this.baiHat = baiHat;
		}

		public DownloadDto(int idBaiHat, int idNguoiDung, Date thoiDiemTai) {
			super();
			this.idBaiHat = idBaiHat;
			this.idNguoiDung = idNguoiDung;
			this.thoiDiemTai = thoiDiemTai;
		}

		public DownloadDto() {
			super();
		}
		
		
		
}
