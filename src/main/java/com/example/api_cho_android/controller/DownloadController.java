package com.example.api_cho_android.controller;

import com.example.api_cho_android.model.Download;
import com.example.api_cho_android.service.impl.DownloadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {
    @Autowired
    DownloadServiceImpl downloadService;

    // Thêm 1 download
    @RequestMapping(method = RequestMethod.POST, value = "/adđownload")
    void addDownload(Download download){
        downloadService.addDownload(download);
    }
}
