package com.example.C.R.U.D.service;

import com.example.C.R.U.D.model.Persona;

import java.util.List;

public interface IPersonaService {
    //Metodo para Get a todas las personas
    public List<Persona> getPersonas();

    //Metodo para hacer un Post de las personas
    public void savePersona(Persona perso);

    //Metodo Delete para una persona
    public void deletePersona(Long id);

    //Metodo para encontrar una persona
    public Persona findPersona(Long id);

    //Edicion o Modificacion
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);
}
