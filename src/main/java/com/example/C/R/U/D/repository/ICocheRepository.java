package com.example.C.R.U.D.repository;

import com.example.C.R.U.D.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICocheRepository extends JpaRepository<Coche, Long> {
}
