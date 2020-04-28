package com.example.api_cho_android.repository;

import com.example.api_cho_android.keyclass.KeyForDownload;
import com.example.api_cho_android.model.Download;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DownloadRepository extends JpaRepository<Download, KeyForDownload> {
}
