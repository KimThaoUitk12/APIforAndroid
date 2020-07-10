package com.example.api_cho_android.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.model.CaSi;
import com.example.api_cho_android.repository.CaSiRepository;
import com.example.api_cho_android.service.CaSiService;

@Service
public class CaSiServiceImpl implements CaSiService {

	@Autowired
	private CaSiRepository caSiRepository ;
	
	@Override
	public List<CaSi> findAll() {
		List<CaSi> listCaSi = new ArrayList<CaSi>();
		listCaSi = caSiRepository.findAll();
		return listCaSi;
	}

	@Override
	public CaSi findById(int id) {
		CaSi caSi = new CaSi();
		caSi = caSiRepository.findById(id).get();
		return caSi;
	}

	@Override
	public CaSi addNew(CaSi caSi) {
		CaSi entity = caSiRepository.saveAndFlush(caSi);
		return entity;
	}

	@Override
	public void delete(int id) {
		caSiRepository.deleteById(id);
	}

	@Override
	public CaSi edit(CaSi caSi) {
		CaSi editCaSi = new CaSi();
		editCaSi = caSiRepository.findById(caSi.getIdCaSi()).get();
		editCaSi.setTenCaSi(caSi.getTenCaSi());
		CaSi entity = caSiRepository.saveAndFlush(editCaSi);
		return entity;
	}

	@Override
	public List<CaSi> findByName(String tenCaSi) {
		List<CaSi> listCaSi = new ArrayList<CaSi>();
		listCaSi = caSiRepository.findByName(tenCaSi);
		return listCaSi;
	}

	@Override
	public List<CaSi> findRandom() {
		List<CaSi> listCaSi = new ArrayList<CaSi>();
		Random rand = new Random();
	    List<CaSi> givenList = caSiRepository.findAll();
	 
	    int numberOfElements = 3;
	 
	    for (int i = 0; i < numberOfElements; i++) {
	        int randomIndex = rand.nextInt(givenList.size());
	        CaSi randomElement = givenList.get(randomIndex);
	        listCaSi.add(randomElement);
	        givenList.remove(randomIndex);
	    }
		return listCaSi;
	}

	

}
