package com.example.api_cho_android.controller;

import com.example.api_cho_android.converter.BaiHat_PlayListConverter;
import com.example.api_cho_android.dto.BaiHatDto;
import com.example.api_cho_android.dto.BaiHat_PlayListDto;
import com.example.api_cho_android.model.BaiHat;
import com.example.api_cho_android.model.BaiHat_PlayList;
import com.example.api_cho_android.service.impl.BaiHat_PlayListServiceImpl;
import com.example.api_cho_android.serviceImpl.BaiHatServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaiHat_PlayListController {
    @Autowired
    BaiHat_PlayListServiceImpl baiHat_playListService;
    
    @Autowired
    BaiHat_PlayListConverter baiHat_playListConverter;
    
    @Autowired
    BaiHatServiceImpl baiHatService;
    
    // thêm 1 bài hát vào playlist
    @PostMapping("baihat_playlist/add-baihat_playlist")
	public BaiHat_PlayListDto addBaiHat_PlayList(@RequestBody BaiHat_PlayListDto baiHat_PlayListDto) {
    	BaiHat_PlayList bhpl = baiHat_playListConverter.convertToEntity(baiHat_PlayListDto);
    	bhpl.setBaiHat(baiHatService.findById(bhpl.getIdBaiHat()));
    	BaiHat_PlayListDto dto = baiHat_playListConverter.convertToDto(baiHat_playListService.addBaiHat_PlayList(bhpl));
		return dto;
	}
    
  

    
    // xóa 1 bài hát khỏi playlist
   @DeleteMapping("baihat_playlist/delete-baihat")
    void delBaiHat_PlayList( @RequestParam(value="idPlayList") int idPlayList,@RequestParam(value="idBaiHat") int idBaiHat){
        baiHat_playListService.delBaiHat_PlayList(idBaiHat,idPlayList);
    }

   // xóa tất cả bài hát trong 1 list
   @DeleteMapping("baihat_playlist/delete-playlist")
    void dell1PlayList(@RequestParam(value="idPlayList")  int idPlayList){
        baiHat_playListService.delete1List(idPlayList);
    }
}
