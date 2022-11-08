package com.example.quanlyyta.controller;

import com.example.quanlyyta.entity.dto.DangNhapDto;
import com.example.quanlyyta.service.QuanLyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuanLyController {

    @Autowired
    private QuanLyService quanLyService;

    @PostMapping("/dang-nhap-form")
    public String postFormDangNhap(@ModelAttribute DangNhapDto dto){
        Boolean checkIsLogin = quanLyService.dangNhap(dto);
        if(checkIsLogin){
            return "redirect:/dang-nhap-form";
        }
        return "";
    }

    @GetMapping("/dang-nhap-form")
    public String getFormDangNhap() {
        return "form-dang-nhap";
    }

    @GetMapping()
    @ResponseBody
    public String test(){
        return "hello";
    }
}
