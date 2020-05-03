package com.example.api_cho_android.repository;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;
import com.example.api_cho_android.model.BaiHat_PlayList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiHat_PlayListRepository extends JpaRepository<BaiHat_PlayList, KeyForBaiHat_PlayList> {
   @Query("select bhpl from BaiHat_PlayList bhpl where bhpl.idPlayList=?1")
    List<BaiHat_PlayList> findByIdPlayList(int idPlayList);
}
