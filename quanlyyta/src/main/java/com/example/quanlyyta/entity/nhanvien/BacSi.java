package com.example.quanlyyta.entity.nhanvien;

import com.example.quanlyyta.entity.LichDangKy;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "bac_si")
@Entity
public class BacSi extends NhanVien {
    @Column(name = "chuyen_nganh")
    private String chuyenNganh;

    @OneToMany(mappedBy = "bacSi", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LichDangKy> lichDangKyList = new ArrayList<>();
}
