/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.ui.FlatRoundBorder;

import javax.swing.*;
import java.awt.*;

public class RoundedPanelExample {
    public static void main(String[] args) {
        // Configurar el aspecto de FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Crear un JPanel redondeado
        JPanel roundedPanel = new JPanel();
        roundedPanel.setLayout(new BorderLayout());
        roundedPanel.setBorder(new FlatRoundBorder());

        // Crear un JFrame y añadir el panel redondeado
        JFrame frame = new JFrame("Panel Redondeado con FlatLaf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().add(roundedPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
