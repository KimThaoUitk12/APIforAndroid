package com.example.api_cho_android.repository;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;
import com.example.api_cho_android.model.BaiHat_PlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiHat_PlayListRepository extends JpaRepository<BaiHat_PlayList, KeyForBaiHat_PlayList> {
    @Query("delete from BaiHat_PlayList bhpl where bhpl.idPlayList=:idPlayList")
    void delete1List(@Param("idPlayList")int idPlayList);
}
