/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.model.Estudiante;
import com.mycompany.mavenproject1.model.Profesor;
import com.mycompany.mavenproject1.model.Usuario;
import com.mycompany.mavenproject1.service.UsuarioService;
import com.mycompany.mavenproject1.service.CursoService;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private UsuarioService usuarioService;

    public LoginFrame(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;

        setTitle("Inicio de Sesión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblUsername = new JLabel("Nombre de Usuario:");
        JTextField txtUsername = new JTextField();
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField();

        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnBack = new JButton("Volver");

        btnLogin.addActionListener(e -> {
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            if (usuarioService.iniciarSesion(username, password)) {
                Usuario usuario = usuarioService.getUsuarioByUsername(username);

                if (usuario instanceof Estudiante) {
                    new StudentMenuFrame((Estudiante) usuario, new CursoService()).setVisible(true);
                } else if (usuario instanceof Profesor) {
                    new TeacherMenuFrame((Profesor) usuario, new CursoService()).setVisible(true);
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            }
        });

        btnBack.addActionListener(e -> {
            new MainFrame(usuarioService).setVisible(true);
            dispose();
        });

        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnBack);
    }
}




