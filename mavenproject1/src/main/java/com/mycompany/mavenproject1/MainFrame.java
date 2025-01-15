/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.service.UsuarioService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private UsuarioService usuarioService;

    public MainFrame(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;

        setTitle("Plataforma de Aprendizaje");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnRegister = new JButton("Registrarse");
        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnExit = new JButton("Salir");

        btnRegister.addActionListener(e -> {
            new RegisterFrame(usuarioService).setVisible(true);
            dispose();
        });

        btnLogin.addActionListener(e -> {
            new LoginFrame(usuarioService).setVisible(true);
            dispose();
        });

        btnExit.addActionListener(e -> System.exit(0));

        add(btnRegister);
        add(btnLogin);
        add(btnExit);
    }
}



