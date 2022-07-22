package com.example.gqstests2.repository;

import com.example.gqstests2.model.Sapatos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SapatosRepository extends JpaRepository<Sapatos, Long> {
    Sapatos findSapatosById(Long Id);
}