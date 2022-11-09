package com.example.quanlyyta.controller;

import com.example.quanlyyta.entity.dto.DangNhapDto;
import com.example.quanlyyta.service.QuanLyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuanLyController {
    @GetMapping()
    public String redirectLoginForm(){
        return "redirect:/dang-nhap-form";
    }

    @Autowired
    private QuanLyService quanLyService;

    @PostMapping("/dang-nhap")
    public String postFormDangNhap(@ModelAttribute DangNhapDto dto){
        Boolean checkIsLogin = quanLyService.dangNhap(dto);
        if(checkIsLogin){
            return "redirect:/main";
        }
        return "/dang-nhap-form";
    }

    @GetMapping("/dang-nhap-form")
    public String getFormDangNhap(Model model) {
        model.addAttribute("dto", new DangNhapDto());
        return "form-dang-nhap";
    }
}
