package com.example.api_cho_android.service;

import com.example.api_cho_android.model.NguoiDung;
import org.springframework.stereotype.Service;

@Service
public interface NguoiDungService {
    void addNguoiDung(NguoiDung nguoiDung);
    void delNguoiDung(int id);
    void updatePass(int id, String pass);
}
