package com.example.api_cho_android.repository;

import com.example.api_cho_android.model.PlayList;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayListRepository extends JpaRepository<PlayList,Integer> {
	@Query("select p from PlayList p where p.tenPlayList=?1 ")
	List<PlayList> findByName (String name);
	@Query("select p from PlayList p where p.idNguoiDung=?1 ")
	List<PlayList> findByIdNguoiDung (int idNguoiDung );
}
