package com.miproyecto;

import java.util.List;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> propuesta;

    public Inscripcion(List<Materia> propuesta, Alumno alumno) {
        this.propuesta = propuesta;
        this.alumno = alumno;
    }

    public boolean aprobado(){
        return propuesta.stream().allMatch(materia -> alumno.puedeCursarMateria(materia));
    }

}