package com.example.C.R.U.D.controller;

import com.example.C.R.U.D.service.IPersonaService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.C.R.U.D.model.Persona;
import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService personServi;

    @GetMapping("/persona/traer")
    public List<Persona> getPersonas(){
        return personServi.getPersonas();

    }
    @PostMapping("/persona/crear")
    public String savePersona(@RequestBody Persona perso){
        personServi.savePersona(perso);

        return "La persona fue creada correctamente";
    }
    @DeleteMapping("persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personServi.deletePersona(id);

        return "La persona fue borrada con exito!!";
    }

    @PutMapping("/persona/editar/{id_modificar}")
    public Persona editPersona(@PathVariable Long id_modificar,
                               @RequestParam(required = false,name ="id")Long nuevaId,
                               @RequestParam(required = false,name ="nombre")String nuevoNombre,
                               @RequestParam(required = false,name ="apellido")String nuevoApellido,
                               @RequestParam(required = false,name ="edad")int nuevaEdad) {

        personServi.editPersona(id_modificar,nuevaId,nuevoNombre,nuevoApellido,nuevaEdad);

        Persona person = personServi.findPersona(nuevaId);

        return person;

    }


}
