package com.example.api_cho_android.service;

import com.example.api_cho_android.model.Download;
import org.springframework.stereotype.Service;

@Service
public interface DownloadService {
	public Download addDownload(Download download);
}
