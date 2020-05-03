package com.example.api_cho_android.service;

import com.example.api_cho_android.model.BaiHat_PlayList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public interface BaiHat_PlayListService {
	public BaiHat_PlayList addBaiHat_PlayList(BaiHat_PlayList baiHat_playList);
	public void delBaiHat_PlayList(int idBaiHat,int idPlayList);
    public void delete1List(int idPlayList);
}
