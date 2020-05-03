package com.example.api_cho_android.keyclass;

import java.io.Serializable;

public class KeyForBaiHat_PlayList implements Serializable {

    private int idBaiHat;

    private int idPlayList;

    public KeyForBaiHat_PlayList(int idBaiHat, int idPlayList) {
        this.idBaiHat = idBaiHat;
        this.idPlayList = idPlayList;
    }

	public KeyForBaiHat_PlayList() {
		super();
	}
    
}
