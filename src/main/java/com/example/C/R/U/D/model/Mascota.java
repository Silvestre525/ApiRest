package com.example.C.R.U.D.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Mascota{

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String raza;
    private Integer edad;

    //Metodos
    public Mascota(){
    }

    public Mascota(String nombre, String raza, Integer edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

}