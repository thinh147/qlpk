package com.example.quanlyyta.entity.relation;

import com.example.quanlyyta.entity.Buong;
import com.example.quanlyyta.entity.CaLamViec;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ca_lam_viec_buong")
public class CaLamViecBuong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "buong_id", referencedColumnName = "id")
    private Buong buong;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "ca_lam_viec_id", referencedColumnName = "id")
    private CaLamViec caLamViec;
}
