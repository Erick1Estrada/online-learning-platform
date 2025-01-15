/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.model.Profesor;
import com.mycompany.mavenproject1.service.CursoService;

import javax.swing.*;
import java.awt.*;

public class TeacherMenuFrame extends JFrame {
    private Profesor profesor;
    private CursoService cursoService;

    public TeacherMenuFrame(Profesor profesor, CursoService cursoService) {
        this.profesor = profesor;
        this.cursoService = cursoService;

        setTitle("Menú del Profesor");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10));

        JButton btnCreateCourse = new JButton("Crear un curso");
        JButton btnManageCourses = new JButton("Gestionar cursos");
        JButton btnMarkAttendance = new JButton("Registrar asistencia");
        JButton btnGenerateReports = new JButton("Generar reportes");
        JButton btnLogout = new JButton("Cerrar sesión");

        btnCreateCourse.addActionListener(e -> {
            // Abrir ventana para crear un curso
            JOptionPane.showMessageDialog(this, "Funcionalidad: Crear un curso.");
        });

        btnManageCourses.addActionListener(e -> {
            // Abrir ventana para gestionar cursos
            JOptionPane.showMessageDialog(this, "Funcionalidad: Gestionar cursos.");
        });

        btnMarkAttendance.addActionListener(e -> {
            // Abrir ventana para registrar asistencia
            JOptionPane.showMessageDialog(this, "Funcionalidad: Registrar asistencia.");
        });

        btnGenerateReports.addActionListener(e -> {
            // Abrir ventana para generar reportes
            JOptionPane.showMessageDialog(this, "Funcionalidad: Generar reportes.");
        });

        btnLogout.addActionListener(e -> {
            new MainFrame(null).setVisible(true);
            dispose();
        });

        add(btnCreateCourse);
        add(btnManageCourses);
        add(btnMarkAttendance);
        add(btnGenerateReports);
        add(btnLogout);
    }
}

