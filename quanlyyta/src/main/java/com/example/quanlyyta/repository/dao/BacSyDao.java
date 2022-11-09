package com.example.quanlyyta.repository.dao;

import com.example.quanlyyta.entity.nhanvien.BacSi;

import java.util.Optional;

public interface BacSyDao {
    Optional<BacSi> findBacSiByBuongId(Integer buongId);
}
