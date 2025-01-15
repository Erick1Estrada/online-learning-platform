/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

public class Usuario {
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String rol;

    public Usuario(String nombre, String apellido, String username, String password, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Getters y setters adicionales
}

