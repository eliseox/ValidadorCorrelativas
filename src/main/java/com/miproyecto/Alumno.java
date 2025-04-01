package com.miproyecto;
import java.util.List;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Alumno {
    private String nombre;
    private List<Materia> materiasCursadas;

    public boolean puedeCursarMateria(Materia materia){
        return materia.cumpleRequisito(materiasCursadas);
    }

    public Alumno(List<Materia> materiasCursadas , String nombre) {
        this.materiasCursadas = materiasCursadas;
        this.nombre = nombre;
    }

}
