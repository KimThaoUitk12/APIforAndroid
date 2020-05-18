package com.example.api_cho_android.controller;

import com.example.api_cho_android.converter.NguoiDungConverter;
import com.example.api_cho_android.dto.NguoiDungDto;
import com.example.api_cho_android.model.NguoiDung;
import com.example.api_cho_android.service.impl.NguoiDungServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class NguoiDungController {
    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    @Autowired
    private NguoiDungConverter nguoidungConverter;
    
    // lấy thông tin người dùng
   @GetMapping("nguoidung/find-by-id")
  public  NguoiDungDto getNguoiDung(@RequestParam(value="id") int id){
	   
        return nguoidungConverter.convertToDto(nguoiDungService.getNguoiDung(id));
    }

   @GetMapping("nguoidung/find-by-ten")
  public  NguoiDungDto findByTenNguoiDung(@RequestParam(value="ten") String ten){
        return nguoidungConverter.convertToDto(nguoiDungService.findByTen(ten));
    }

    // thêm người dùng
   @PostMapping("nguoidung/add-nguoidung")
   public  NguoiDungDto addNguoiDung(@RequestBody NguoiDungDto nguoiDungDto){
	   NguoiDung nguoiDung =nguoidungConverter.convertToEntity(nguoiDungDto);
	   NguoiDungDto   dto=  nguoidungConverter.convertToDto(nguoiDungService.addNguoiDung(nguoiDung));
	   return dto;
    }

    // xóa người dùng
   @DeleteMapping("nguoidung/delete-nguoidung")
    public  void delNguoiDung(@RequestParam(value="id") int id){
        nguoiDungService.deleteNguoiDung(id);
    }

    // Cập nhật mật khẩu
   @PutMapping("nguoidung/update-nguoidung")
    public  NguoiDungDto updateNguoiDung(@RequestBody NguoiDungDto nguoiDungDto){
	   NguoiDung nguoiDung = nguoidungConverter.convertToEntity(nguoiDungDto);
	   NguoiDungDto   dto=  nguoidungConverter.convertToDto(nguoiDungService.updatePass(nguoiDung));
	   return dto;
    }
}
