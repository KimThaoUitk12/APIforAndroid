package com.example.api_cho_android.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.api_cho_android.model.CaSi;

@Repository
public interface CaSiRepository extends JpaRepository<CaSi,Integer> {
	
	@Query("Select cs from CaSi cs where cs.tenCaSi=?1")
	List<CaSi> findByName(String tenCaSi);
}
