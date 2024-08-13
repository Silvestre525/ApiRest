package com.example.C.R.U.D.service;
import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota>getMascotas(){
        List<Mascota> mascotas = mascoRepo.findAll();
        return mascotas;
    }

    @Override
    public void postMascotas(Mascota mascota){
        mascoRepo.save(mascota);

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

        this.postMascotas(mascota);


    }




}
