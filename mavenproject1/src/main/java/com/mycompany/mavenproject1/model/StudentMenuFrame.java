/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.model.Estudiante;
import com.mycompany.mavenproject1.service.CursoService;

import javax.swing.*;
import java.awt.*;

public class StudentMenuFrame extends JFrame {
    private Estudiante estudiante;
    private CursoService cursoService;

    public StudentMenuFrame(Estudiante estudiante, CursoService cursoService) {
        this.estudiante = estudiante;
        this.cursoService = cursoService;

        setTitle("Menú del Estudiante");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10));

        JButton btnEnrollCourse = new JButton("Inscribirse en un curso");
        JButton btnViewCourses = new JButton("Ver cursos inscritos");
        JButton btnSubmitTask = new JButton("Entregar tarea");
        JButton btnTakeEvaluation = new JButton("Realizar evaluación");
        JButton btnViewProgress = new JButton("Ver progreso");
        JButton btnLogout = new JButton("Cerrar sesión");

        btnEnrollCourse.addActionListener(e -> {
            // Abrir ventana para inscripción a cursos
            JOptionPane.showMessageDialog(this, "Funcionalidad: Inscribirse en un curso.");
        });

        btnViewCourses.addActionListener(e -> {
            // Mostrar cursos inscritos
            JOptionPane.showMessageDialog(this, "Funcionalidad: Ver cursos inscritos.");
        });

        btnSubmitTask.addActionListener(e -> {
            // Abrir ventana para entregar tarea
            JOptionPane.showMessageDialog(this, "Funcionalidad: Entregar tarea.");
        });

        btnTakeEvaluation.addActionListener(e -> {
            // Abrir ventana para realizar evaluación
            JOptionPane.showMessageDialog(this, "Funcionalidad: Realizar evaluación.");
        });

        btnViewProgress.addActionListener(e -> {
            // Mostrar progreso del estudiante
            JOptionPane.showMessageDialog(this, "Funcionalidad: Ver progreso.");
        });

        btnLogout.addActionListener(e -> {
            new MainFrame(null).setVisible(true);
            dispose();
        });

        add(btnEnrollCourse);
        add(btnViewCourses);
        add(btnSubmitTask);
        add(btnTakeEvaluation);
        add(btnViewProgress);
        add(btnLogout);
    }
}

