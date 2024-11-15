package com.example.C.R.U.D.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Coche{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String marca;
    private Integer modelo;
    private String color;

    public Coche(){

    }
    public Coche(String marca, Integer modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
}
