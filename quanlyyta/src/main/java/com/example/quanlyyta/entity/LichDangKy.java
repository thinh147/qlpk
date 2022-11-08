package com.example.quanlyyta.entity;

import com.example.quanlyyta.entity.nhanvien.BacSi;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lich_dang_ky")
@Getter
@Setter
public class LichDangKy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mo_ta")
    private Integer moTa;

    @OneToMany(mappedBy = "lichDangKy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CaLamViec> caLamViecList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "bac_si_id", referencedColumnName = "id")
    private BacSi bacSi;
}
