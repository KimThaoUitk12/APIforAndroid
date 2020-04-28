package com.example.api_cho_android.model;

import javax.persistence.*;

@Entity(name = "PLAYLIST")
public class PlayList {
    @Id
    private String idPlayList;
    private String tenPlayList;
    private int idNguoiDung;

    @ManyToOne(fetch = FetchType.EAGER)
    private NguoiDung fk_play_nd;

    @ManyToOne(fetch = FetchType.EAGER)
    private BaiHat_PlayList fk_list_bhpl;

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
