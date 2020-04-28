package com.example.api_cho_android.model;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;

import javax.persistence.*;

@Entity(name = "BAIHAT_PLAYLIST")
@IdClass(KeyForBaiHat_PlayList.class)
public class BaiHat_PlayList {
    @Id
    private int idBaiHat;
    @Id
    private int idPlayList;

    @OneToOne(fetch = FetchType.EAGER)
    private BaiHat fk_bhpl_bh;

    @OneToOne(fetch = FetchType.EAGER)
    private PlayList fk_bhpl_pl;

    public int getIdBaiHat() {
        return idBaiHat;
    }

    public int getIdPlayList() {
        return idPlayList;
    }

    public void setIdBaiHat(int idBaiHat) {
        this.idBaiHat = idBaiHat;
    }

    public void setIdPlayList(int idPlayList) {
        this.idPlayList = idPlayList;
    }

    public BaiHat_PlayList(int idBaiHat, int idPlayList) {
        this.idBaiHat = idBaiHat;
        this.idPlayList = idPlayList;
    }

    public BaiHat_PlayList() {
    }
}
