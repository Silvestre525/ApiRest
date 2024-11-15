package com.example.C.R.U.D.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "coche")
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

    @ManyToOne()
    @JoinColumn(name = "id_personas")
    private Persona persona;
}
