package com.example.quanlyyta.repository.dao.impl;

import com.example.quanlyyta.entity.Buong;
import com.example.quanlyyta.repository.dao.BuongDao;
import com.example.quanlyyta.repository.jpa.BuongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BuongDaoImpl implements BuongDao {
    @Autowired
    private BuongRepository buongRepository;

    @Override
    public List<Buong> findBuongThieu() {
        return buongRepository.findBySucChuaLessThanAndSucChuaToiDa();
    }

    @Override
    public List<Buong> findAll() {
        return buongRepository.findAll();
    }

    @Override
    public Optional<Buong> findBuongById(Integer id) {
        return buongRepository.findById(id);
    }
}
