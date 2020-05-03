package com.example.api_cho_android.controller;

import com.example.api_cho_android.converter.DownloadConverter;
import com.example.api_cho_android.dto.DownloadDto;
import com.example.api_cho_android.model.Download;
import com.example.api_cho_android.service.impl.DownloadServiceImpl;
import com.example.api_cho_android.serviceImpl.BaiHatServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class DownloadController {
    @Autowired
    DownloadServiceImpl downloadService;
    @Autowired
    DownloadConverter downloadConverter;

   @Autowired
    BaiHatServiceImpl baiHatService;
    // Thêm 1 download
    @PostMapping("download/add-download")
   public DownloadDto addDownload(@RequestBody DownloadDto downloadDto){
    	Download download = downloadConverter.convertToEntity(downloadDto);
    	download.setBaiHat(baiHatService.findById(download.getIdBaiHat()));
       DownloadDto dto= downloadConverter.convertToDto( downloadService.addDownload(download));
       return dto;
    }
}
