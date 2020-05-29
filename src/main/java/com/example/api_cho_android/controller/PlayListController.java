package com.example.api_cho_android.controller;

import com.example.api_cho_android.converter.PlayListConverter;
import com.example.api_cho_android.dto.PlayListDto;
import com.example.api_cho_android.model.PlayList;
import com.example.api_cho_android.service.impl.PlayListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PlayListController {
    @Autowired
    PlayListServiceImpl playListService;
   
    @Autowired
    
    PlayListConverter playListConverter;
    
    // lấy thông tin playlist
   @GetMapping("playlist/find-by-id")
   public  PlayListDto findById(@RequestParam(value="id") int id){
        return playListConverter.convertToDto(playListService.findById(id));
    }
  
    // Tìm playlist theo tên
   @GetMapping("playlist/find-by-name")
   public List<PlayListDto> findPlayListByName( @RequestParam(value="name") String name){
        return playListConverter.convertToDto(playListService.findByName(name));
    }

    // lấy tất cả playlist của người dùng
   @GetMapping("playlist/find-by-idnguoidung")
   public List<PlayListDto> findPlayListByIdNguoiDung(@RequestParam(value="id") int id){
        return playListConverter.convertToDto(playListService.findByIdNguoiDung(id));
    }

    // Cập nhật tên playlist
  @PutMapping("playlist/edit-playlist")
  public PlayListDto updatePlayList(@RequestBody PlayListDto playListDto){
	  PlayList playList = playListConverter.convertToEntity(playListDto);
	  PlayListDto dto = playListConverter.convertToDto(playListService.updatePlayList(playList));
		return dto;
    }

    // Thêm playlist
   @PostMapping("playlist/add-playlist")
   public  PlayListDto addPlayList(@RequestBody PlayListDto playListDto){
	   PlayList playList = playListConverter.convertToEntity(playListDto);
	   PlayListDto dto = playListConverter.convertToDto(playListService.addPlayList(playList));
      return dto;
    }

    // Xóa 1 playlist
   @DeleteMapping("playlist/delete-playlist")
  public  void dellPlayList(@RequestParam(value="id") int id){
        playListService.deletePlayList(id);
    }
}
