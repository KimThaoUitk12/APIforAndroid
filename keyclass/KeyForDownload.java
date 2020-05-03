package com.example.api_cho_android.keyclass;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class KeyForDownload implements Serializable {

    private int idBaiHat;

    private int idNguoiDung;

    private Date thoiDiemTai;

	public KeyForDownload(int idBaiHat, int idNguoiDung, Date thoiDiemTai) {
		super();
		this.idBaiHat = idBaiHat;
		this.idNguoiDung = idNguoiDung;
		this.thoiDiemTai = thoiDiemTai;
	}

	public KeyForDownload() {
		super();
	}


}
