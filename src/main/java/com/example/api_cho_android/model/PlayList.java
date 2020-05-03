package com.example.api_cho_android.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="playlist")
public class PlayList {
    @Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
    @Column(name = "IDPLAYLIST", nullable = false)
    private int idPlayList;
    
    @Column(name = "TENPLAYLIST", nullable = false)
    private String tenPlayList;
    
    @Column(name = "IDNGUOIDUNG", nullable = false)
    private int idNguoiDung;

   @ManyToOne(optional = false)
	@JoinColumn(name = "IDNGUOIDUNG", nullable=true, insertable = false, updatable = false)
    private NguoiDung nguoiDung;

   @OneToMany(fetch = FetchType.LAZY, mappedBy = "playList", cascade = CascadeType.ALL)
   private List<BaiHat_PlayList> listBaiHat_PlayList = new ArrayList<BaiHat_PlayList>();

    public int getIdPlayList() {
        return idPlayList;
    }

    public String getTenPlayList() {
        return tenPlayList;
    }

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdPlayList(int idPlayList) {
        this.idPlayList = idPlayList;
    }

    public void setTenPlayList(String tenPlayList) {
        this.tenPlayList = tenPlayList;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    
    public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public List<BaiHat_PlayList> getListBaiHat_PlayList() {
		return listBaiHat_PlayList;
	}

	public void setListBaiHat_PlayList(List<BaiHat_PlayList> listBaiHat_PlayList) {
		this.listBaiHat_PlayList = listBaiHat_PlayList;
	}

	public PlayList(int idPlayList, String tenPlayList, int idNguoiDung) {
        this.idPlayList = idPlayList;
        this.tenPlayList = tenPlayList;
        this.idNguoiDung = idNguoiDung;
    }

    public PlayList() {
    }
}
