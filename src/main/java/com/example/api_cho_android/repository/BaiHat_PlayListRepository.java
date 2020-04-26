package com.example.api_cho_android.repository;

import com.example.api_cho_android.keyclass.KeyForBaiHat_PlayList;
import com.example.api_cho_android.model.BaiHat_PlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaiHat_PlayListRepository extends JpaRepository<BaiHat_PlayList, KeyForBaiHat_PlayList> {
}
