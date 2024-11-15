package com.example.C.R.U.D.repository;

import com.example.C.R.U.D.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IPersonRepository extends JpaRepository<Persona, Long>{
}