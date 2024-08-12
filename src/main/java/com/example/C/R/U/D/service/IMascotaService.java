package com.example.C.R.U.D.service;
import com.example.C.R.U.D.model.Mascota;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();

    public void postMascotas(Mascota mascota);

    public void deleteMascotas(Long id);

    public Mascota findMascota(Long id);

    public void editMascota(Long id, String nuevoNombre);
}
