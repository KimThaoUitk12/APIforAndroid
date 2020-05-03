package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;
import com.example.api_cho_android.model.Album;
import com.example.api_cho_android.model.BaiHat_PlayList;
import com.example.api_cho_android.model.PlayList;
import com.example.api_cho_android.repository.BaiHat_PlayListRepository;
import com.example.api_cho_android.repository.PlayListRepository;
import com.example.api_cho_android.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PlayListServiceImpl implements PlayListService {
    @Autowired
    PlayListRepository playListRepository;
    
    @Autowired
    BaiHat_PlayListRepository baiHat_playListRepository;
    @Override
    
    
    public PlayList findById(int id) {
        Optional<PlayList> playList=playListRepository.findById(id);
        return playList.isPresent()?playList.get():null;
    }


    @Override
    public List<PlayList> findByIdNguoiDung(int idNguoiDung) {
        List<PlayList> playLists= new ArrayList<PlayList>();
        playLists= playListRepository.findByIdNguoiDung(idNguoiDung);
        return playLists;
    }

    @Override
    public PlayList addPlayList(PlayList playList) {
       return playListRepository.saveAndFlush(playList);
    }

    @Override
    public void deletePlayList(int id) {
        List<BaiHat_PlayList> listBaiHat	= new ArrayList<BaiHat_PlayList>();
        listBaiHat  = baiHat_playListRepository.findByIdPlayList(id);
         
         for(BaiHat_PlayList baiHat :listBaiHat) {
    	   int idBaiHat =baiHat.getIdBaiHat();
    	   baiHat_playListRepository.deleteById(new KeyForBaiHat_PlayList(idBaiHat,id));
       }
        
        playListRepository.deleteById(id);
    }

    @Override
    public PlayList updatePlayList(PlayList playList) {
    	PlayList editPlayList = new PlayList();
   
    	editPlayList = playListRepository.findById(playList.getIdPlayList()).get();
    	editPlayList.setTenPlayList(playList.getTenPlayList());
       
    	PlayList entity =  playListRepository.save(editPlayList);
		   return entity;
        }

	@Override
	public List<PlayList> findByName(String name) {
		   List<PlayList> list= new ArrayList<PlayList>();
	        list=playListRepository.findByName(name);   
	        return list;
	}
    
}
