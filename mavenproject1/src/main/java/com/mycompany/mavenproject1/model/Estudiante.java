/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Usuario {
    private List<String> cursosInscritos;
    private List<String> tareasPendientes;
    private List<String> evaluacionesPendientes;

    public Estudiante(String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido, username, password, rol);
        this.cursosInscritos = new ArrayList<>();
        this.tareasPendientes = new ArrayList<>();
        this.evaluacionesPendientes = new ArrayList<>();
    }

    // Métodos para Cursos
    public void mostrarCursos() {
        System.out.println("Cursos Inscritos:");
        if (cursosInscritos.isEmpty()) {
            System.out.println("No estás inscrito en ningún curso.");
        } else {
            for (String curso : cursosInscritos) {
                System.out.println("- " + curso);
            }
        }
    }

    public void inscribirCurso(String curso) {
        if (!cursosInscritos.contains(curso)) {
            cursosInscritos.add(curso);
            System.out.println("Te has inscrito en el curso: " + curso);
        } else {
            System.out.println("Ya estás inscrito en este curso.");
        }
    }

    public void darseDeBajaDeCurso(String curso) {
        if (cursosInscritos.contains(curso)) {
            cursosInscritos.remove(curso);
            System.out.println("Te has dado de baja del curso: " + curso);
        } else {
            System.out.println("No estás inscrito en este curso.");
        }
    }

    // Métodos para Tareas
    public void mostrarTareas() {
        System.out.println("Tareas Pendientes:");
        if (tareasPendientes.isEmpty()) {
            System.out.println("No tienes tareas pendientes.");
        } else {
            for (String tarea : tareasPendientes) {
                System.out.println("- " + tarea);
            }
        }
    }

    public void entregarTarea(String tarea) {
        if (tareasPendientes.contains(tarea)) {
            tareasPendientes.remove(tarea);
            System.out.println("Tarea entregada: " + tarea);
        } else {
            System.out.println("La tarea no existe o ya fue entregada.");
        }
    }

    public void agregarTareaPendiente(String tarea) {
        tareasPendientes.add(tarea);
    }

    // Métodos para Evaluaciones
    public void mostrarEvaluaciones() {
        System.out.println("Evaluaciones Pendientes:");
        if (evaluacionesPendientes.isEmpty()) {
            System.out.println("No tienes evaluaciones pendientes.");
        } else {
            for (String evaluacion : evaluacionesPendientes) {
                System.out.println("- " + evaluacion);
            }
        }
    }

    public void realizarEvaluacion(String evaluacion) {
        if (evaluacionesPendientes.contains(evaluacion)) {
            evaluacionesPendientes.remove(evaluacion);
            System.out.println("Evaluación realizada: " + evaluacion);
            System.out.println("Calificación obtenida: 8/10 (ejemplo)");
        } else {
            System.out.println("La evaluación no existe o ya fue realizada.");
        }
    }

    public void agregarEvaluacionPendiente(String evaluacion) {
        evaluacionesPendientes.add(evaluacion);
    }

    // Métodos Consolidados
    public void buscarPendientes() {
        System.out.println("Buscando Tareas y Evaluaciones Pendientes...");
        mostrarTareas();
        mostrarEvaluaciones();
    }

    public void verCalificacionesYPorcentaje() {
        System.out.println("Calificaciones obtenidas:");
        // Implementar lógica para mostrar las calificaciones de tareas y evaluaciones
        System.out.println("Porcentaje del curso completado: 75% (ejemplo)");
    }
}




