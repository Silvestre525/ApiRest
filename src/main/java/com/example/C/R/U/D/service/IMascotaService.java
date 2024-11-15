package com.example.C.R.U.D.service;
import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.DTO.MascotaDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IMascotaService {
    public List<MascotaDto> getMascotas();
}
