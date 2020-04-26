package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.model.NguoiDung;
import com.example.api_cho_android.repository.NguoiDungRepository;
import com.example.api_cho_android.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class NguoiDungServiceImpl implements NguoiDungService {
    @Autowired
    NguoiDungRepository nguoiDungRepository;
    @Override
    public void addNguoiDung(NguoiDung nguoiDung) {
        nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public void delNguoiDung(int id) {
        nguoiDungRepository.deleteById(id);
    }

    @Override
    public void updatePass(int id, String pass) {
        Optional<NguoiDung> nguoiDung=nguoiDungRepository.findById(id);
        if(nguoiDung.isPresent()){
            nguoiDung.get().setPass(pass);
            nguoiDungRepository.save(nguoiDung.get());
        }
    }
}
