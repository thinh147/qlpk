package com.example.quanlyyta.repository.jpa;

import com.example.quanlyyta.entity.nhanvien.BacSi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BacSyRepository extends JpaRepository<BacSi, Integer> {
    @Query("SELECT bs from BacSi bs " +
            "left join bs.lichDangKyList ldk " +
            "left join ldk.caLamViecList clv " +
            "left join clv.caLamViecBuongList clvb " +
            "left join clvb.buong b " +
            "where b.id = :buongId")
    Optional<BacSi> findBacSiByBuongId(@Param("buongId") Integer buongId);
}
