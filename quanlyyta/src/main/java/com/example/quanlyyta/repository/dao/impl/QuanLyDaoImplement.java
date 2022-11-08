package com.example.quanlyyta.repository.dao.impl;

import com.example.quanlyyta.entity.dto.DangNhapDto;
import com.example.quanlyyta.entity.nhanvien.QuanLy;
import com.example.quanlyyta.repository.dao.QuanLyDao;
import com.example.quanlyyta.repository.jpa.QuanLyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public class QuanLyDaoImplement implements QuanLyDao {
    @Autowired
    private QuanLyRepository quanLyRepository;

    @Override
    public Optional<QuanLy> findByUserNameAndPassword(String username, String password) {
        return quanLyRepository.findByUsernameAndPassword(username, password);
    }
}
