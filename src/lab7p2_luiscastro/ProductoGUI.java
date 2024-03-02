/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_luiscastro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author lfern
 */
public class ProductoGUI extends javax.swing.JFrame {

    /**
     * Creates new form ProductoGUI
     */
    public ProductoGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_archivos = new javax.swing.JPopupMenu();
        jmi_LoadF = new javax.swing.JMenuItem();
        jmiPP_refresh = new javax.swing.JMenuItem();
        pp_table = new javax.swing.JPopupMenu();
        jmipp_clear = new javax.swing.JMenuItem();
        tf_commands = new javax.swing.JTextField();
        btn_commands = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_archivos = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_productos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_file = new javax.swing.JMenu();
        jmi_newFile = new javax.swing.JMenuItem();
        jmi_ImportFile = new javax.swing.JMenuItem();
        m_window = new javax.swing.JMenu();
        m_clear = new javax.swing.JMenu();
        jmi_clearCMDL = new javax.swing.JMenuItem();
        jmi_clearTable = new javax.swing.JMenuItem();
        jmi_refreshTree = new javax.swing.JMenuItem();
        m_help = new javax.swing.JMenu();
        jmi_ProductS = new javax.swing.JMenuItem();
        jmi_Commands = new javax.swing.JMenuItem();

        jmi_LoadF.setText("Load Files");
        jmi_LoadF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_LoadFActionPerformed(evt);
            }
        });
        pp_archivos.add(jmi_LoadF);

        jmiPP_refresh.setText("Refresh Tree");
        pp_archivos.add(jmiPP_refresh);

        jmipp_clear.setText("Clear Table");
        jmipp_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmipp_clearActionPerformed(evt);
            }
        });
        pp_table.add(jmipp_clear);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_commands.setText("Entrar");
        btn_commands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_commandsMouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Archivos CVS");
        jt_archivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_archivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_archivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_archivos);

        jtable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Categoria", "Price", "Aisle", "Bin"
            }
        ));
        jtable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_productos);

        m_file.setText("File");

        jmi_newFile.setText("New File");
        jmi_newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_newFileActionPerformed(evt);
            }
        });
        m_file.add(jmi_newFile);

        jmi_ImportFile.setText("Import File");
        jmi_ImportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ImportFileActionPerformed(evt);
            }
        });
        m_file.add(jmi_ImportFile);

        jMenuBar1.add(m_file);

        m_window.setText("Window");

        m_clear.setText("Clear");

        jmi_clearCMDL.setText("Clear Command Line");
        jmi_clearCMDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_clearCMDLActionPerformed(evt);
            }
        });
        m_clear.add(jmi_clearCMDL);

        jmi_clearTable.setText("Clear Table");
        jmi_clearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_clearTableActionPerformed(evt);
            }
        });
        m_clear.add(jmi_clearTable);

        m_window.add(m_clear);

        jmi_refreshTree.setText("Refresh Tree");
        m_window.add(jmi_refreshTree);

        jMenuBar1.add(m_window);

        m_help.setText("Help");

        jmi_ProductS.setText("Product Structure");
        jmi_ProductS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ProductSActionPerformed(evt);
            }
        });
        m_help.add(jmi_ProductS);

        jmi_Commands.setText("Commands");
        jmi_Commands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CommandsActionPerformed(evt);
            }
        });
        m_help.add(jmi_Commands);

        jMenuBar1.add(m_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tf_commands, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_commands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_commands, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_commands))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_archivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_archivosMouseClicked
        // TODO add your handling code here:
       if(evt.getButton()==3){
           pp_archivos.show(evt.getComponent(), evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_jt_archivosMouseClicked

    private void jtable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_productosMouseClicked
        // TODO add your handling code here:
        if(evt.getButton() == 3){
            pp_table.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jtable_productosMouseClicked

    private void btn_commandsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_commandsMouseClicked
        // TODO add your handling code here:
        String comando = tf_commands.getText();
        String nom_archivo = "";
        boolean vcomando= false;
        if(comando.contains("./load")){
            nom_archivo = obtenerNombreArchivo(comando, nom_archivo);
            Load(nom_archivo);
            
                
        }else if(comando.contains("./create")){
            nom_archivo = obtenerNombreArchivo(comando, nom_archivo);
            try {
                crearArchivo(nom_archivo);
            } catch (IOException ex) {
                
            }
            
        }else if(comando.equals("./clear")){  
            DefaultTableModel m =(DefaultTableModel) jtable_productos.getModel();
            m.setRowCount(0);
            m.setRowCount(16);
            jtable_productos.setModel(m);
            
        }else if(comando.equals("./refresh")){
            
        }else{
            JOptionPane.showMessageDialog(this, "Comando invalido!");
        }
        tf_commands.setText("");
    }//GEN-LAST:event_btn_commandsMouseClicked

    private void jmi_LoadFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_LoadFActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel m = (DefaultTreeModel) jt_archivos.getModel();
        DefaultMutableTreeNode r = (DefaultMutableTreeNode) m.getRoot();
        
        
    }//GEN-LAST:event_jmi_LoadFActionPerformed

    private void jmi_clearCMDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_clearCMDLActionPerformed
        // TODO add your handling code here:
        tf_commands.setText("");
    }//GEN-LAST:event_jmi_clearCMDLActionPerformed

    private void jmi_clearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_clearTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m =(DefaultTableModel) jtable_productos.getModel();
            m.setRowCount(0);
            m.setRowCount(16);
            jtable_productos.setModel(m);
    }//GEN-LAST:event_jmi_clearTableActionPerformed

    private void jmipp_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmipp_clearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m =(DefaultTableModel) jtable_productos.getModel();
            m.setRowCount(0);
            m.setRowCount(16);
            jtable_productos.setModel(m);                        
    }//GEN-LAST:event_jmipp_clearActionPerformed

    private void jmi_newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_newFileActionPerformed
        // TODO add your handling code here:
        String comando = tf_commands.getText();
        String nom_archivo = "";
        nom_archivo = obtenerNombreArchivo(comando, nom_archivo);
        DefaultTableModel m = (DefaultTableModel) jtable_productos.getModel();
        File arc = null;
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            arc = new File("./creados/"+nom_archivo+".txt");
            fw = new FileWriter(arc);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                if(m.getValueAt(i, 0)== null||m.getValueAt(i, 1)== null||m.getValueAt(i, 2)== null||m.getValueAt(i, 3)== null||m.getValueAt(i, 4)== null||m.getValueAt(i, 5)== null){
                    continue;
                }else{
                    bw.write(m.getValueAt(i, 0)+",");
                    bw.write(m.getValueAt(i, 1)+",");
                    bw.write(m.getValueAt(i, 2)+",");
                    bw.write(m.getValueAt(i, 3)+",");
                    bw.write(m.getValueAt(i, 4)+",");
                    bw.write(m.getValueAt(i, 5)+",");
                }
                bw.flush();
            }
            
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            
        }
  
        JOptionPane.showMessageDialog(this, "Se ha creado el archivo!");
        m.setRowCount(0);
        m.setRowCount(15);
        jtable_productos.setModel(m);
    }//GEN-LAST:event_jmi_newFileActionPerformed

    private void jmi_ImportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ImportFileActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser("./");
        File seleccionado = null;
        int seleccion = jfc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION)
            {
               seleccionado = jfc.getSelectedFile();
            
            }

        LoadFile(seleccionado);
    }//GEN-LAST:event_jmi_ImportFileActionPerformed

    private void jmi_ProductSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ProductSActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Los productos tienen la siguiente estructura:\n"
                + "Id, es el id del producto que consiste en numeros.\n El nombre, el nombre de producto.\n La categoria, que debe tener valores de 0 a 9.\n"
                + "El precio, el precio del producto en doubles.\n La aisle, el numero del pasillo en donde esta el producto, consiste de 3 numeros enteros.\n"
                + "El Bin, que es el lugar exacto donde se guardan los productos y consiste de 3 numeros enteros.");
    }//GEN-LAST:event_jmi_ProductSActionPerformed

    private void jmi_CommandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CommandsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jmi_CommandsActionPerformed
    
   
    public String obtenerNombreArchivo(String comando, String nom_archivo){
        Scanner sc = new Scanner(comando);
        sc.useDelimiter(" ");
        while (sc.hasNext()) {
                sc.next();
                nom_archivo = sc.next();   
            }
       return nom_archivo;
    }
    
    
    public void Load(String nom_archivo){
        AdmProducto am = new AdmProducto(nom_archivo+".txt");
            if (am.archivo.exists()) {
                am.cargarArchivo();
                DefaultTableModel m = (DefaultTableModel)jtable_productos.getModel();
                m.setRowCount(0);
                for (Producto p : am.getProductos()) {
                    Object[]row = {p.getId(),
                        p.getNombre(),
                        p.getCategory(),
                        p.getPrecio(),
                        p.getAisle(),
                        p.getBin()};                   
                m.addRow(row);
                }
                
                jtable_productos.setModel(m);
        }else{
             JOptionPane.showMessageDialog(this, "El archivo no existe!");   
            }
    }
    public void LoadFile(File x){    
        AdmProducto am = new AdmProducto(x.getName());
            if (am.archivo.exists()) {
                am.cargarArchivo();
                DefaultTableModel m = (DefaultTableModel)jtable_productos.getModel();
                m.setRowCount(0);
                for (Producto p : am.getProductos()) {
                    Object[]row = {p.getId(),
                        p.getNombre(),
                        p.getCategory(),
                        p.getPrecio(),
                        p.getAisle(),
                        p.getBin()};                   
                m.addRow(row);
                }
                
                jtable_productos.setModel(m);
        }else{
             JOptionPane.showMessageDialog(this, "El archivo no existe!");   
            }
    }
    public void crearArchivo(String nom_archivo) throws IOException{
        DefaultTableModel m = (DefaultTableModel) jtable_productos.getModel();
        File arc = null;
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            arc = new File("./creados/"+nom_archivo+".txt");
            fw = new FileWriter(arc);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                if(m.getValueAt(i, 0)== null||m.getValueAt(i, 1)== null||m.getValueAt(i, 2)== null||m.getValueAt(i, 3)== null||m.getValueAt(i, 4)== null||m.getValueAt(i, 5)== null){
                    continue;
                }else{
                    bw.write(m.getValueAt(i, 0)+",");
                    bw.write(m.getValueAt(i, 1)+",");
                    bw.write(m.getValueAt(i, 2)+",");
                    bw.write(m.getValueAt(i, 3)+",");
                    bw.write(m.getValueAt(i, 4)+",");
                    bw.write(m.getValueAt(i, 5)+",");
                }
                bw.flush();
            }
            
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
        JOptionPane.showMessageDialog(this, "Se ha creado el archivo!");
        m.setRowCount(0);
        m.setRowCount(15);
        jtable_productos.setModel(m);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_commands;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmiPP_refresh;
    private javax.swing.JMenuItem jmi_Commands;
    private javax.swing.JMenuItem jmi_ImportFile;
    private javax.swing.JMenuItem jmi_LoadF;
    private javax.swing.JMenuItem jmi_ProductS;
    private javax.swing.JMenuItem jmi_clearCMDL;
    private javax.swing.JMenuItem jmi_clearTable;
    private javax.swing.JMenuItem jmi_newFile;
    private javax.swing.JMenuItem jmi_refreshTree;
    private javax.swing.JMenuItem jmipp_clear;
    private javax.swing.JTree jt_archivos;
    private javax.swing.JTable jtable_productos;
    private javax.swing.JMenu m_clear;
    private javax.swing.JMenu m_file;
    private javax.swing.JMenu m_help;
    private javax.swing.JMenu m_window;
    private javax.swing.JPopupMenu pp_archivos;
    private javax.swing.JPopupMenu pp_table;
    private javax.swing.JTextField tf_commands;
    // End of variables declaration//GEN-END:variables
    
}
