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

public class CustomTabAreaExample extends JFrame {
    private JTabbedPane myTabbedPane;

    public CustomTabAreaExample() {
        // Configura el aspecto FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Crea el frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo de JTabbedPane con Custom Tab Area");
        setSize(400, 300);

        // Crea el JTabbedPane
        myTabbedPane = new JTabbedPane();

        // Agrega algunas pestañas de ejemplo
        addTab("Tab 1", "Contenido de la pestaña 1");
        addTab("Tab 2", "Contenido de la pestaña 2");
        addTab("Tab 3", "Contenido de la pestaña 3");

        // Crea botones personalizados
        JButton addButton = new JButton("+");
        JButton removeButton = new JButton("-");
        
        // Agrega ActionListener para los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir una nueva pestaña
                addTab("Nueva Pestaña", "Contenido de la nueva pestaña");
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar la última pestaña
                int lastIndex = myTabbedPane.getTabCount() - 1;
                if (lastIndex >= 0) {
                    myTabbedPane.removeTabAt(lastIndex);
                }
            }
        });

        // Agrega botones como componentes líderes y de seguimiento
        myTabbedPane.putClientProperty("JTabbedPane.leadingComponent", addButton);
        myTabbedPane.putClientProperty("JTabbedPane.trailingComponent", removeButton);

        // Agrega el JTabbedPane al frame
        add(myTabbedPane);

        // Muestra el frame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addTab(String title, String content) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(content));

        myTabbedPane.addTab(title, panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomTabAreaExample());
    }
}
