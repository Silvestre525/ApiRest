package com.example.C.R.U.D.controller;

import com.example.C.R.U.D.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.DTO.MascotaDto;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/traer/mascotas")
    public List<Mascota> getMascotas(){
        return mascotaService.getMascotas();
    }

    @GetMapping("/especie/{especie}")
    public ResponseEntity<List<Mascota>> getMascotasByEspecie(@PathVariable String especie) {
        List<Mascota> mascotas = mascotaService.getMascotasByEspecie(especie);
        return ResponseEntity.ok(mascotas);
    }

    @PostMapping("/subir/mascotas")
    public String postMascotas(@RequestBody Mascota masco) {
        // Convertir Mascota a MascotaDto
        MascotaDto mascotaDTO = new MascotaDto(masco);

        // Llamar al servicio con el DTO
        mascotaService.postMascotas(mascotaDTO);

        return "La mascota fue subida con éxito";
    }
}
