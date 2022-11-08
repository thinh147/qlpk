package com.example.quanlyyta.entity.nhanvien;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "quan_ly")
@Entity
public class QuanLy extends NhanVien {
}
