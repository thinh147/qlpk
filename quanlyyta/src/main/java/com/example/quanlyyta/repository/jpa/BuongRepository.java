package com.example.quanlyyta.repository.jpa;

import com.example.quanlyyta.entity.Buong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BuongRepository extends JpaRepository<Buong, Integer> {
    @Query(value = "select b from Buong b where b.sucChua < b.sucChuaToiDa")
    List<Buong> findBySucChuaLessThanAndSucChuaToiDa();
}
