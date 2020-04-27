package com.example.api_cho_android.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.repository.BaiHatRepository;
import com.example.api_cho_android.service.BaiHatService;

@Service
public class BaiHatServiceImpl implements BaiHatService {

	@Autowired
	private BaiHatRepository baiHatRepository;
	
	@Override
	public List<BaiHat> findAll() {
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		listBaiHat = baiHatRepository.findAll();
		return listBaiHat;
	}

	@Override
	public BaiHat findById(int id) {
		BaiHat baiHat = new BaiHat();
		baiHat = baiHatRepository.findById(id).get();
		return baiHat;
	}

	@Override
	public BaiHat addNew(BaiHat baiHat) {
		BaiHat entity = baiHatRepository.saveAndFlush(baiHat);
		return entity;
	}

	@Override
	public void delete(int id) {
		baiHatRepository.deleteById(id);
		
	}

	@Override
	public BaiHat edit(BaiHat baiHat) {
		BaiHat editBaiHat = baiHatRepository.findById(baiHat.getIdBaiHat()).get();
		editBaiHat.setLink(baiHat.getLink());
		editBaiHat.setLuotNghe(baiHat.getLuotNghe());
		editBaiHat.setLyrics(baiHat.getLyrics());
		editBaiHat.setTenBaiHat(baiHat.getTenBaiHat());
		editBaiHat.setTenTacGia(baiHat.getTenTacGia());
		editBaiHat.setTheLoai(baiHat.getTheLoai());
		editBaiHat.setIdAlbum(baiHat.getIdAlbum());
		editBaiHat.setIdCaSi(baiHat.getIdCaSi());
		return baiHatRepository.saveAndFlush(editBaiHat);
	}

	@Override
	public List<BaiHat> findBaiHatByTenBaiHat(String tenBaiHat) {
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		listBaiHat = baiHatRepository.findBaiHatByTenBaiHat(tenBaiHat);
		return listBaiHat;
	}

	@Override
	public List<BaiHat> findBaiHatByIdCasi(int idCaSi) {
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		listBaiHat = baiHatRepository.findBaiHatByIdCasi(idCaSi);
		return listBaiHat;
	}

	@Override
	public List<BaiHat> findBaiHatByIdAlbum(int idAlbum) {
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		listBaiHat = baiHatRepository.findBaiHatByIdAlbum(idAlbum);
		return listBaiHat;
	}

}
