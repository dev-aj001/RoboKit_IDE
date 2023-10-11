/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

public class ScrollableTabbedPaneExample extends JFrame {
    private JTabbedPane myTabbedPane;

    public ScrollableTabbedPaneExample() {
        // Configura el aspecto FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Crea el frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo de JTabbedPane con Scroll");
        setSize(400, 300);

        // Crea el JTabbedPane
        myTabbedPane = new JTabbedPane();

        // Agrega algunas pestañas de ejemplo
        for (int i = 1; i <= 10; i++) {
            addTab("Tab " + i, "Contenido de la pestaña " + i);
        }

        // Crea un JScrollPane alrededor del JTabbedPane
        JScrollPane scrollPane = new JScrollPane(myTabbedPane);
        
        // Establece la política de los botones de desplazamiento
        myTabbedPane.putClientProperty("JTabbedPane.tabsPopupPolicy", "asNeeded");

        

        // Agrega el JScrollPane al frame
        add(scrollPane);

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
        SwingUtilities.invokeLater(() -> new ScrollableTabbedPaneExample());
    }
}
