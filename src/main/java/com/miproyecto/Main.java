package com.miproyecto;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Materia matematica = new Materia(null, "Matemática");
        Materia fisica = new Materia(null, "Física");
        Materia algebra = new Materia(null, "Física");

        List<Materia> materiasCursadas = new ArrayList<>();
        materiasCursadas.add(matematica);
        materiasCursadas.add(fisica);

        List<Materia> materiasNecesarias= new ArrayList<>();
        materiasNecesarias.add(matematica);
        materiasNecesarias.add(fisica);
        materiasNecesarias.add(algebra);

        Materia quimica = new Materia(materiasNecesarias, "Química");

        Alumno alumno = new Alumno(materiasCursadas, "eliseo");

        List<Materia> propuesta = new ArrayList<>();
        propuesta.add(quimica);
        Inscripcion inscripcion = new Inscripcion(propuesta,alumno);
        String nombre = alumno.getNombre();
        boolean aprobado = inscripcion.aprobado();
        System.out.println("¿La inscripción está aprobada? " + aprobado);
        System.out.println(nombre);
    }
}
