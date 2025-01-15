/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Usuario {
    private List<Curso> cursosCreados;

    public Profesor(String nombre, String apellido, String username, String password, String rol) {
        super(nombre, apellido, username, password, rol);
        this.cursosCreados = new ArrayList<>();
    }

    // Crear un curso
    public void crearCurso(Curso curso) {
        cursosCreados.add(curso);
        System.out.println("Curso creado: " + curso.getNombre());
    }

    // Mostrar cursos creados
    public void mostrarCursos() {
        System.out.println("Cursos Creados:");
        if (cursosCreados.isEmpty()) {
            System.out.println("No has creado ningún curso.");
        } else {
            for (Curso curso : cursosCreados) {
                System.out.println("- " + curso.getNombre() + ": " + curso.getDescripcion());
            }
        }
    }

    // Registrar asistencia
    public void registrarAsistencia(String nombreCurso, String estudiante, boolean presente) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            String estado = presente ? "Presente" : "Ausente";
            System.out.println("Asistencia registrada para " + estudiante + " en el curso " + nombreCurso + ": " + estado);
            // Implementar lógica para registrar asistencia si es necesario
        } else {
            System.out.println("El curso " + nombreCurso + " no existe.");
        }
    }

    // Generar reporte de cursos existentes
    public void generarReporteCursos() {
        System.out.println("Reporte de Cursos Existentes:");
        if (cursosCreados.isEmpty()) {
            System.out.println("No has creado ningún curso.");
        } else {
            for (Curso curso : cursosCreados) {
                System.out.println("- " + curso.getNombre() + ": " + curso.getDescripcion());
            }
        }
    }

    // Generar reporte del contenido del curso
    public void generarReporteContenido(String nombreCurso) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            System.out.println("Reporte del Contenido del Curso: " + curso.getNombre());
            curso.mostrarUnidades();
            curso.mostrarTareas();
            curso.mostrarEvaluaciones();
        } else {
            System.out.println("El curso " + nombreCurso + " no existe.");
        }
    }

    // Generar reporte de asistencia
    public void generarReporteAsistencia(String nombreCurso) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            System.out.println("Reporte de Asistencia del Curso: " + nombreCurso);
            // Implementar lógica para mostrar asistencia
        } else {
            System.out.println("El curso " + nombreCurso + " no existe.");
        }
    }

    // Generar reporte de estudiantes matriculados
    public void generarReporteEstudiantes(String nombreCurso) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            System.out.println("Reporte de Estudiantes Matriculados en el Curso: " + curso.getNombre());
            curso.mostrarEstudiantes();
        } else {
            System.out.println("El curso " + nombreCurso + " no existe.");
        }
    }

    // Modificar un curso
    public void modificarCurso(String nombreCurso, String nuevoNombre, String nuevaDescripcion) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            curso.setNombre(nuevoNombre);
            curso.setDescripcion(nuevaDescripcion);
            System.out.println("Curso modificado exitosamente.");
        } else {
            System.out.println("El curso " + nombreCurso + " no existe.");
        }
    }

    // Modificar evaluación
    public void modificarEvaluacion(String nombreCurso, String evaluacion, String nuevaPregunta) {
        Curso curso = buscarCurso(nombreCurso);
        if (curso != null) {
            // Lógica para buscar y modificar la evaluación específica
            List<String> evaluaciones = curso.getEvaluaciones();
            if (evaluaciones.contains(evaluacion)) {
                int index = evaluaciones.indexOf(evaluacion);
                evaluaciones.set(index, nuevaPregunta);
                System.out.println("Evaluación modificada exitosamente.");
            } else {
                System.out.println("La evaluación " + evaluacion + " no existe en el curso.");
            }
        } else {
            System.out.println("El curso " + nombreCurso + " no existe.");
        }
    }

    // Método para buscar un curso por nombre
    private Curso buscarCurso(String nombreCurso) {
        for (Curso curso : cursosCreados) {
            if (curso.getNombre().equalsIgnoreCase(nombreCurso)) {
                return curso;
            }
        }
        return null;
    }
}





