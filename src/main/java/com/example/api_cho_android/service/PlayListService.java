package com.example.api_cho_android.service;

import com.example.api_cho_android.model.PlayList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayListService {
	
   public PlayList findById(int id);
    
   public  List<PlayList> findByName(String name);
    
   public List<PlayList> findByIdNguoiDung(int idNguoiDung);
    
   public  PlayList addPlayList(PlayList playList);
    
   public   void deletePlayList(int id);
    
   public PlayList updatePlayList( PlayList playList);
}
