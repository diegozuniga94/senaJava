/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Control.Control;
import Modelo.Jugador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nestor
 */
public class Listar extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     */
    
    Control obj = new Control();
    
    public Listar() {
        initComponents();
        actualizartabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListar = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldCedulaBus = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonTop5 = new javax.swing.JButton();
        idActulizar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonGolesPI = new javax.swing.JButton();
        jButtonGolesPD = new javax.swing.JButton();
        jButtonGolesC = new javax.swing.JButton();
        jButtonGolesTL = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Cedula", "Posicion Original", "Sueldo", "Edad", "Posicion Aux1"
            }
        ));
        jScrollPane1.setViewportView(jTableListar);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jLabelCedula.setText("Cedula");

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jButtonTop5.setText("TOP 5 Goles");
        jButtonTop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTop5ActionPerformed(evt);
            }
        });

        idActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActulizarActionPerformed(evt);
            }
        });

        jButton3.setText("Ver Estadisticas de jugador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar Estadisticas del jugador ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonGolesPI.setText("Goles PI");
        jButtonGolesPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGolesPIActionPerformed(evt);
            }
        });

        jButtonGolesPD.setText("Goles PD");
        jButtonGolesPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGolesPDActionPerformed(evt);
            }
        });

        jButtonGolesC.setText("Goles C");
        jButtonGolesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGolesCActionPerformed(evt);
            }
        });

        jButtonGolesTL.setText("Goles TL");
        jButtonGolesTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGolesTLActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCedulaBus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(idActulizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonTop5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonActualizar)
                                        .addGap(20, 20, 20)
                                        .addComponent(jButtonBuscar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jButtonBorrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGolesPI)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGolesPD)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGolesC)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGolesTL)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCedulaBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCedula)
                    .addComponent(idActulizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonTop5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGolesPI)
                    .addComponent(jButtonGolesPD)
                    .addComponent(jButtonGolesC)
                    .addComponent(jButtonGolesTL))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.actualizartabla();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
               
        int cedula = Integer.parseInt(jTextFieldCedulaBus.getText());
        new Actualizar(cedula).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        try {
            JOptionPane.showMessageDialog(null,"Registro Eliminado");
            obj.eliminarEvento();
        } catch (SQLException ex) {
            Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonTop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTop5ActionPerformed
        new Top5().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonTop5ActionPerformed

    private void idActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActulizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActulizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            obj.controlBuscarEjugador();
        } catch (SQLException ex) {
            Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        new VerEstadisticas().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonGolesPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGolesPIActionPerformed
        new GolesPI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGolesPIActionPerformed

    private void jButtonGolesPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGolesPDActionPerformed
        new GolesPD().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGolesPDActionPerformed

    private void jButtonGolesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGolesCActionPerformed
        new GolesCabeza().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGolesCActionPerformed

    private void jButtonGolesTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGolesTLActionPerformed
        new GolesTiroLibre().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGolesTLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new Estadisticas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
        
    }
    
    public void actualizartabla(){
        ArrayList<Jugador> ests = obj.controlBuscarPersona();
        DefaultTableModel modelo;
        
        modelo = (DefaultTableModel) jTableListar.getModel();
        int id, cedula, sueldo, asistencias,goles;
        double altura;
        String nombre,apellido,posicion,posicionAux1, edad;

        for (int i = 0; i < ests.size(); i++) {
            
            id = ests.get(i).getID();
            nombre = ests.get(i).getNombre();
            apellido = ests.get(i).getApellidos();
            cedula = ests.get(i).getCedula();
            posicion = ests.get(i).getPosicion();
            sueldo = ests.get(i).getSueldo();
            edad = ests.get(i).getEdad();
            posicionAux1 = ests.get(i).getPosicionAlternativa();
            asistencias = ests.get(i).getAsistencias();
            
                       
            
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            for (int j = 0; j < 4; j++) {
                jTableListar.getColumnModel().getColumn(j).setHeaderRenderer(tcr);
                jTableListar.getColumnModel().getColumn(j).setCellRenderer(tcr);
            }
            modelo.setNumRows(i);

            modelo.addRow(new Object[]{
                id, nombre ,apellido, cedula, posicion, sueldo, edad, posicionAux1, asistencias,
            });
        }

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField idActulizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButtonActualizar;
    public static javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGolesC;
    private javax.swing.JButton jButtonGolesPD;
    private javax.swing.JButton jButtonGolesPI;
    private javax.swing.JButton jButtonGolesTL;
    private javax.swing.JButton jButtonTop5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableListar;
    public static javax.swing.JTextField jTextFieldCedulaBus;
    // End of variables declaration//GEN-END:variables
}
