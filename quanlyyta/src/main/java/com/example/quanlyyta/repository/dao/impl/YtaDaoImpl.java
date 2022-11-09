package com.example.quanlyyta.repository.dao.impl;

import com.example.quanlyyta.entity.nhanvien.YTa;
import com.example.quanlyyta.repository.dao.YtaDao;
import com.example.quanlyyta.repository.jpa.YtaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class YtaDaoImpl implements YtaDao {
    @Autowired
    private YtaRepository ytaRepository;

    @Override
    public List<YTa> getListYta() {
        return ytaRepository.findAll();
    }
}
