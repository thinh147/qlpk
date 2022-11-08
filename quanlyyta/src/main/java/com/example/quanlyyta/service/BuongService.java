package com.example.quanlyyta.service;

import com.example.quanlyyta.entity.Buong;

import java.util.List;

public interface BuongService {
    List<Buong> getListBuongThieu();
    Buong findBuongById(Integer id);
}
