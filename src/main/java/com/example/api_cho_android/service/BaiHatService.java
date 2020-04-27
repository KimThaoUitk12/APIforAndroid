package com.example.api_cho_android.service;

import java.util.List;


import com.example.api_cho_android.model.BaiHat;

public interface BaiHatService {


	   public List<BaiHat> findAll();
		
		public BaiHat findById(int id);
		
		public BaiHat addNew(BaiHat baiHat);
		
		public void delete(int id);
		
		public BaiHat edit(BaiHat baiHat);
		
		public List<BaiHat> findBaiHatByTenBaiHat(String tenBaiHat);
		
		public List<BaiHat> findBaiHatByIdCasi(int idCaSi);
		
		public List<BaiHat> findBaiHatByIdAlbum(int idAlbum);
}
