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
import java.util.function.IntConsumer;

public class TabbedPaneExample extends JFrame {
    private JTabbedPane myTabbedPane;

    public TabbedPaneExample() {
        // Configura el aspecto FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Crea el frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo de JTabbedPane con FlatLaf");
        setSize(400, 300);

        // Crea el JTabbedPane
        myTabbedPane = new JTabbedPane();

        // Agrega algunas pestañas de ejemplo
        addTab("Tab 1", "Contenido de la pestaña 1");
        addTab("Tab 2", "Contenido de la pestaña 2");
        addTab("Tab 3", "Contenido de la pestaña 3");

        // Habilita el cierre de pestañas
        myTabbedPane.putClientProperty("JTabbedPane.tabClosable", true);

        // Configura el texto emergente para el botón de cerrar
        myTabbedPane.putClientProperty("JTabbedPane.tabCloseToolTipText", "Cerrar pestaña");

        // Configura el callback para el cierre de pestañas
        myTabbedPane.putClientProperty("JTabbedPane.tabCloseCallback", (IntConsumer) tabIndex -> {
            // Lógica para cerrar la pestaña con el índice 'tabIndex'
            if (tabIndex >= 0 && tabIndex < myTabbedPane.getTabCount()) {
                myTabbedPane.removeTabAt(tabIndex);
            }
        });

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
        SwingUtilities.invokeLater(() -> new TabbedPaneExample());
    }
}
