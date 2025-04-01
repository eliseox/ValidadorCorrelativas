package com.miproyecto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InscripcionTest {

    @Test
    void negarInscripcion() {

        // Crear las materias
        Materia quimica = new Materia(null, "Quimica");
        Materia fisica = new Materia(null, "Fisica");

        // Crear la lista de materias necesarias
        List<Materia> materiasNecesarias = new ArrayList<>();
        materiasNecesarias.add(quimica);
        materiasNecesarias.add(fisica);

        // Crear la materia de Matemática
        Materia matematica = new Materia(materiasNecesarias, "Matematica");

        // Crear la lista de materias cursadas por el alumno
        List<Materia> materiasCursadas = new ArrayList<>();
        materiasCursadas.add(quimica);

        // Crear el alumno
        Alumno alumno = new Alumno(materiasCursadas,"eliseo");

        // Crear la propuesta de inscripción
        List<Materia> propuesta = new ArrayList<>();
        propuesta.add(matematica);

        // Crear la inscripción
        Inscripcion inscripcion = new Inscripcion(propuesta, alumno);

        // Verificar que la inscripción sea negada
        Assertions.assertFalse(inscripcion.aprobado(), "Propuesta RECHAZADA");

    }
    @Test
    void aprobarInscripcion() {

        // Crear las materias
        Materia quimica = new Materia(null, "Quimica");
        Materia fisica = new Materia(null, "Fisica");

        // Crear la lista de materias necesarias
        List<Materia> materiasNecesarias = new ArrayList<>();
        materiasNecesarias.add(quimica);

        // Crear la materia de Matemática
        Materia matematica = new Materia(materiasNecesarias, "Matematica");

        // Crear la lista de materias cursadas por el alumno
        List<Materia> materiasCursadas = new ArrayList<>();
        materiasCursadas.add(quimica);

        // Crear el alumno
        Alumno alumno = new Alumno(materiasCursadas,"eliseo");

        // Crear la propuesta de inscripción
        List<Materia> propuesta = new ArrayList<>();
        propuesta.add(matematica);

        // Crear la inscripción
        Inscripcion inscripcion = new Inscripcion(propuesta, alumno);

        // Verificar que la inscripción sea ACEPTADA
        Assertions.assertTrue(inscripcion.aprobado(), "Propuesta ACEPTADA");

    }

}
