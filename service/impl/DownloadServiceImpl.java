package com.example.api_cho_android.service.impl;

import com.example.api_cho_android.model.Download;
import com.example.api_cho_android.repository.DownloadRepository;
import com.example.api_cho_android.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DownloadServiceImpl implements DownloadService {
    @Autowired
    DownloadRepository downloadRepository;
    @Override
    public Download addDownload(Download download) {
    	Download dl= new Download();  
    	dl= downloadRepository.saveAndFlush(download);
        return dl;
    }
}
