package com.example.api_cho_android.service;

import java.util.List;


import com.example.api_cho_android.model.CaSi;

public interface CaSiService {

	   public List<CaSi> findAll();
		
		public CaSi findById(int id);
		
		public List<CaSi> findByName(String tenCaSi);
		
		public CaSi addNew(CaSi caSi);
		
		public void delete(int id);
		
		public CaSi edit(CaSi caSi);
		
	/*	public CaSi findCaSiByIdAbum(int idAbum);
		
	
		public CaSi findCaSiByIdBaiHat(int idBaiHat);*/
}