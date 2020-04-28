package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.model.NguoiDung;
import com.example.api_cho_android.repository.NguoiDungRepository;
import com.example.api_cho_android.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NguoiDungServiceImpl implements NguoiDungService {
    @Autowired
    NguoiDungRepository nguoiDungRepository;

    @Override
    public NguoiDung getNguoiDung(int id) {
        Optional<NguoiDung> nguoiDung=nguoiDungRepository.findById(id);
        return nguoiDung.isPresent()?nguoiDung.get():null;
    }

    @Override
    public void addNguoiDung(NguoiDung nguoiDung) {
        nguoiDungRepository.save(nguoiDung);
    }

    @Override
    public void delNguoiDung(int id) {
        nguoiDungRepository.deleteById(id);
    }

    @Override
    public void updatePass(int id, NguoiDung nguoiDung) {
        Optional<NguoiDung> nd=nguoiDungRepository.findById(id);
        if(nd.isPresent()){
            nd.get().setPass(nguoiDung.getPass());
            nd.get().setEmail(nguoiDung.getEmail());
            nd.get().setTen(nguoiDung.getTen());
            nguoiDungRepository.save(nd.get());
        }
    }
}
