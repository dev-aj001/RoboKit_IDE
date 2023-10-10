/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomTabbedPane extends JFrame {

    private JTabbedPane tabbedPane;

    public CustomTabbedPane() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();

        // Agregar algunas pestañas de ejemplo
        addTab("Pestaña 1");
        addTab("Pestaña 2");
        addTab("Pestaña 3");

        // Botón para agregar más pestañas
        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTab("Pestaña " + (tabbedPane.getTabCount() + 1));
            }
        });

        add(tabbedPane, BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addTab(String title) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Contenido de " + title));
        tabbedPane.addTab(title, panel);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount() - 1, new CustomTabComponent(tabbedPane, tabbedPane.getTabCount() - 1));
    }

    // Clase interna para el componente personalizado de la pestaña
    class CustomTabComponent extends JPanel {
        private final JTabbedPane tabbedPane;
        private final int tabIndex;

        public CustomTabComponent(final JTabbedPane tabbedPane, final int tabIndex) {
            this.tabbedPane = tabbedPane;
            this.tabIndex = tabIndex;
            setOpaque(false);

            JLabel titleLabel = new JLabel(tabbedPane.getTitleAt(tabIndex));

            // Botón de cerrar
            JButton closeButton = new JButton("x");
            closeButton.setBorderPainted(false);
            closeButton.setFocusPainted(false);

            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int indexToClose = tabbedPane.indexOfTabComponent(CustomTabComponent.this);
                    if (indexToClose != -1) {
                        tabbedPane.remove(indexToClose);
                    }
                }
            });

            add(titleLabel);
            add(closeButton);
        }
    }

    public static void main(String[] args) {
        FlatIntelliJLaf.registerCustomDefaultsSource("estilos");
        try {
            UIManager.setLookAndFeel( new FlatLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomTabbedPane();
            }
        });
    }
}
