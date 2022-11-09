package com.example.quanlyyta.entity.dto;

import com.example.quanlyyta.entity.Buong;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BuongListDto {
    private String ten;

    private String sucChua;

    private String sucChuaToiDa;

    private String mota;

    public BuongListDto(Buong buong){
        this.ten = buong.getTen();
        this.sucChua = buong.getSucChua();
        this.sucChuaToiDa = buong.getSucChuaToiDa();
        this.mota = buong.getMota();
    }
}
