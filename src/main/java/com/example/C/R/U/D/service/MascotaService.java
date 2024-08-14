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


    @Override
    public List<Mascota> getMascotasByEspecie(String especie) {
        // Utiliza la consulta personalizada
        return mascoRepo.findMascotasByEspecie(especie);
    }

    @Override
    public ResponseEntity<MascotaDto> postMascotas(MascotaDto mascotaDTO) {
        Mascota mascota = new Mascota();
        mascota.setNombre(mascotaDTO.getNombre());
        mascota.setEspecie(mascotaDTO.getEspecie());
        mascota.setRaza(mascotaDTO.getRaza());
        mascota.setColor(mascotaDTO.getColor());
        Mascota savedMascota = mascoRepo.save(mascota);
        MascotaDto savedMascotaDTO = new MascotaDto(savedMascota);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMascotaDTO);
    }

    @Override
    public void deleteMascotas(Long id){
        mascoRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masco = mascoRepo.findById(id).orElse(null);
        return masco;
    }

    @Override
    public void editMascota(Long idNueva, String nuevoNombre){
        Mascota mascota = this.findMascota(idNueva);

        mascota.setNombre(nuevoNombre);

        mascoRepo.save(mascota);


    }




}
