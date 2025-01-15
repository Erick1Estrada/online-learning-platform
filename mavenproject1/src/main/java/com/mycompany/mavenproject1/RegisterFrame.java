/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.model.*;
import com.mycompany.mavenproject1.service.UsuarioService;

import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends JFrame {
    private UsuarioService usuarioService;

    public RegisterFrame(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;

        // Configuración de la ventana
        setTitle("Registro de Usuario");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Campos de entrada
        JLabel lblName = new JLabel("Nombre:");
        JTextField txtName = new JTextField();
        JLabel lblLastName = new JLabel("Apellido:");
        JTextField txtLastName = new JTextField();
        JLabel lblUsername = new JLabel("Nombre de Usuario:");
        JTextField txtUsername = new JTextField();
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField();
        JLabel lblRole = new JLabel("Rol (Estudiante/Profesor):");
        JTextField txtRole = new JTextField();

        // Botones
        JButton btnRegister = new JButton("Registrar");
        JButton btnBack = new JButton("Volver");

        // Acciones de los botones
        btnRegister.addActionListener(e -> {
            String name = txtName.getText();
            String lastName = txtLastName.getText();
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());
            String role = txtRole.getText();

            if (!name.isEmpty() && !lastName.isEmpty() && !username.isEmpty() && !password.isEmpty() && !role.isEmpty()) {
                if (role.equalsIgnoreCase("Estudiante")) {
                    Estudiante estudiante = new Estudiante(name, lastName, username, password, "Estudiante");
                    usuarioService.registrarUsuario(estudiante);
                } else if (role.equalsIgnoreCase("Profesor")) {
                    Profesor profesor = new Profesor(name, lastName, username, password, "Profesor");
                    usuarioService.registrarUsuario(profesor);
                } else {
                    JOptionPane.showMessageDialog(null, "Rol no válido. Use 'Estudiante' o 'Profesor'.");
                    return;
                }

                JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.");
                new MainFrame(usuarioService).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            }
        });

        btnBack.addActionListener(e -> {
            new MainFrame(usuarioService).setVisible(true);
            dispose();
        });

        // Añadir componentes a la ventana
        add(lblName);
        add(txtName);
        add(lblLastName);
        add(txtLastName);
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(lblRole);
        add(txtRole);
        add(btnRegister);
        add(btnBack);
    }
}



