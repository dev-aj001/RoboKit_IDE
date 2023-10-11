/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScaledUIExample extends JFrame {
    private JButton increaseScaleButton;
    private JButton decreaseScaleButton;
    private double uiScale = 0.5;

    public ScaledUIExample() {
        // Configura el aspecto FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Crea el frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo de Escalado de UI con FlatLaf");
        setSize(400, 300);

        // Crea botones para aumentar y disminuir la escala
        increaseScaleButton = new JButton("Aumentar Escala");
        decreaseScaleButton = new JButton("Disminuir Escala");

        // Configura ActionListener para los botones
        increaseScaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uiScale += 0.1;
                applyUIScale();
            }
        });

        decreaseScaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uiScale -= 0.1;
                applyUIScale();
            }
        });

        // Crea un JPanel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(increaseScaleButton);
        buttonPanel.add(decreaseScaleButton);

        // Agrega el JPanel al frame
        add(buttonPanel, BorderLayout.SOUTH);

        // Aplica la escala inicial
        applyUIScale();

        // Muestra el frame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void applyUIScale() {
        // Establece la propiedad flatlaf.uiScale
        UIManager.put("flatlaf.uiScale", uiScale);

        // Actualiza el aspecto de la interfaz de usuario
        SwingUtilities.updateComponentTreeUI(this);

        // Habilita o deshabilita los botones según la escala actual
        increaseScaleButton.setEnabled(uiScale < 2.0);
        decreaseScaleButton.setEnabled(uiScale > 0.5);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScaledUIExample());
    }
}
