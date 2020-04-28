package com.example.api_cho_android.service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.model.CaSi;

public interface BaiHatService {


	   public List<BaiHat> findAll();
		
		public BaiHat findById(int id);
		
		public BaiHat addNew(BaiHat baiHat);
		
		public void delete(int id);
		
		public BaiHat edit(BaiHat baiHat);
		
		public List<BaiHat> findBaiHatByTenBaiHat(String tenBaiHat);
		
		public List<BaiHat> findBaiHatByIdCasi(int idCaSi);
		
		public List<BaiHat> findBaiHatByIdAlbum(int idAlbum);
		
		public List<BaiHat> findTop100Bxh( );
		
		public List<BaiHat> findRandom();
		
		public CaSi findCaSiByIdBaiHat(int idBaiHat);
		
}
