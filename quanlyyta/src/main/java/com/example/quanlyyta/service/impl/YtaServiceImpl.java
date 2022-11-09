package com.example.quanlyyta.service.impl;

import com.example.quanlyyta.entity.dto.YtaDto;
import com.example.quanlyyta.repository.dao.YtaDao;
import com.example.quanlyyta.service.YtaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class YtaServiceImpl implements YtaService {
    @Autowired
    private YtaDao ytaDao;
    @Override
    public List<YtaDto> findAllYta() {
        return ytaDao.getListYta().stream().map(YtaDto::new).collect(Collectors.toList());
    }
}
