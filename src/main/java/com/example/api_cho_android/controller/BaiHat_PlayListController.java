package com.example.api_cho_android.controller;

import com.example.api_cho_android.model.BaiHat_PlayList;
import com.example.api_cho_android.service.impl.BaiHat_PlayListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaiHat_PlayListController {
    @Autowired
    BaiHat_PlayListServiceImpl baiHat_playListService;
    // thêm 1 bài hát vào playlist
    @RequestMapping(method = RequestMethod.POST, value = "/addbaihat_playlist")
    void addBaiHat_PlayList(BaiHat_PlayList baiHat_playList){
        baiHat_playListService.addBaiHat_PlayList(baiHat_playList);
    }

    // xóa 1 bài hát khỏi playlist
    @RequestMapping(method = RequestMethod.DELETE, value = "/delBaiHat_PlayList")
    void delBaiHat_PlayList(int idBaiHat, int idPlayList){
        baiHat_playListService.delBaiHat_PlayList(idBaiHat,idPlayList);
    }

    //xóa tất cả bài hát trong 1 list
    @RequestMapping(method = RequestMethod.DELETE, value = "/del1PlayList/{id}")
    void dell1PlayList(@PathVariable int idPlayList){
        baiHat_playListService.delete1List(idPlayList);
    }
}
