package com.example.api_cho_android.service;

import com.example.api_cho_android.model.NguoiDung;
import org.springframework.stereotype.Service;

@Service
public interface NguoiDungService {
	public  NguoiDung getNguoiDung(int id);
	public NguoiDung findByTen(String ten);
	public   NguoiDung addNguoiDung(NguoiDung nguoiDung);
	public void deleteNguoiDung(int id);
	public NguoiDung updatePass( NguoiDung nguoiDung);
}
