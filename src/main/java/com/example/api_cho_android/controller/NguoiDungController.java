package com.example.api_cho_android.controller;

import com.example.api_cho_android.model.NguoiDung;
import com.example.api_cho_android.service.impl.NguoiDungServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NguoiDungController {
    @Autowired
    private NguoiDungServiceImpl nguoiDungService;

    // lấy thông tin người dùng
    @RequestMapping(method = RequestMethod.GET, value = "nguoidung/{id}")
    NguoiDung getNguoiDung(@PathVariable String id){
        return nguoiDungService.getNguoiDung(Integer.parseInt(id));
    }

    // thêm người dùng
    @RequestMapping(method=RequestMethod.POST, value = "/addnguoidung")
    void addNguoiDung(@RequestBody NguoiDung nguoiDung){
        nguoiDungService.addNguoiDung(nguoiDung);
    }

    // xóa người dùng
    @RequestMapping(method = RequestMethod.DELETE, value = "/delnguoidung/{id}")
    void delNguoiDung(@PathVariable String id){
        nguoiDungService.delNguoiDung(Integer.parseInt(id));
    }

    // Cập nhật mật khẩu
    @RequestMapping(method = RequestMethod.PUT, value = "/updatenguoidung/{id}")
    void updateNguoiDung(@RequestBody NguoiDung nguoiDung, @PathVariable int id){
        nguoiDungService.updatePass(id,nguoiDung);
    }
}
