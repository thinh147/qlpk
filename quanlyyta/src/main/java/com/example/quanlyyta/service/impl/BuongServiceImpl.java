package com.example.quanlyyta.service.impl;

import com.example.quanlyyta.entity.Buong;
import com.example.quanlyyta.entity.CaLamViec;
import com.example.quanlyyta.entity.dto.BuongDto;
import com.example.quanlyyta.entity.dto.BuongListDto;
import com.example.quanlyyta.entity.dto.YtaDto;
import com.example.quanlyyta.entity.nhanvien.BacSi;
import com.example.quanlyyta.entity.nhanvien.YTa;
import com.example.quanlyyta.entity.relation.CaLamViecBuong;
import com.example.quanlyyta.entity.relation.CaLamViecYTa;
import com.example.quanlyyta.repository.dao.BacSyDao;
import com.example.quanlyyta.repository.dao.BuongDao;
import com.example.quanlyyta.service.BuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BuongServiceImpl implements BuongService {
    @Autowired
    private BuongDao buongDao;

    @Autowired
    private BacSyDao bacSyDao;

    @Override
    public List<BuongListDto> getListBuongThieu() {
        List<Buong> buongList = buongDao.findBuongThieu();
        return buongList.stream().map(BuongListDto::new).collect(Collectors.toList());
    }

    @Override
    public BuongDto findBuongById(Integer id) {
        Optional<Buong> buongOpt = buongDao.findBuongById(id);
        if (buongOpt.isEmpty()) {
            return null;
        }
        Buong buong = buongOpt.get();
        return buongToDto(buong);
    }

    private BuongDto buongToDto(Buong buong){
        BuongDto buongDto = new BuongDto();
        if(buong == null) return null;
        buongDto.setTenBuong(buong.getTen());
        Optional<BacSi> bacSi = bacSyDao.findBacSiByBuongId(buong.getId());
        BacSi bs = null;
        if(bacSi.isPresent()){
            bs = bacSi.get();
            buongDto.setTenBacSy(bs.getTen());
            buongDto.setChuyenNganh(bs.getChuyenNganh());
            buongDto.setMaBS("BS-" + bs.getId());
        }

        List<CaLamViecBuong> caLamViecBuongList = buong.getCaLamViecBuongList();
        if(!caLamViecBuongList.isEmpty()){
            List<CaLamViec> caLamViecList = caLamViecBuongList.stream().map(CaLamViecBuong::getCaLamViec).collect(Collectors.toList());
            List<CaLamViecYTa> caLamViecYTaList = new ArrayList<>();
            caLamViecList.forEach(item -> {
                caLamViecYTaList.addAll(item.getCaLamViecYTaList());
            });
            List<YtaDto> yTaList = caLamViecYTaList.stream().map(item -> {
                YTa yTa = item.getYta();
                return new YtaDto(yTa);
            }).collect(Collectors.toList());
            buongDto.setYtaDtoList(yTaList);
        }
        return buongDto;
    }
}
