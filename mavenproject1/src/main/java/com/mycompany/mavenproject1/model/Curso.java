/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String descripcion;
    private List<String> unidades;
    private List<String> estudiantesInscritos;
    private List<String> contenido; // Unidades, lecciones o cualquier contenido agregado
    private List<String> tareas;
    private List<String> evaluaciones;

    // Constructor
    public Curso(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidades = new ArrayList<>();
        this.estudiantesInscritos = new ArrayList<>();
        this.contenido = new ArrayList<>();
        this.tareas = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
    }

    // Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public List<String> getContenido() {
        return contenido;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public List<String> getEvaluaciones() {
        return evaluaciones;
    }

    // Métodos Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos para gestionar estudiantes
    public void inscribirEstudiante(String estudiante) {
        if (!estudiantesInscritos.contains(estudiante)) {
            estudiantesInscritos.add(estudiante);
            System.out.println("Estudiante inscrito: " + estudiante);
        } else {
            System.out.println("El estudiante ya está inscrito en este curso.");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos:");
        if (estudiantesInscritos.isEmpty()) {
            System.out.println("No hay estudiantes inscritos en este curso.");
        } else {
            for (String estudiante : estudiantesInscritos) {
                System.out.println("- " + estudiante);
            }
        }
    }

    // Métodos para gestionar contenido
    public void agregarUnidad(String unidad) {
        unidades.add(unidad);
        contenido.add(unidad);
        System.out.println("Unidad agregada: " + unidad);
    }

    public void agregarContenido(String item) {
        contenido.add(item);
        System.out.println("Contenido agregado: " + item);
    }

    public void mostrarUnidades() {
        System.out.println("Unidades del curso:");
        if (unidades.isEmpty()) {
            System.out.println("No hay unidades agregadas.");
        } else {
            for (String unidad : unidades) {
                System.out.println("- " + unidad);
            }
        }
    }

    // Métodos para tareas
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    public void mostrarTareas() {
        System.out.println("Tareas del curso:");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en este curso.");
        } else {
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }
        }
    }

    // Métodos para evaluaciones
    public void agregarEvaluacion(String evaluacion) {
        evaluaciones.add(evaluacion);
        System.out.println("Evaluación agregada: " + evaluacion);
    }

    public void mostrarEvaluaciones() {
        System.out.println("Evaluaciones del curso:");
        if (evaluaciones.isEmpty()) {
            System.out.println("No hay evaluaciones en este curso.");
        } else {
            for (String evaluacion : evaluaciones) {
                System.out.println("- " + evaluacion);
            }
        }
    }
}




