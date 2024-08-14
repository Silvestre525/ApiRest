package com.example.C.R.U.D.service;
import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.DTO.MascotaDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();

    public List<Mascota> getMascotasByEspecie(String especie);

    public ResponseEntity<MascotaDto> postMascotas(MascotaDto mascotaDTO);

    public void deleteMascotas(Long id);

    public Mascota findMascota(Long id);

    public void editMascota(Long id, String nuevoNombre);
}
