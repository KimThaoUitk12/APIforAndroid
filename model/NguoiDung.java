package com.example.api_cho_android.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="nguoidung")
public class NguoiDung {
    @Id
    @Column(name = "IDNGUOIDUNG", nullable = false)
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
    private int idNguoiDung;
    private String ten;
    private String email;
    private String pass;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nguoiDung", cascade = CascadeType.ALL)
    private List<PlayList> listPlayList = new ArrayList<PlayList>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nguoiDung", cascade = CascadeType.ALL)
    private List<Comment> listComment = new ArrayList<Comment>();
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nguoiDung", cascade = CascadeType.ALL)
    private List<Download> listDownload  = new ArrayList<Download>();

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public String getTen() {
        return ten;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



 

	public List<PlayList> getListPlayList() {
		return listPlayList;
	}

	public void setListPlayList(List<PlayList> listPlayList) {
		this.listPlayList = listPlayList;
	}

	public List<Comment> getListComment() {
		return listComment;
	}

	public void setListComment(List<Comment> listComment) {
		this.listComment = listComment;
	}

	public List<Download> getListDownload() {
		return listDownload;
	}

	public void setListDownload(List<Download> listDownload) {
		this.listDownload = listDownload;
	}

	public NguoiDung(int idNguoiDung, String ten, String email, String pass) {
        this.idNguoiDung = idNguoiDung;
        this.ten = ten;
        this.email = email;
        this.pass = pass;
    }

    public NguoiDung() {
    }
}
