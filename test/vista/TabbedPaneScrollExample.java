/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneScrollExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("TabbedPane Scroll Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM, JTabbedPane.SCROLL_TAB_LAYOUT);

            JScrollPane scrollPane = new JScrollPane(tabbedPane);
            frame.add(scrollPane, BorderLayout.CENTER);

            JButton addTabButton = new JButton("+");
            addTabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int tabCount = tabbedPane.getTabCount();
                    tabbedPane.addTab("Tab " + (tabCount + 1), new JLabel("Content " + (tabCount + 1)));
                }
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(addTabButton);

            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}

