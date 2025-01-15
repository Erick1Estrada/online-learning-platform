/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.service;

import com.mycompany.mavenproject1.model.Curso;
import com.mycompany.mavenproject1.model.Estudiante;

public class CursoService {
    public void inscribirEstudiante(Curso curso, Estudiante estudiante) {
        System.out.println("Estudiante " + estudiante.getUsername() + " inscrito en el curso: " + curso.getNombre());
    }

    public double calcularProgreso(Estudiante estudiante, Curso curso) {
        // Ejemplo de progreso
        return 50.0;
    }
}





