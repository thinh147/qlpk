package com.example.quanlyyta.service.impl;

import com.example.quanlyyta.entity.Buong;
import com.example.quanlyyta.repository.dao.BuongDao;
import com.example.quanlyyta.service.BuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuongServiceImpl implements BuongService {
    @Autowired
    private BuongDao buongDao;

    @Override
    public List<Buong> getListBuongThieu() {
        return buongDao.findBuongThieu();
    }

    @Override
    public Buong findBuongById(Integer id) {
        Optional<Buong> buongOpt = buongDao.findBuongById(id);
        if(buongOpt.isEmpty()){
            return null;
        }
        return buongOpt.get();
    }
}
