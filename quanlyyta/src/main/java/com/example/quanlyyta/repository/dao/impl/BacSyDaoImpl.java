package com.example.quanlyyta.repository.dao.impl;

import com.example.quanlyyta.entity.nhanvien.BacSi;
import com.example.quanlyyta.repository.dao.BacSyDao;
import com.example.quanlyyta.repository.jpa.BacSyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BacSyDaoImpl implements BacSyDao {
    @Autowired
    private BacSyRepository bacSyRepository;
    @Override
    public Optional<BacSi> findBacSiByBuongId(Integer buongId) {

        return bacSyRepository.findBacSiByBuongId(buongId);
    }
}
