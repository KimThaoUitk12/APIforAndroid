package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.model.Album;
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
	public NguoiDung findByTen(String ten) {
    	NguoiDung nguoiDung = new NguoiDung();
    	nguoiDung = nguoiDungRepository.findByTenNguoiDung(ten);
		return nguoiDung;
	}
    @Override
    public NguoiDung addNguoiDung(NguoiDung nguoiDung) {
       return nguoiDungRepository.saveAndFlush(nguoiDung);
    }

    @Override
    public void deleteNguoiDung(int id) {
        nguoiDungRepository.deleteById(id);
    }

    @Override
    public NguoiDung updatePass( NguoiDung nguoiDung) {
    	NguoiDung edit = new NguoiDung();
    	edit =nguoiDungRepository.findById(nguoiDung.getIdNguoiDung()).get();
        
    	edit.setPass(nguoiDung.getPass());
    	edit.setEmail(nguoiDung.getEmail());
    	edit.setTen(nguoiDung.getTen());
    	NguoiDung entity=   nguoiDungRepository.save(edit);
         return entity;
        
    }

	
}
