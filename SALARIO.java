/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import clases.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author will
 */
public class SALARIO extends javax.swing.JFrame {


   conectar m = new conectar ();
   Connection n = m.conectar();
    
    public SALARIO() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }
    
    void analizar (){
        
        String ids=money.getText();
        int id=Integer.parseInt(ids);
        String sql = "select id_empleado from empleado where id_empleado ="+id+"";
        Statement st ;
         try {
        st =n.createStatement();
        ResultSet rs = st.executeQuery(sql);
            
        if (rs.next()){
            
            salar();
            mostrar();
        }  
        
        else{
            JOptionPane.showMessageDialog(null,"ID invalido");
           money.setText("");
        }
                    
        } catch (SQLException ex) {
          
            Logger.getLogger(MOSTRAR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void mostrar(){
        
         DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("ID");
       modelo.addColumn("NOMRE");
       modelo.addColumn("APELLIDO PATERNO");
       modelo.addColumn("APELLIDO MATERNO");
       modelo.addColumn("PUESTO");
       modelo.addColumn("PAGA POR HORA");
       modelo.addColumn("HORA ENTRADA");
       modelo.addColumn("MIN ENTRADA");
       modelo.addColumn("DIA ENTRADA");
       modelo.addColumn("HORA SALIDA");
       modelo.addColumn("MINUTO SALIDA");
       modelo.addColumn("DIA SALIDA");
       
      
       
      tabla.setModel(modelo);
      String d=money.getText();
      int id=Integer.parseInt(d);  
      String sql="select* from empleado ,entrada,salida where id_entrada = "+id+" and id_salida = "+id+" and id_empleado = "+id+"";
      
      
      String datos[]= new String [12];
      Statement st ;
        try {
            st =n.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(8);
                datos[7]=rs.getString(9);
                datos[8]=rs.getString(10);
                datos[9]=rs.getString(12);
                datos[10]=rs.getString(13);
                datos[11]=rs.getString(14);
                
               
                
                
            modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            
            money.setText("");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MOSTRAR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
        }
    
    
        void salar(){    
      String k=money.getText();
      int i=Integer.parseInt(k); 
      String sqll="select (sum(horaF)-sum(horaI)+(sum(minutoF)-sum(minutoF))/60)* paga_hora  from entrada,salida ,empleado where id_entrada = "+i+" and id_salida = "+i+" and id_empleado = "+i+"";
      
      Statement st ;
        try {
            st =n.createStatement();
            ResultSet rs = st.executeQuery(sqll);
            while(rs.next()){
              SS.setText(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MOSTRAR.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
        
        

    
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        SS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID_EMPLEADO");

        money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyActionPerformed(evt);
            }
        });
        money.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                moneyKeyTyped(evt);
            }
        });

        jLabel2.setText("SALARIO ");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SS.setText("$$$$$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1))
                            .addComponent(SS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SS))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(money.getText().length()==0){
           
           JOptionPane.showMessageDialog(null,"FABOR DE INGRESAR ID");
       } 
       else{
        analizar();
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void moneyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_moneyKeyTyped
     char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_moneyKeyTyped

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
            java.util.logging.Logger.getLogger(SALARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField money;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
