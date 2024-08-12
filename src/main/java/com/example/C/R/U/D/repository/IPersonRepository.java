package com.example.C.R.U.D.repository;

import com.example.C.R.U.D.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Mapeamos como repositorio
//La interfaz exitiende de JpaRepository (que maneja repositorios JPA)
// en los parametros <> debe ir la clase del modelo a persistir y tipo de dato de su id
public interface IPersonRepository extends JpaRepository<Persona, Long>{
}

