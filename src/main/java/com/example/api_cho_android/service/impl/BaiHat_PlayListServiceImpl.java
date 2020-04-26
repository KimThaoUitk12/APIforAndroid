package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;
import com.example.api_cho_android.model.BaiHat_PlayList;
import com.example.api_cho_android.repository.BaiHat_PlayListRepository;
import com.example.api_cho_android.service.BaiHat_PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public class BaiHat_PlayListServiceImpl implements BaiHat_PlayListService {
    @Autowired
    BaiHat_PlayListRepository baiHat_playListRepository;
    @Override
    public void addBaiHat_PlayList(BaiHat_PlayList baiHat_playList) {
        baiHat_playListRepository.save(baiHat_playList);
    }

    @Override
    public void delBaiHat_PlayList(int idBaiHat, int idPlayList) {
        baiHat_playListRepository.deleteById(new KeyForBaiHat_PlayList(idBaiHat,idPlayList));
    }

    @Override
    @Modifying
    @Query("delete from BaiHat_PlayList bhpl where bhpl.idPlayList=:idPlayList")
    public void delete1List(@Param("idPlayList") int idPlayList) {
        //
    }
}
