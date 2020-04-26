package com.example.api_cho_android.model;

import com.example.api_cho_android.keyclass.KeyForDownload;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

@Entity
@IdClass(KeyForDownload.class)
public class Download {
    @Id
    private String idBaiHat;
    @Id
    private String idNguoiDung;
    @Id
    private String thoiDiemTai;

    public String getIdBaiHat() {
        return idBaiHat;
    }

    public String getIdNguoiDung() {
        return idNguoiDung;
    }

    public String getThoiDiemTai() {
        return thoiDiemTai;
    }

    public void setIdBaiHat(String idBaiHat) {
        this.idBaiHat = idBaiHat;
    }

    public void setIdNguoiDung(String idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public void setThoiDiemTai(String thoiDiemTai) {
        this.thoiDiemTai = thoiDiemTai;
    }

    public Download(String idBaiHat, String idNguoiDung, String thoiDiemTai) {
        this.idBaiHat = idBaiHat;
        this.idNguoiDung = idNguoiDung;
        this.thoiDiemTai = thoiDiemTai;
    }

    public Download() {
    }
}
