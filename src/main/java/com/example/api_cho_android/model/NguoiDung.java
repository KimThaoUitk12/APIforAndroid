package com.example.api_cho_android.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NguoiDung {
    @Id
    private int idNguoiDung;
    private String ten;
    private String email;
    private String pass;

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public String getTen() {
        return ten;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
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
