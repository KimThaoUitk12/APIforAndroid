package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;
import com.example.api_cho_android.model.BaiHat_PlayList;
import com.example.api_cho_android.model.PlayList;
import com.example.api_cho_android.repository.BaiHat_PlayListRepository;
import com.example.api_cho_android.repository.PlayListRepository;
import com.example.api_cho_android.service.BaiHat_PlayListService;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class BaiHat_PlayListServiceImpl implements BaiHat_PlayListService {
    @Autowired
    BaiHat_PlayListRepository baiHat_playListRepository;
    
    @Autowired
    PlayListRepository playListRepository;
    
    @Override
    public BaiHat_PlayList addBaiHat_PlayList(BaiHat_PlayList baiHat_playList) {
       return baiHat_playListRepository.saveAndFlush(baiHat_playList);
    }

    @Override
    public void delBaiHat_PlayList(int idBaiHat, int idPlayList) {
        baiHat_playListRepository.deleteById(new KeyForBaiHat_PlayList(idBaiHat,idPlayList));
    }


    public void delete1List( int idPlayList) {
    List<BaiHat_PlayList> listBaiHat	= new ArrayList<BaiHat_PlayList>();
    listBaiHat  = baiHat_playListRepository.findByIdPlayList(idPlayList);
     
     for(BaiHat_PlayList baiHat :listBaiHat) {
	   int idBaiHat =baiHat.getIdBaiHat();
	   baiHat_playListRepository.deleteById(new KeyForBaiHat_PlayList(idBaiHat,idPlayList));
   }
    
    }
}
