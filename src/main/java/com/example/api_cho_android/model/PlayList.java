package com.example.api_cho_android.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayList {
    @Id
    private String idPlayList;
    private String tenPlayList;
    private int idNguoiDung;

    public String getIdPlayList() {
        return idPlayList;
    }

    public String getTenPlayList() {
        return tenPlayList;
    }

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdPlayList(String idPlayList) {
        this.idPlayList = idPlayList;
    }

    public void setTenPlayList(String tenPlayList) {
        this.tenPlayList = tenPlayList;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public PlayList(String idPlayList, String tenPlayList, int idNguoiDung) {
        this.idPlayList = idPlayList;
        this.tenPlayList = tenPlayList;
        this.idNguoiDung = idNguoiDung;
    }

    public PlayList() {
    }
}
