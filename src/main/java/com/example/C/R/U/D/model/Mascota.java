package com.example.C.R.U.D.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    public Mascota() {
    }

    public Mascota(String nombre, Long id, String especie, String color, String raza) {
        this.nombre = nombre;
        this.id = id;
        this.especie = especie;
        this.color = color;
        this.raza = raza;
    }

}
