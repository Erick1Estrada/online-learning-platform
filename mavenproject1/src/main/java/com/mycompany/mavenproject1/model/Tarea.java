/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import com.mycompany.mavenproject1.model.Estudiante;

public class Tarea {
    private String nombre;
    private String fechaLimite;

    public Tarea(String nombre, String fechaLimite) {
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public void entregarTarea(Estudiante estudiante) {
        System.out.println("Tarea entregada por: " + estudiante.getUsername());
    }
}





