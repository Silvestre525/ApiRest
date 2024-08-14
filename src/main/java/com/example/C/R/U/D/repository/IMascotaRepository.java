package com.example.C.R.U.D.repository;

import com.example.C.R.U.D.model.Mascota;
import com.example.C.R.U.D.DTO.MascotaDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IMascotaRepository extends CrudRepository<Mascota, Long> {
    @Query("SELECT m FROM Mascota m WHERE m.especie = :especie")
    List<Mascota> findMascotasByEspecie(@Param("especie") String especie);
}
