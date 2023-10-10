/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import javax.swing.*;

public class DropTargetExample extends JFrame {

    public DropTargetExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("Arrastra y suelta aquí");
        textArea.setDropTarget(new DropTarget() {
            @Override
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    Transferable transferable = evt.getTransferable();
                    if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                        evt.acceptDrop(DnDConstants.ACTION_COPY);
                        String data = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                        textArea.append("\n" + data);
                        evt.dropComplete(true);
                    } else {
                        evt.rejectDrop();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    evt.rejectDrop();
                }
            }
        });

        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DropTargetExample());
    }
}
