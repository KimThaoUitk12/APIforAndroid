package com.example.api_cho_android.service;

import com.example.api_cho_android.model.BaiHat_PlayList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public interface BaiHat_PlayListService {
    void addBaiHat_PlayList(BaiHat_PlayList baiHat_playList);
    void delBaiHat_PlayList(int idBaiHat,int idPlayList);
    void delete1List(@Param("idPlayList")int idPlayList);
}
