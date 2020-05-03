package com.example.api_cho_android.model;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;

import javax.persistence.*;

@Entity
@Table(name="baihat_playlist")
@IdClass(KeyForBaiHat_PlayList.class)
public class BaiHat_PlayList {
    @Id
    @Column(name = "IDBAIHAT", nullable = false)
    private int idBaiHat;
    @Id
    @Column(name = "IDPLAYLIST", nullable = false)
    private int idPlayList;
    
    @ManyToOne(optional = false)
	@JoinColumn(name = "IDBAIHAT", nullable=true, insertable = false, updatable = false)
    private BaiHat baiHat;
 
    @ManyToOne(optional = false)
	 @JoinColumn(name = "IDPLAYLIST", nullable=true, insertable = false, updatable = false)
    private PlayList playList;
    
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
    

    public BaiHat getBaiHat() {
		return baiHat;
	}

	public void setBaiHat(BaiHat baiHat) {
		this.baiHat = baiHat;
	}

	public PlayList getPlayList() {
		return playList;
	}

	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}

	public BaiHat_PlayList() {
    }
}
