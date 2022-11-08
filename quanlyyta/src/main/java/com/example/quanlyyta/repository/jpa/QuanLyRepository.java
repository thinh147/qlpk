package com.example.quanlyyta.repository.jpa;

import com.example.quanlyyta.entity.nhanvien.QuanLy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface QuanLyRepository extends JpaRepository<QuanLy, Integer> {
    @Query(value = "select q from QuanLy q where q.username = :username and q.password = :password")
    Optional<QuanLy> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
