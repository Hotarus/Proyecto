/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionSuministro;

import GestionEmpleado.*;
import Form.*;
import GestionDiseno.VentanaDiseno;
import GestionEnsamblador.VentanaEnsamblador;
import GestionPedido.VentanaPedido;
import GestionProveedor.VentanaProveedor;
import GestionSuministro.VentanaSuministro;
import GestionVerificador.VentanaVerificador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author enzun
 */
public class GestionSuministroIngreso extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://bxufzxoo6au5els5kkfs-mysql.services.clever-cloud.com:3306/bxufzxoo6au5els5kkfs";
    public static final String USERNAME = "umwratiamgibycac";
    public static final String PASSWORD = "a7DBA8jxpjzIE6ATzWJ1";

    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
private void limpiarCajas(){
    
    txtCodigoSuministro.setText(null);
    txtNombreSuministro.setText(null);
    txtBodegaSuministro.setText(null);
    txtUbicaciónSuministro.setText(null);
    txtDescripcionSuministro.setText(null);
    txtTipoSuministro.setText(null);
}
    public GestionSuministroIngreso() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigoSuministro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombreSuministro = new javax.swing.JTextField();
        txtBodegaSuministro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUbicaciónSuministro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDescripcionSuministro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTipoSuministro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 58, 73));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(39, 45, 57));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jLabel3.setText("Volver");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 230, -1));

        jLabel4.setBackground(new java.awt.Color(39, 45, 57));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado.png"))); // NOI18N
        jLabel4.setText("Empleado");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, -1));

        jLabel6.setBackground(new java.awt.Color(39, 45, 57));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        jLabel6.setText("Proveedor");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, -1));

        jLabel7.setBackground(new java.awt.Color(39, 45, 57));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ensamblador.png"))); // NOI18N
        jLabel7.setText("Ensamblador");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, -1));

        jLabel22.setBackground(new java.awt.Color(39, 45, 57));
        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/suministro.png"))); // NOI18N
        jLabel22.setText("Suministro");
        jLabel22.setFocusable(false);
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, -1));

        jLabel23.setBackground(new java.awt.Color(39, 45, 57));
        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Verificador.png"))); // NOI18N
        jLabel23.setText("Verificador");
        jLabel23.setFocusable(false);
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, -1));

        jLabel24.setBackground(new java.awt.Color(39, 45, 57));
        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Diseño.png"))); // NOI18N
        jLabel24.setText("Diseño");
        jLabel24.setFocusable(false);
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, -1));

        jLabel5.setBackground(new java.awt.Color(39, 45, 57));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pedido.png"))); // NOI18N
        jLabel5.setText("Pedido");
        jLabel5.setFocusable(false);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 570));

        jPanel3.setBackground(new java.awt.Color(23, 100, 191));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.png"))); // NOI18N
        jLabel2.setText("ADMIN");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 130, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel10.setText("Hotarus ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 60));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("V 1.0");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("SUMINISTRO");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 50));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 780, 10));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestion.png"))); // NOI18N
        jLabel9.setText("Gestión de suministro");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel9.setOpaque(true);
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 90));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Ingreso");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Código");
        jLabel12.setOpaque(true);
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txtCodigoSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoSuministroActionPerformed(evt);
            }
        });
        jPanel4.add(txtCodigoSuministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 210, 360, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Nombre");
        jLabel13.setOpaque(true);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        txtNombreSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSuministroActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombreSuministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 360, -1));

        txtBodegaSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodegaSuministroActionPerformed(evt);
            }
        });
        jPanel4.add(txtBodegaSuministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 360, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Bodega");
        jLabel14.setOpaque(true);
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        txtUbicaciónSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicaciónSuministroActionPerformed(evt);
            }
        });
        jPanel4.add(txtUbicaciónSuministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 360, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Ubicación");
        jLabel15.setOpaque(true);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Tipo");
        jLabel16.setOpaque(true);
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        txtDescripcionSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionSuministroActionPerformed(evt);
            }
        });
        jPanel4.add(txtDescripcionSuministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 360, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Descripción");
        jLabel17.setOpaque(true);
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        txtTipoSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoSuministroActionPerformed(evt);
            }
        });
        jPanel4.add(txtTipoSuministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 360, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguente.png"))); // NOI18N
        jLabel18.setText("Guardar");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 800, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        VentanaSuministro a= new VentanaSuministro();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtCodigoSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoSuministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoSuministroActionPerformed

    private void txtNombreSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSuministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSuministroActionPerformed

    private void txtBodegaSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodegaSuministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaSuministroActionPerformed

    private void txtUbicaciónSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicaciónSuministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicaciónSuministroActionPerformed

    private void txtDescripcionSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionSuministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionSuministroActionPerformed

    private void txtTipoSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoSuministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoSuministroActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
Connection con = null;
        try{
            
            con= getConection();
            ps=(PreparedStatement) con.prepareStatement("INSERT INTO Suministro (codigosuministro, nombre, bodega, ubicacion, descripcion, tipo) VALUES (?,?,?,?,?,?)");
            ps.setString(1,txtCodigoSuministro.getText());
            ps.setString(2,txtNombreSuministro.getText());
            ps.setString(3,txtBodegaSuministro.getText());
            ps.setString(4,txtUbicaciónSuministro.getText());
            ps.setString(5,txtTipoSuministro.getText());
            ps.setString(6,txtDescripcionSuministro.getText());
            
                        
            int res = ps.executeUpdate();
            if(res>0)
            {
               JOptionPane.showMessageDialog(null,"Suministro Guardado"); 
               limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar Suministro");
                limpiarCajas();
            }
            
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }        
        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        VentanaEmpleado a= new VentanaEmpleado();
        a.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        VentanaProveedor a= new VentanaProveedor();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        VentanaEnsamblador a= new VentanaEnsamblador();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        VentanaSuministro a = new VentanaSuministro();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        VentanaVerificador a = new VentanaVerificador();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        VentanaDiseno a = new VentanaDiseno();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        VentanaPedido a= new VentanaPedido();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(GestionSuministroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionSuministroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionSuministroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionSuministroIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionSuministroIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBodegaSuministro;
    private javax.swing.JTextField txtCodigoSuministro;
    private javax.swing.JTextField txtDescripcionSuministro;
    private javax.swing.JTextField txtNombreSuministro;
    private javax.swing.JTextField txtTipoSuministro;
    private javax.swing.JTextField txtUbicaciónSuministro;
    // End of variables declaration//GEN-END:variables
}
