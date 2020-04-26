package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.model.PlayList;
import com.example.api_cho_android.repository.PlayListRepository;
import com.example.api_cho_android.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayListServiceImpl implements PlayListService {
    @Autowired
    PlayListRepository playListRepository;
    @Override
    public PlayList findById(int id) {
        Optional<PlayList> playList=playListRepository.findById(id);
        return playList.isPresent()?playList.get():null;
    }

    @Override
    public List<PlayList> findByName(String name,int idNguoiDung) {
        List<PlayList> list=playListRepository.findAll();
        List<PlayList> playLists= new ArrayList<PlayList>();
        for(PlayList pl:list){
            if(pl.getTenPlayList().equals(name)&&pl.getIdNguoiDung()==idNguoiDung){
                playLists.add(pl);
            }
        }
        return playLists;
    }

    @Override
    public List<PlayList> findByIdNguoiDung(int idNguoiDung) {
        List<PlayList> list=playListRepository.findAll();
        List<PlayList> playLists= new ArrayList<PlayList>();
        for(PlayList pl:list){
            if(pl.getIdNguoiDung()==idNguoiDung){
                playLists.add(pl);
            }
        }
        return playLists;
    }

    @Override
    public void addPlayList(PlayList playList) {
        playListRepository.save(playList);
    }

    @Override
    public void delPlayListByNguoiDung(int id) {
        playListRepository.deleteById(id);
    }

    @Override
    public void updatePlayList(int id, PlayList playList) {
        Optional<PlayList> pl=playListRepository.findById(id);
        if(pl.isPresent()){
            pl.get().setTenPlayList(playList.getTenPlayList());
            playListRepository.save(pl.get());
        }
    }
}
