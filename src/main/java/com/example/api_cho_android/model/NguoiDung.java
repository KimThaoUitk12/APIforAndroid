package com.example.api_cho_android.model;

import java.util.Date;

import javax.persistence.*;

@Entity(name = "NGUOIDUNG")
public class NguoiDung {
    @Id
    private int idNguoiDung;
    private String ten;
    private String email;
    private String pass;

    @ManyToOne(fetch = FetchType.EAGER)
    private PlayList fk_nd_list;

    @ManyToOne(fetch = FetchType.EAGER)
    private Download fk_nd_down;

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



    public NguoiDung(int idNguoiDung, String ten, String email, String pass) {
        this.idNguoiDung = idNguoiDung;
        this.ten = ten;
        this.email = email;
        this.pass = pass;
    }

    public NguoiDung() {
    }
}
