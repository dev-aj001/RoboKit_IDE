/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import custom.botones.ButtonTabComponent;
import icons.SVGIcons;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Function;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author jairi
 */
public class Principal extends javax.swing.JFrame {

    private RSyntaxTextArea actualCode = null;
    private ArrayList<RSyntaxTextArea> lista;
    
    public Principal() {
        initComponents();
        this.lista = new ArrayList<>();
        // Agregar un ComponentListener para ajustar automáticamente la ubicación del divisor al cambiar el tamaño de la ventana
        //leftSplit.setDividerLocation(0.55);
        inittabbedCode();
        
        txtOutput.setText("Tab seleccionada "+tabbedCode.getSelectedIndex());
        
        rightSplit.setDividerLocation(0.6);
        //changeIconColor(Color.yellow);
        setIcons();        
        SVGIcons.NoteAddIcon().setColorFilter( new FlatSVGIcon.ColorFilter( color -> Color.RED ) );
    }
    
    /** Metodos creados **/
    
    //Iconos
    private void setIcons(){
               
        btnNuevo.setIcon(SVGIcons.NoteAddIcon());
        btnGuardar.setIcon(SVGIcons.SaveIcon());
        btnAbrir.setIcon(SVGIcons.FolderIcon());
        btnDeshacer.setIcon(SVGIcons.UndoIcon());
        btnRehacer.setIcon(SVGIcons.RedoIcon());
        btnCompilar.setIcon(SVGIcons.PlayIcon());
        btnReRun.setIcon(SVGIcons.ArrowLeftIcon());
        
    }
    
    public void changeIconColor(Color color){
        SVGIcons.changeColor(color);
        btnNuevo.repaint();
        btnGuardar.repaint();
        btnDeshacer.repaint();
        btnRehacer.repaint();
        btnCompilar.repaint();
    }
    
    
    private void inittabbedCode(){
        /*
            Metodo utilizado para inicializar inittabbedCode el tabbed pane principal,
            -Genera el leadingComponent
            -Controla la creacion y eliminacion de pestañas
            -Muestra la pestaña de inicio
            -Maneja la asociacion de cada RSyntax
        */
        
        
        /*-------------------------------------------------------*/
        /*  Creacion del leadingComponent (boton + al inicio)   */
        
        
        // Crear boton "+" y boton "-" 
        JButton addButton = new JButton("+");
        JButton removeButton = new JButton("-");
        
        // Agrega botones como componentes líderes y de seguimiento
        tabbedCode.putClientProperty("JTabbedPane.leadingComponent", addButton);
        //tabbedCode.putClientProperty("JTabbedPane.trailingComponent", removeButton);
    
        // Agrega ActionListener para los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para añadir una nueva pestaña
                addCodeTab("Nuevo*");
                tabbedCode.setSelectedIndex(tabbedCode.getTabCount()-1);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar la última pestaña
                int lastIndex = tabbedCode.getTabCount() - 1;
                if (lastIndex >= 0) {
                    tabbedCode.removeTabAt(lastIndex);
                }
            }
        });
        
        /*-------------------------------------------------------*/
        /*  Boton de cierre de pestaña  */     
        
        tabbedCode.setTabComponentAt(0, new ButtonTabComponent(tabbedCode));
        
    }
    
    private void addCodeTab(String title) {
        JPanel panel = new JPanel(new BorderLayout());
        RSyntaxTextArea txt = new RSyntaxTextArea();
        RTextScrollPane scrll = new RTextScrollPane(txt);
        txt.setCodeFoldingEnabled(true);
        txt.setWhitespaceVisible(true);
        txt.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
        txt.setBackground(UIManager.getColor("RoboKit.panel"));
        
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                BufferedReader br = new BufferedReader(new FileReader(selectedFile));
                txt.read(br, null);
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        
        
        
        
        panel.add(scrll);
        lista.add(txt);
        tabbedCode.addTab(title, panel);
        tabbedCode.setTabComponentAt(tabbedCode.indexOfComponent(panel), new ButtonTabComponent(tabbedCode));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlToolMenu = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        btnCompilar = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        pnlMain = new javax.swing.JPanel();
        mainSplit = new javax.swing.JSplitPane();
        leftSplit = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        rightSplit = new javax.swing.JSplitPane();
        tabbedCode = new javax.swing.JTabbedPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTitulo4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tabbedCompile = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnReRun = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        scrLexico = new javax.swing.JScrollPane();
        pnlLexico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlSintactico = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pnlSemantico = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlToolMenu.setBackground(UIManager.getColor( "RoboKit.toolBar" ));
        pnlToolMenu.setLayout(new javax.swing.BoxLayout(pnlToolMenu, javax.swing.BoxLayout.LINE_AXIS));

        jToolBar1.setFloatable(true);
        jToolBar1.setRollover(true);

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNuevo);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnGuardar);

        btnAbrir.setText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAbrir);

        pnlToolMenu.add(jToolBar1);

        jToolBar2.setFloatable(true);
        jToolBar2.setRollover(true);

        btnDeshacer.setText("Deshacer");
        btnDeshacer.setFocusable(false);
        btnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDeshacer);

        btnRehacer.setText("Rehacer");
        btnRehacer.setFocusable(false);
        btnRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnRehacer);

        pnlToolMenu.add(jToolBar2);

        jToolBar3.setFloatable(true);
        jToolBar3.setRollover(true);

        btnCompilar.setText("Compilar");
        btnCompilar.setFocusable(false);
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        jToolBar3.add(btnCompilar);

        pnlToolMenu.add(jToolBar3);

        jToolBar4.setFloatable(true);
        jToolBar4.setRollover(true);
        pnlToolMenu.add(jToolBar4);

        mainSplit.setOneTouchExpandable(true);

        leftSplit.setDividerLocation(200);
        leftSplit.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel9.setBackground(UIManager.getColor( "RoboKit.panel" ));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setMinimumSize(new java.awt.Dimension(50, 100));

        jPanel10.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Explorador"));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jTree1);

        jPanel11.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftSplit.setTopComponent(jPanel9);

        jPanel3.setBackground(UIManager.getColor( "RoboKit.panel" ));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel7.setBackground(UIManager.getColor( "@background" ));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Fases de compilación"));
        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 250));

        jButton3.setText("Analizador sintáctico");

        jButton8.setText("Analizador semántico");

        jButton9.setText("Código intermedio");
        jButton9.setEnabled(false);

        jButton10.setText("Optimización de código");
        jButton10.setEnabled(false);

        jButton11.setText("Código objeto");
        jButton11.setEnabled(false);

        jButton12.setText("Analizador léxico");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        leftSplit.setRightComponent(jPanel3);

        mainSplit.setLeftComponent(leftSplit);

        rightSplit.setDividerLocation(300);
        rightSplit.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        tabbedCode.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedCode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabChanged(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Bienvenido a RoboKit IDE");

        jPanel1.setBackground(UIManager.getColor("Robokit.panel")
        );
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo2.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo2.setText("A programar!");

        jLabel9.setIcon(SVGIcons.AddIcon());
        jLabel9.setText("Crear un nuevo archivo...");

        jLabel10.setIcon(SVGIcons.FileOpenIcon());
        jLabel10.setText("Abrir un archivo...");

        jLabel2.setIcon(SVGIcons.FolderIcon());
        jLabel2.setText("Abrir una carpeta...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo2)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(UIManager.getColor("Robokit.panel")
        );
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo3.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo3.setText("Documentación");

        jLabel11.setText("Visitar el repositorio");

        jLabel12.setText("Wiki de robokit");

        jLabel13.setText("Acerca de...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo3)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo3)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(UIManager.getColor("Robokit.panel")
        );
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo4.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo4.setText("Diseñado por");

        jLabel14.setText("Ibañez Parra Armando Jair");

        jLabel15.setText("Guzmán Álvarez Srgio Alejandro");

        jLabel16.setText("Manjarez Manzano Kevin Aziel");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo4)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo4)
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane8.setViewportView(jPanel12);

        tabbedCode.addTab("Welcome", jScrollPane8);

        rightSplit.setTopComponent(tabbedCode);

        tabbedCompile.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        btnReRun.setMargin(new java.awt.Insets(2, 2, 5, 2));
        btnReRun.setMaximumSize(new java.awt.Dimension(31, 31));
        btnReRun.setMinimumSize(new java.awt.Dimension(30, 30));
        btnReRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReRunActionPerformed(evt);
            }
        });
        jPanel6.add(btnReRun);

        btnPause.setMargin(new java.awt.Insets(2, 2, 5, 2));
        btnPause.setMaximumSize(new java.awt.Dimension(31, 31));
        btnPause.setMinimumSize(new java.awt.Dimension(30, 30));
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        jPanel6.add(btnPause);

        btnStop.setMargin(new java.awt.Insets(2, 2, 5, 2));
        btnStop.setMaximumSize(new java.awt.Dimension(31, 31));
        btnStop.setMinimumSize(new java.awt.Dimension(30, 30));
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jPanel6.add(btnStop);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );

        tabbedCompile.addTab("Output", jPanel5);

        pnlLexico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lexema", "Grupo"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        pnlLexico.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 430));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Analizador Léxico");
        pnlLexico.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 20));

        jLabel4.setText("Componentes léxicos");
        pnlLexico.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        scrLexico.setViewportView(pnlLexico);

        tabbedCompile.addTab("Léxico", scrLexico);

        pnlSintactico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lexema", "Grupo"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        pnlSintactico.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 430));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Analizador Sintactico");
        pnlSintactico.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 20));

        jLabel6.setText("Gramaticas");
        pnlSintactico.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        jScrollPane4.setViewportView(pnlSintactico);

        tabbedCompile.addTab("Sintáctico", jScrollPane4);

        pnlSemantico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lexema", "Grupo"
            }
        ));
        jScrollPane7.setViewportView(jTable3);

        pnlSemantico.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 430));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Analizador Semántico");
        pnlSemantico.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 20));

        jLabel8.setText("Gramaticas y atributos");
        pnlSemantico.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jScrollPane5.setViewportView(pnlSemantico);

        tabbedCompile.addTab("Semántico", jScrollPane5);

        rightSplit.setBottomComponent(tabbedCompile);

        mainSplit.setRightComponent(rightSplit);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplit)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addComponent(mainSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(UIManager.getColor( "MyApp.topColor" ));

        jMenu1.setText("Archivo");

        jMenuItem13.setText("Nuevo archivo");
        jMenu1.add(jMenuItem13);

        jMenuItem16.setText("Nueva carpeta");
        jMenu1.add(jMenuItem16);
        jMenu1.add(jSeparator5);

        jMenuItem14.setText("Abrir archivo");
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Abrir carpeta");
        jMenu1.add(jMenuItem15);
        jMenu1.add(jSeparator6);

        jMenuItem18.setText("Guardar");
        jMenu1.add(jMenuItem18);

        jMenuItem19.setText("Guardar como...");
        jMenu1.add(jMenuItem19);

        jMenuItem20.setText("Guardar todo");
        jMenu1.add(jMenuItem20);
        jMenu1.add(jSeparator7);

        jMenuItem17.setText("Salir");
        jMenu1.add(jMenuItem17);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem7.setText("Deshacer");
        jMenu2.add(jMenuItem7);

        jMenuItem6.setText("Rehacer");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator3);

        jMenuItem8.setText("Copiar");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Cortar");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Pegar");
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator4);

        jMenuItem11.setText("Seleccionar todo");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Eliminar selección");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Vista");

        jMenuItem1.setText("Fuente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setText("Tema");
        jMenu6.add(jMenuItem2);
        jMenu6.add(jSeparator1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Mostrar numero de linea");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Mostrar code folding");
        jMenu6.add(jCheckBoxMenuItem2);
        jMenu6.add(jSeparator2);

        jMenuItem3.setText("Propiedades");
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ayuda");

        jMenuItem4.setText("Acerca de");
        jMenu7.add(jMenuItem4);

        jMenuItem5.setText("Documentación");
        jMenu7.add(jMenuItem5);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlToolMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlToolMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReRunActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void tabChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabChanged
        txtOutput.setText("La tab seleccionada es: " + tabbedCode.getSelectedIndex());
    }//GEN-LAST:event_tabChanged

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // Boton compilar
        actualCode = lista.get(tabbedCode.getSelectedIndex()-1);
        txtOutput.setText(actualCode.getText());
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //LookAndFeel FlatLaf
        //Propiedades
        FlatIntelliJLaf.registerCustomDefaultsSource("estilos");
        try {
            UIManager.setLookAndFeel( new FlatLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnReRun;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JSplitPane leftSplit;
    private javax.swing.JSplitPane mainSplit;
    private javax.swing.JPanel pnlLexico;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSemantico;
    private javax.swing.JPanel pnlSintactico;
    private javax.swing.JPanel pnlToolMenu;
    private javax.swing.JSplitPane rightSplit;
    private javax.swing.JScrollPane scrLexico;
    private javax.swing.JTabbedPane tabbedCode;
    private javax.swing.JTabbedPane tabbedCompile;
    public static javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

    private void botonMas() {
        
    }
    
    public void setTxtOutput(String t){
        txtOutput.setText(t);
    }
}
