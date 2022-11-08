package com.example.quanlyyta.entity;

import com.example.quanlyyta.entity.relation.CaLamViecBuong;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "buong")
@Getter
@Setter
public class Buong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "suc_chua")
    private String sucChua;

    @Column(name = "suc_chua_toi_da")
    private String sucChuaToiDa;

    @Column(name = "mo_ta")
    private String mota;

    @OneToMany(mappedBy = "buong", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CaLamViecBuong> caLamViecBuongList = new ArrayList<>();
}
