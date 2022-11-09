package com.example.quanlyyta.controller;

import com.example.quanlyyta.entity.dto.BuongListDto;
import com.example.quanlyyta.service.BuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/buong")
public class BuongController {
    @Autowired
    private BuongService buongService;

    @GetMapping()
    public String getDanhSachBuong(Model model){
        List<BuongListDto> buongListDtoList = buongService.getListBuongThieu();
        model.addAttribute("buongList", buongListDtoList);
        return "/gd-danh-sach-buong";
    }

    @GetMapping("/detail")
    public String getDanhSachBuong(){
        return "qlpk";
    }

    @PostMapping("dang-ky-lich")
    public String dangKyLich(){
        return "/redirect:/buong";
    }
}
