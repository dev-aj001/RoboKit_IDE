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

public class ScrollableTabbedPaneExample2 extends JFrame {
    private JPanel tabPanel;
    private JScrollPane scrollPane;
    private int currentTabIndex = 0;

    public ScrollableTabbedPaneExample2() {
        // Configura el aspecto FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Crea el frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo de Pestañas Desplazables");
        setSize(400, 300);

        // Crea el JPanel para las pestañas
        tabPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 0));

        // Agrega algunas pestañas de ejemplo
        for (int i = 1; i <= 10; i++) {
            addTab("Tab " + i);
        }

        // Crea un JScrollPane alrededor del panel de pestañas
        scrollPane = new JScrollPane(tabPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Agrega botones de desplazamiento
        JButton prevButton = new JButton("<<");
        JButton nextButton = new JButton(">>");

        // Configura ActionListener para los botones de desplazamiento
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentTabIndex > 0) {
                    currentTabIndex--;
                    updateTabPanel();
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentTabIndex < tabPanel.getComponentCount() - 1) {
                    currentTabIndex++;
                    updateTabPanel();
                }
            }
        });

        // Agrega botones de desplazamiento a un JPanel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Agrega el JScrollPane y el panel de botones al frame
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Muestra el frame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addTab(String title) {
        JButton tabButton = new JButton(title);
        tabPanel.add(tabButton);
        updateTabPanel();
    }

    private void updateTabPanel() {
        scrollPane.revalidate();
        scrollPane.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScrollableTabbedPaneExample());
    }
}
