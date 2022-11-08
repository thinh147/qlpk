package com.example.quanlyyta.repository.dao;

import com.example.quanlyyta.entity.dto.DangNhapDto;
import com.example.quanlyyta.entity.nhanvien.QuanLy;

import java.util.Optional;

public interface QuanLyDao {
    Optional<QuanLy> findByUserNameAndPassword(String username, String password);
}
