package com.example.C.R.U.D.DTO;

import com.example.C.R.U.D.model.Mascota;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MascotaDto {

    private String nombre;
    private String especie;
    private String raza;
    private String color;

    // Constructor opcional para crear un DTO a partir de una Mascota
    public MascotaDto(Mascota mascota) {
        this.nombre = mascota.getNombre();
        this.especie = mascota.getEspecie();
        this.raza = mascota.getRaza();
        this.color = mascota.getColor();
    }
}
