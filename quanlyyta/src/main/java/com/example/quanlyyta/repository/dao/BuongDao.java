package com.example.quanlyyta.repository.dao;

import com.example.quanlyyta.entity.Buong;

import java.util.List;
import java.util.Optional;

public interface BuongDao {
    List<Buong> findBuongThieu();
    List<Buong> findAll();
    Optional<Buong> findBuongById(Integer id);
}
