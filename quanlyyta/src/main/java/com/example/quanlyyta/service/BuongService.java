package com.example.quanlyyta.service;

import com.example.quanlyyta.entity.Buong;
import com.example.quanlyyta.entity.dto.BuongDto;
import com.example.quanlyyta.entity.dto.BuongListDto;

import java.util.List;

public interface BuongService {
    List<BuongListDto> getListBuongThieu();
    BuongDto findBuongById(Integer id);
}
