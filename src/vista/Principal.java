/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

//import analizadores.Lexer;
//import analizadores.parser;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import custom.botones.ButtonTabComponent;
import icons.SVGIcons;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.fife.ui.rsyntaxtextarea.FileLocation;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.TextEditorPane;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author jairi
 */


public class Principal extends javax.swing.JFrame {

    private RSyntaxTextArea currentCode;
    private FileManager fileManager;
    private String currentFolder;
    
    public Principal() {
        initComponents();
        initParams();
    }
    
    public RSyntaxTextArea getCurrentCode(){
        return currentCode;
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnNuevaPestaña = new javax.swing.JButton();
        pnlTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        lblNewFile = new javax.swing.JLabel();
        lblOpenFile = new javax.swing.JLabel();
        lblOpenFolder = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        lblRepo = new javax.swing.JLabel();
        lblWiki = new javax.swing.JLabel();
        lblabout = new javax.swing.JLabel();
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
        jMenu3 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        pnlSearch.setLayout(new java.awt.BorderLayout());

        txtSearch.setPreferredSize(new java.awt.Dimension(200, 26));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        pnlSearch.add(txtSearch, java.awt.BorderLayout.LINE_END);

        btnNuevaPestaña.setText("+");
        btnNuevaPestaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPestañaActionPerformed(evt);
            }
        });

        pnlTab.setOpaque(false);

        jLabel1.setIcon(SVGIcons.PlayIcon());
        jLabel1.setText("Prueba");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton1.setText("x");
        jButton1.setBorder(null);

        javax.swing.GroupLayout pnlTabLayout = new javax.swing.GroupLayout(pnlTab);
        pnlTab.setLayout(pnlTabLayout);
        pnlTabLayout.setHorizontalGroup(
            pnlTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTabLayout.setVerticalGroup(
            pnlTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setSize(11, 11);

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
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnAbrir.setText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
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

        tabbedCode.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabbedCode.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedCode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabChanged(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Bienvenido a RoboKit IDE");

        jPanel1.setBackground(new java.awt.Color(139, 187, 214));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo2.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo2.setText("A programar!");

        lblNewFile.setIcon(SVGIcons.AddIcon());
        lblNewFile.setText("Crear un nuevo archivo...");
        lblNewFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNewFileMousePressed(evt);
            }
        });

        lblOpenFile.setIcon(SVGIcons.FileOpenIcon());
        lblOpenFile.setText("Abrir un archivo...");

        lblOpenFolder.setIcon(SVGIcons.FolderIcon());
        lblOpenFolder.setText("Abrir una carpeta...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo2)
                    .addComponent(lblNewFile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOpenFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo2)
                .addGap(18, 18, 18)
                .addComponent(lblNewFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOpenFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(139, 187, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo3.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo3.setText("Documentación");

        lblRepo.setText("Visitar el repositorio");
        lblRepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRepoMousePressed(evt);
            }
        });

        lblWiki.setText("Wiki de robokit");

        lblabout.setText("Acerca de...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo3)
                    .addComponent(lblRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWiki, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblabout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo3)
                .addGap(18, 18, 18)
                .addComponent(lblRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWiki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblabout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(179, 203, 197));
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

        tabbedCompile.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
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

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem13.setText("Nuevo archivo");
        jMenu1.add(jMenuItem13);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem16.setText("Nueva carpeta");
        jMenu1.add(jMenuItem16);
        jMenu1.add(jSeparator5);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem14.setText("Abrir archivo");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem15.setText("Abrir carpeta");
        jMenu1.add(jMenuItem15);
        jMenu1.add(jSeparator6);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem18.setText("Guardar");
        jMenu1.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem19.setText("Guardar como...");
        jMenu1.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem20.setText("Guardar todo");
        jMenu1.add(jMenuItem20);
        jMenu1.add(jSeparator7);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem17.setText("Salir");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
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

        jMenu3.setText("Fuente");

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem21.setText("Subir tamaño");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SUBTRACT, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem22.setText("Bajar tamaño");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem22);
        jMenu3.add(jSeparator8);

        jMenuItem23.setText("Más");
        jMenu3.add(jMenuItem23);

        jMenu6.add(jMenu3);

        jMenu4.setText("Tema");

        jMenuItem25.setText("Claro");
        jMenu4.add(jMenuItem25);

        jMenuItem24.setText("Oscuro");
        jMenu4.add(jMenuItem24);

        jMenu6.add(jMenu4);
        jMenu6.add(jSeparator1);

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Mostrar numero de linea");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Mostrar code folding");
        jMenu6.add(jCheckBoxMenuItem2);
        jMenu6.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Propiedades");
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ayuda");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem4.setText("Acerca de");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem5.setText("Documentación");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
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
        //txtOutput.setText("La tab seleccionada es: " + tabbedCode.getSelectedIndex());
        //activarBotones();
    }//GEN-LAST:event_tabChanged

    /*
        Metodo compilar
    */
    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // Obener el texto de la tab seleccionada
        String codigo = fileManager.getTXT(tabbedCode).getText();
        
        // Realizar el analisis lexico
        // lexer = new Lexer(new BufferedReader(new StringReader(codigo)));
        
        // Crear un parser (analisis sintactico y semantico) con el analizador lexer
        //parser sintax = new parser(lexer);
        
        // hacer el analisis sintactico
//        try {
//            sintax.parse();
//            txtOutput.setText("El resultado es: " +sintax.resultado);
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void lblRepoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRepoMousePressed
        // Ir al repo del proyecto
        openURL("https://github.com/dev-aj001/RoboKit_IDE");
    }//GEN-LAST:event_lblRepoMousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Abrir pagina del manual de usuario o ayuda
        openURL("https://github.com/dev-aj001/RoboKit_IDE");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Abrir pagina de documentacion
        openURL("https://github.com/dev-aj001/RoboKit_IDE");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // Subir 1 al tamaño de la fuente
        System.out.println("se sube la fuente");
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // Bajar 1 al tamaño de la fuente
        System.out.println("se baja la fuente");
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnNuevaPestañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPestañaActionPerformed
        addCodeTab();
    }//GEN-LAST:event_btnNuevaPestañaActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // Abrir un archivo en una nueva pestaña
        openCodeTab();
        
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        JOptionPane.showConfirmDialog(null, "Seguro que deseas salir");
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // Abrir un archivo en una nueva pestaña
        openCodeTab();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        saveFile();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lblNewFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewFileMousePressed
        openCodeTab();
    }//GEN-LAST:event_lblNewFileMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        addCodeTab();
    }//GEN-LAST:event_btnNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //LookAndFeel FlatLaf
        //Propiedades
        //FlatIntelliJLaf.registerCustomDefaultsSource("estilos");
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
    private javax.swing.JButton btnNuevaPestaña;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnReRun;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
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
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblNewFile;
    private javax.swing.JLabel lblOpenFile;
    private javax.swing.JLabel lblOpenFolder;
    private javax.swing.JLabel lblRepo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblWiki;
    private javax.swing.JLabel lblabout;
    private javax.swing.JSplitPane leftSplit;
    private javax.swing.JSplitPane mainSplit;
    private javax.swing.JPanel pnlLexico;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSemantico;
    private javax.swing.JPanel pnlSintactico;
    private javax.swing.JPanel pnlTab;
    private javax.swing.JPanel pnlToolMenu;
    private javax.swing.JSplitPane rightSplit;
    private javax.swing.JScrollPane scrLexico;
    private javax.swing.JTabbedPane tabbedCode;
    private javax.swing.JTabbedPane tabbedCompile;
    public static javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    /**
    * Agrega una nueva pestaña al JTabbedPane (tabbedCode) que contiene un RSyntaxTextArea en un RTextScrollPane.
    * La pestaña se titula "Nuevo*" inicialmente y se llena con el contenido de un archivo si se proporciona uno.
    *
    * @param choose true: muestra un FileChooser, false: agrega una pestaña Nuevo*
    */
    private void addCodeTab() {
        // Muestra un cuadro de diálogo para ingresar el nombre del archivo
        String title = JOptionPane.showInputDialog("Nombre del nuevo archivo", "nuevo.txt*");        

        // Verifica si el usuario presionó "Cancelar" o cerró la ventana
        if (title != null) {
            // El usuario ingresó un nombre, realiza la lógica necesaria
            fileManager.addTab(tabbedCode, title, currentFolder);
        } else {
            // El usuario presionó "Cancelar" o cerró la ventana
            //System.out.println("Operación cancelada por el usuario");
            // Puedes realizar alguna lógica adicional si es necesario
        }
    }
    
    private void openCodeTab(){
        
    }
    
    
    /**
    * Abrir un url en el navegador.
    *
    * @param url Cadena con el url completo a abrir.
    */
    private static void openURL(String url) {
        try {
            // Obtener el escritorio del sistema
            Desktop desktop = Desktop.getDesktop();

            // Abrir la URL en el navegador predeterminado
            desktop.browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Al parecer ocurrio un error");
        }
    }
    
    /**
     * 
     * @return retorna un archivo File que fue seleccionado por el filechooser
     */
    private File chooseFile(){
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }
    
    private File createFile(){
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }
    
    //Iconos
    private void setIcons() {
        btnNuevo.setIcon(SVGIcons.NoteAddIcon());
        btnGuardar.setIcon(SVGIcons.SaveIcon());
        btnAbrir.setIcon(SVGIcons.FolderIcon());
        btnDeshacer.setIcon(SVGIcons.UndoIcon());
        btnRehacer.setIcon(SVGIcons.RedoIcon());
        btnCompilar.setIcon(SVGIcons.PlayIcon());
        btnReRun.setIcon(SVGIcons.ArrowLeftIcon());
    }
    /**
     * Este metodo aun no funciona correctamente
     * @param color 
     */
    private void changeIconColor(Color color){
        SVGIcons.changeColor(color);
        btnNuevo.repaint();
        btnGuardar.repaint();
        btnDeshacer.repaint();
        btnRehacer.repaint();
        btnCompilar.repaint();
    }
    
    public void setTxtOutput(String t){
        txtOutput.setText(t);
    }

    /**
     * Este metodo es utilizado para todas las propiedades de los componentes 
     *  
     * 
     */
    private void clientProp() {
        setupTabbedCode();
        setupSearch();
    }

    private void setupTabbedCode() {
        tabbedCode.putClientProperty("JTabbedPane.leadingComponent", btnNuevaPestaña);
        tabbedCode.putClientProperty("JTabbedPane.trailingComponent", pnlSearch);
        tabbedCode.putClientProperty("JTabbedPane.tabClosable", true);
        tabbedCode.putClientProperty( "JTabbedPane.tabCloseCallback",
    (IntConsumer) tabIndex -> {
            // Lógica para cerrar la pestaña con el índice 'tabIndex'
            if (tabIndex >= 0 && tabIndex < tabbedCode.getTabCount()) {
                fileManager.removeTab(tabbedCode, tabIndex);
            }
        });
    }
    
    private void setupSearch(){
        txtSearch.putClientProperty("JTextField.placeholderText", "Buscar");
        txtSearch.putClientProperty("JTextField.leadingIcon", SVGIcons.SearchIcon());
        //txtSearch.putClientProperty("JTextField.showClearButton", true);
        
    }

    private void enableButtons() {
        String tabTtile = tabbedCode.getTitleAt(tabbedCode.getSelectedIndex());
        if(!tabTtile.endsWith(".rk")){
            btnCompilar.setEnabled(false);
            //btnDeshacer.setEnabled(false);
            //btnRehacer.setEnabled(false);
        }else{
            btnCompilar.setEnabled(true);
            //btnDeshacer.setEnabled(true);
            //btnRehacer.setEnabled(true);
        }
        
//        if(getCurrentCode()!= null){  /*Reparar el getCurrentCode*/
//            if(getCurrentCode().canUndo()){
//                btnDeshacer.setEnabled(true);
//            }else {
//                btnDeshacer.setEnabled(false);
//            }
//
//            if(getCurrentCode().canRedo()){
//                btnRehacer.setEnabled(true);
//            }else {
//                btnRehacer.setEnabled(false);
//            }
//        }
    }

    private void saveFile(){
        
        
        File archivo = fileManager.getFile(tabbedCode);
        
        if(archivo!=null){
            if(archivo.isFile()){
                try {
                    // Ya existe el archivo
                    // Verificar si estado modificado
                    // if(isStateChanged(fileManager.getTXT(tabbedCode, tabbedCode.getSelectedIndex())))
                    System.out.println("Puede guardar");
                    fileManager.getTXT(tabbedCode).save();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
                saveAs();
            }
            
        }
    }
    
    private void saveAs(){
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setSelectedFile(new File(tabbedCode.getTitleAt(tabbedCode.getSelectedIndex())));
        
        // Establece un filtro para mostrar solo archivos con una extensión específica, por ejemplo, .txt
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter2);

        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Archivos de texto (*.rk)", "rk");
        fileChooser.setFileFilter(filter1);

        // Muestra el cuadro de diálogo para guardar archivo
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                // El usuario ha seleccionado un archivo y ha hecho clic en "Guardar"
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                
                // Realiza la lógica de guardado con el filePath
                
                fileManager.getTXT(tabbedCode).saveAs(FileLocation.create(filePath));
                
                tabbedCode.setTitleAt(tabbedCode.getSelectedIndex(),selectedFile.getName());
                
                fileManager.updateFileList(tabbedCode);
                System.out.println("Archivo " + selectedFile.getName() + " Guardando en: " + filePath);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (result == JFileChooser.CANCEL_OPTION) {
            // El usuario ha cerrado el cuadro de diálogo o ha presionado "Cancelar"
            System.out.println("Operación de guardar cancelada por el usuario");
        }
        
        
        /*
        try {
                // No existe el archivo (guardar como)
                File f = chooseFile().getAbsoluteFile();
                System.out.println("File: " + f.toString());
                fileManager.getTXT(tabbedCode).saveAs(FileLocation.create(f.toString()));
                
                
        } catch (IOException ex) {
                Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    /*
    private void manejoDeArchivo(){
        // Agrega un DocumentListener al Document del JTextArea
        getTextFromList().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // Se llama cuando se inserta texto
                System.out.println("Se ha insertado texto");
                tabbedCode.setTitleAt(getTabSelected(), tabbedCode.getTitleAt(getTabSelected()) + "*"); 
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // Se llama cuando se elimina texto
                System.out.println("Se ha eliminado texto");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Se llama cuando hay un cambio que no afecta el contenido del texto
                System.out.println("Se ha producido un cambio");
            }
        });
    
    }*/

    private void initParams() {
        this.fileManager = new FileManager();
        this.currentFolder = "";
        clientProp();
        rightSplit.setDividerLocation(0.6);
        setIcons();   
    }

    private void isStateChanged() {
        fileManager.getTXT(tabbedCode).getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
}
