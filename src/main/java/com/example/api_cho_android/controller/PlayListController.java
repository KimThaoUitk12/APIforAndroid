package com.example.api_cho_android.controller;

import com.example.api_cho_android.model.PlayList;
import com.example.api_cho_android.service.impl.PlayListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayListController {
    @Autowired
    PlayListServiceImpl playListService;
    // lấy thông tin playlist
    @RequestMapping(method = RequestMethod.GET, value = "/playlist/{id}")
    PlayList getPlayList(@PathVariable int id){
        return playListService.findById(id);
    }

    // Tìm playlist theo tên
    @RequestMapping(method = RequestMethod.GET, value = "/playlist/{id}/{name}")
    List<PlayList> getPlayListByNam(@PathVariable int id, @PathVariable String name){
        return playListService.findByName(name,id);
    }

    // lấy tất cả playlist của người dùng
    @RequestMapping(method = RequestMethod.GET, value = "/playlist/nguoidung/{id}")
    List<PlayList> getPlayListByNguoiDung(@PathVariable int id){
        return playListService.findByIdNguoiDung(id);
    }

    // Cập nhật tên playlist
    @RequestMapping(method = RequestMethod.PUT, value = "/updateplaylist")
    void updatePlayList(@RequestBody PlayList playList){
        playListService.updatePlayList(playList.getIdNguoiDung(),playList);
    }

    // Thêm playlist
    @RequestMapping(method = RequestMethod.POST, value = "/addplaylist")
    void addPlayList(PlayList playList){
        playListService.addPlayList(playList);
    }

    // Xóa 1 playlist
    @RequestMapping(method = RequestMethod.DELETE, value = "/delplaylist/{id}")
    void dellPlayList(@PathVariable int id){
        playListService.delPlayList(id);
    }
}
