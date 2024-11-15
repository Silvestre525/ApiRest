package com.example.C.R.U.D.service;
import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.DTO.MascotaDto;
import com.example.C.R.U.D.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> mascotas = (List<Mascota>) mascoRepo.findAll();
        return mascotas;
    }


}
