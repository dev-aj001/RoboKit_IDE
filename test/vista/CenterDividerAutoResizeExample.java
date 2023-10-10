/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CenterDividerAutoResizeExample extends JFrame {

    private JSplitPane splitPane;
    private JPanel panel1;
    private JPanel panel2;

    public CenterDividerAutoResizeExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Panel 1"));

        panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.add(new JLabel("Panel 2"));

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        splitPane.setResizeWeight(0.5);

        add(splitPane, BorderLayout.CENTER);

        // Agregar un ComponentListener para ajustar automáticamente la ubicación del divisor al cambiar el tamaño de la ventana
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Establecer la ubicación del divisor en el centro (valor relativo 0.5)
                splitPane.setDividerLocation(0.5);
            }
        });

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CenterDividerAutoResizeExample();
            }
        });
    }
}
