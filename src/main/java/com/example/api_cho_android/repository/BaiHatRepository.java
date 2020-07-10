package com.example.api_cho_android.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.api_cho_android.model.BaiHat;

@Repository 
public interface BaiHatRepository extends JpaRepository<BaiHat,Integer>{

	@Query("select b from BaiHat b where b.tenBaiHat=?1")
	List<BaiHat> findBaiHatByTenBaiHat(String tenBaiHat);
	
	@Query("select b from BaiHat b where b.idCaSi=?1")
	List<BaiHat> findBaiHatByIdCasi(int idCaSi);
	
	@Query("select b from BaiHat b where b.idAlbum=?1")
	List<BaiHat> findBaiHatByIdAlbum(int idAlbum);
	
	@Query("select b from BaiHat b where b.tenBaiHat LIKE %?1%")
	List<BaiHat> findBaiHatByStringLike(String tenbaihat);
}
