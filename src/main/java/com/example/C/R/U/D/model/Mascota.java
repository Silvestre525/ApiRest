package com.example.C.R.U.D.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "mascota")
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

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
}