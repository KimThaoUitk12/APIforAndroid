package com.example.api_cho_android.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.model.CaSi;
import com.example.api_cho_android.repository.BaiHatRepository;
import com.example.api_cho_android.repository.CaSiRepository;
import com.example.api_cho_android.service.BaiHatService;

@Service
public class BaiHatServiceImpl implements BaiHatService {

	@Autowired
	private BaiHatRepository baiHatRepository;
	@Autowired
	private CaSiRepository caSiRepository;
	
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
	
	@Override
	public List<BaiHat> findTop20Bxh(){
		Page<BaiHat> page = baiHatRepository.findAll(
				  PageRequest.of(0, 20, Sort.by(Sort.Direction.DESC, "LuotNghe")));
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		listBaiHat= page.getContent();
		return listBaiHat;
	}

	@Override
	public List<BaiHat> findRandom() {
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		Random rand = new Random();
	    List<BaiHat> givenList = baiHatRepository.findAll();
	 
	    int numberOfElements = 10;
	 
	    for (int i = 0; i < numberOfElements; i++) {
	        int randomIndex = rand.nextInt(givenList.size());
	        BaiHat randomElement = givenList.get(randomIndex);
	        listBaiHat.add(randomElement);
	        givenList.remove(randomIndex);
	    }
		return listBaiHat;
	}

	@Override
	public CaSi findCaSiByIdBaiHat(int idBaiHat) {
		
		BaiHat baiHat = new BaiHat();
		baiHat = baiHatRepository.findById(idBaiHat).get();
		int idCaSi = baiHat.getIdCaSi();
		CaSi caSi= caSiRepository.findById(idCaSi).get();
		return caSi;
	}

	@Override
	public BaiHat changeLuotNghe(int idBaiHat) {
		BaiHat baiHat = new BaiHat();
		baiHat = baiHatRepository.findById(idBaiHat).get();
		int luotNghe= baiHat.getLuotNghe();
		luotNghe++;
		baiHat.setLuotNghe(luotNghe);
		return baiHatRepository.saveAndFlush(baiHat);
	}

	@Override
	public List<BaiHat> findBaiHatByStringLike(String tenBaiHat) {
		List<BaiHat> listBaiHat = new ArrayList<BaiHat>();
		listBaiHat = baiHatRepository.findBaiHatByStringLike(tenBaiHat);
		return listBaiHat;
	}

}
