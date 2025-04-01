package com.miproyecto;

import java.util.List;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Materia {
    private String nombre;
    private List<Materia> correlativasCumplir ;

    public boolean cumpleRequisito(List<Materia> materiasCursadas){
        if (this.correlativasCumplir == null) return true;
        return materiasCursadas.containsAll(this.correlativasCumplir);
    }

    public Materia(List<Materia> correlativasCumplir,String nombre) {
        this.correlativasCumplir = correlativasCumplir;
        this.nombre = nombre;
    }


}