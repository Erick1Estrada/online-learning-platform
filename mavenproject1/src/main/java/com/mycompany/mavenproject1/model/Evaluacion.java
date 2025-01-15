/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

public class Evaluacion {
    private String nombre;
    private int tiempoLimite;

    public Evaluacion(String nombre, int tiempoLimite) {
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public void responderEvaluacion(Estudiante estudiante, String[] respuestas) {
        System.out.println("Evaluación respondida por: " + estudiante.getUsername());
    }
}




