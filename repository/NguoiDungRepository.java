package com.example.api_cho_android.repository;

import com.example.api_cho_android.model.Album;
import com.example.api_cho_android.model.NguoiDung;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung,Integer> {
	@Query("select nd from NguoiDung nd where nd.ten=?1")
	NguoiDung findByTenNguoiDung(String ten);


}
