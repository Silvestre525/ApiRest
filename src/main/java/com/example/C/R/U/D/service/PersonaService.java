package com.example.C.R.U.D.service;

import com.example.C.R.U.D.model.Persona;
import com.example.C.R.U.D.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonRepository persoRepo;

    @Override
    public List<Persona> getPersonas(){
        List <Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso){
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id){
        persoRepo.deleteById(id);
    }
    @Override
    public Persona findPersona(Long id){
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        //Busco persona original
        Persona perso = this.findPersona(idOriginal);

        //seteamos los nuevos valores a nivel logico
        perso.setId(idNueva);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);

        //Guardamos cambios como hacer un post de nuevo
        this.savePersona(perso);
    }

}
