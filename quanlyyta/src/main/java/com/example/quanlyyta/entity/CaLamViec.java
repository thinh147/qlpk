package com.example.quanlyyta.entity;

import com.example.quanlyyta.entity.relation.CaLamViecBuong;
import com.example.quanlyyta.entity.relation.CaLamViecYTa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ca_lam_viec")
@Getter
@Setter
public class CaLamViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "thoi_gian_bd")
    private Integer thoiGianBd;

    @Column(name = "thoi_gian_kt")
    private Integer thoiGianKt;

    @Column(name = "ngay")
    private Date ngay;

    @Column(name = "mo_ta")
    private String moTa;

    @OneToMany(mappedBy = "caLamViec", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CaLamViecBuong> caLamViecBuongList = new ArrayList<>();


    @OneToMany(mappedBy = "caLamViec", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CaLamViecYTa> caLamViecYTaList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "lich_dang_ky_id", referencedColumnName = "id")
    private LichDangKy lichDangKy;
}
