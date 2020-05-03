package com.example.api_cho_android.keyclass;

import java.io.Serializable;
import java.util.Date;

public class KeyForComment implements Serializable {

    private int idBaiHat;

    private int idNguoiDung;

    private Date thoiDiemBinhLuan;

	public KeyForComment(int idBaiHat, int idNguoiDung, Date thoidiembinhluan) {
		super();
		this.idBaiHat = idBaiHat;
		this.idNguoiDung = idNguoiDung;
		this.thoiDiemBinhLuan = thoidiembinhluan;
	}

	public KeyForComment() {
		super();
	}

    
}
