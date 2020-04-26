package com.example.api_cho_android.repository;

import com.example.api_cho_android.keyclass.KeyForDownload;
import com.example.api_cho_android.model.Download;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadRepository extends JpaRepository<Download, KeyForDownload> {
}
