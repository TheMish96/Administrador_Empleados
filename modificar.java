/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author will
 */
public class modificar extends javax.swing.JFrame {
conectar m = new conectar ();
   Connection n = m.conectar();
   
    public modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        modificar.setEnabled(false);
    }
    
    void limpiar (){
        ID_M.setText("");
        nombre.setText("");
        apellidoh.setText("");
        apellidom.setText("");
        puesto.setText("");
        PAGO.setText("");
        
        
    }
    
    
    
    void analizar (){
        
        
        String ids=ID_M.getText();
        int id=Integer.parseInt(ids);
        String sql = "select id_empleado from empleado where id_empleado ="+id+"";
        Statement st ;
         try {
        st =n.createStatement();
        ResultSet rs = st.executeQuery(sql);
            
        if (rs.next()){
            
            salar();
            
        }  
        
        else{
            JOptionPane.showMessageDialog(null,"ID invalido");
           ID_M.setText("");
           
           limpiar();
        }
                    
        } catch (SQLException ex) {
          
            Logger.getLogger(MOSTRAR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void salar(){
        String id= ID_M.getText();
        String cal ="Select * FROM empleado Where id_empleado ='"+id+"'";
        
        PreparedStatement calculo;
           try {
               calculo = m.conectar().prepareStatement(cal);
                ResultSet usuario = calculo.executeQuery();
        
        while(usuario.next()){
            ID_M.setText(usuario.getString(1));
            nombre.setText(usuario.getString(2));
            apellidoh.setText(usuario.getString(3));
            apellidom.setText(usuario.getString(4));
            puesto.setText(usuario.getString(5));
            PAGO.setText(usuario.getString(6));
           
        
    }
           } catch (SQLException ex) {
               Logger.getLogger(SALARIO.class.getName()).log(Level.SEVERE, null, ex);
           }
           modificar.setEnabled(true);
       }
        

    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ID_M = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidom = new javax.swing.JTextField();
        apellidoh = new javax.swing.JTextField();
        puesto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PAGO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("INGRESE ID");

        ID_M.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ID_MKeyTyped(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO MATERNO");

        jLabel4.setText("APELLIDO PATERNO");

        jLabel5.setText("PUESTO");

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        apellidom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidomKeyTyped(evt);
            }
        });

        apellidoh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidohKeyTyped(evt);
            }
        });

        puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                puestoKeyTyped(evt);
            }
        });

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel6.setText("PAGO POR HORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID_M, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre)
                    .addComponent(apellidom)
                    .addComponent(apellidoh)
                    .addComponent(puesto, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(PAGO))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(modificar)))
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PAGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(ID_M.getText().length()==0){
           
           JOptionPane.showMessageDialog(null,"FABOR DE INGRESAR ID");
       } 
       else{
        analizar();
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        String id= ID_M.getText();
        try {
        PreparedStatement pps =n.prepareStatement ("UPDATE empleado  SET nombres='"+nombre.getText()+"',apellidoh='"+apellidoh.getText()+"',apellidom='"+apellidom.getText()+"',puesto='"+puesto.getText()+"' WHERE id_empleado='"+id+"'");
        pps.executeUpdate();
        JOptionPane.showMessageDialog(null,"cambios efectuados en la base de datos");
        limpiar();
        modificar.setEnabled(false);
        
    } catch (SQLException ex) {
        Logger.getLogger(modificar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        
        
        
  
    }//GEN-LAST:event_modificarActionPerformed

    private void ID_MKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_MKeyTyped
      char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_ID_MKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
      char c=evt.getKeyChar(); 
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidomKeyTyped
      char c=evt.getKeyChar(); 
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_apellidomKeyTyped

    private void apellidohKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidohKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_apellidohKeyTyped

    private void puestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puestoKeyTyped
      char c=evt.getKeyChar(); 
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_puestoKeyTyped

   
    public static void main(String args[]) {
       
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_M;
    private javax.swing.JTextField PAGO;
    private javax.swing.JTextField apellidoh;
    private javax.swing.JTextField apellidom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField puesto;
    // End of variables declaration//GEN-END:variables
}
