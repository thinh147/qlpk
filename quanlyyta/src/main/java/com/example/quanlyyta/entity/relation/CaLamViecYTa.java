package com.example.quanlyyta.entity.relation;

import com.example.quanlyyta.entity.Buong;
import com.example.quanlyyta.entity.CaLamViec;
import com.example.quanlyyta.entity.nhanvien.YTa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ca_lam_viec_yta")
public class CaLamViecYTa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "yta_id", referencedColumnName = "id")
    private YTa yta;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "ca_lam_viec_id", referencedColumnName = "id")
    private CaLamViec caLamViec;
}
