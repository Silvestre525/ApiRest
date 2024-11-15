package com.example.C.R.U.D.service;
import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.DTO.MascotaDto;
import com.example.C.R.U.D.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<MascotaDto> getMascotas(){

        //Traer todas las mascotas del repository
        List<Mascota> mascotas = mascoRepo.findAll();

        //Convertir todas esa lista de mascotas a MascotasDTO
        List<MascotaDto> mascotasDTOS = mascotas.stream()
                .map(mascota -> {
                    MascotaDto dto = new MascotaDto();
                    dto.setNombre(mascota.getNombre());
                    dto.setEdad(mascota.getEdad());
                    return dto;
                }).collect(Collectors.toList());   //guarda todo en una lista

        return mascotasDTOS;

    }

}
