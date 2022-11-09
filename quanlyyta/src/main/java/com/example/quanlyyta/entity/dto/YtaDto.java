package com.example.quanlyyta.entity.dto;

import com.example.quanlyyta.entity.nhanvien.YTa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class YtaDto {
    private Integer id;

    private String username;

    private String ten;

    private String chuyenNganh;

    public YtaDto(YTa yTa){
        this.id = yTa.getId();
        this.username = yTa.getUsername();
        this.ten = yTa.getTen();
        this.chuyenNganh = yTa.getChuyenNganh();
    }
}
