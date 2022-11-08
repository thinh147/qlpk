package com.example.quanlyyta.service.impl;

import com.example.quanlyyta.entity.dto.DangNhapDto;
import com.example.quanlyyta.entity.nhanvien.QuanLy;
import com.example.quanlyyta.repository.dao.QuanLyDao;
import com.example.quanlyyta.service.QuanLyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuanLyServiceImpl implements QuanLyService {
    @Autowired
    private QuanLyDao quanLyDao;

    @Override
    public Boolean dangNhap(DangNhapDto dto) {
        Optional<QuanLy> quanLy = quanLyDao.findByUserNameAndPassword(dto.getUsername(), dto.getPassword());
        return quanLy.isPresent();
    }
}
