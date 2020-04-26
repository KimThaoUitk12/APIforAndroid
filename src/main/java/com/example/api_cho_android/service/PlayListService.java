package com.example.api_cho_android.service;

import com.example.api_cho_android.model.PlayList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayListService {
    PlayList findById(int id);
    List<PlayList> findByName(String name, int idNguoiDung);
    List<PlayList> findByIdNguoiDung(int idNguoiDung);
    void addPlayList(PlayList playList);
    void delPlayListByNguoiDung(int id);
    void updatePlayList(int id, PlayList playList);
}
