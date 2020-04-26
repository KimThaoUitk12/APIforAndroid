package com.example.api_cho_android.repository;

import com.example.api_cho_android.model.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayListRepository extends JpaRepository<PlayList,Integer> {
}
