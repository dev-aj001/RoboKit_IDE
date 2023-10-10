/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OneTouchExpandingExample extends JFrame {

    private JSplitPane splitPane;
    private JPanel panel1;
    private JPanel panel2;

    public OneTouchExpandingExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Panel 1"));

        panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.add(new JLabel("Panel 2"));

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        splitPane.setOneTouchExpandable(true);
        splitPane.setResizeWeight(0.0);

        JButton expandPanel1Button = new JButton("Expandir Panel 1");
        expandPanel1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Establecer la ubicación del divisor para expandir completamente el panel1
                splitPane.setDividerLocation(0.0);
            }
        });

        add(splitPane, BorderLayout.CENTER);
        add(expandPanel1Button, BorderLayout.SOUTH);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OneTouchExpandingExample();
            }
        });
    }
}
