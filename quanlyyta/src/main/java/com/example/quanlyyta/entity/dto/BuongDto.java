package com.example.quanlyyta.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BuongDto {
    private String tenBuong;
    private String tenBacSy;
    private String maBS;
    private String chuyenNganh;
    private List<YtaDto> ytaDtoList;
    private String status;
}
