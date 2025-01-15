/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.*;
import com.mycompany.mavenproject1.service.UsuarioService;

public class Mavenproject1 {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame(usuarioService);
            mainFrame.setVisible(true);
        });
    }
    
}













