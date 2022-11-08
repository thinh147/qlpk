package com.example.quanlyyta.entity.nhanvien;

import com.example.quanlyyta.entity.relation.CaLamViecYTa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "y_ta")
@Entity
@Getter
@Setter
public class YTa extends NhanVien {
    @Column(name = "chuyen_nganh")
    private String chuyenNganh;

    @OneToMany(mappedBy = "yta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CaLamViecYTa> caLamViecYTaList = new ArrayList<>();
}
