package com.example.C.R.U.D.controller;

import com.example.C.R.U.D.repository.IMascotaRepository;
import com.example.C.R.U.D.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.C.R.U.D.model.Mascota;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/traer/mascotas")
    public List<Mascota> getMascotas(){
        return mascotaService.getMascotas();
    }

    @PostMapping("/subir/mascotas")
    public String postMascotas(@RequestBody Mascota masco){
        mascotaService.postMascotas(masco);
        return "La mascota fue subida con exito";
    }
}
