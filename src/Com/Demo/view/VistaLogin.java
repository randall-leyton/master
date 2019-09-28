/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.view;

import Com.Demo.controller.ControllerLogin;
import Com.Demo.modelo.ModeloUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author r_ley
 */
public class VistaLogin extends javax.swing.JFrame {

    ControllerLogin cLogin;
    /**
     * Creates new form VistaLogin
     */
    public VistaLogin() {
        initComponents();
        cLogin=new ControllerLogin();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBtnLogIn = new javax.swing.JButton();
        jBtnLogUps = new javax.swing.JButton();
        jBtnRecuperarClave = new javax.swing.JButton();
        jPwrdClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USUARIO:");

        jLabel2.setText("CLAVE:");

        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Demo Login");

        jBtnLogIn.setText("Log In");
        jBtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogInActionPerformed(evt);
            }
        });

        jBtnLogUps.setText("Log Up");
        jBtnLogUps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogUpsActionPerformed(evt);
            }
        });

        jBtnRecuperarClave.setText("Recuperar Clave");
        jBtnRecuperarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecuperarClaveActionPerformed(evt);
            }
        });

        jPwrdClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwrdClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnLogIn)
                            .addComponent(jLabel2))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnLogUps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jBtnRecuperarClave))
                            .addComponent(jPwrdClave))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPwrdClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLogIn)
                    .addComponent(jBtnLogUps)
                    .addComponent(jBtnRecuperarClave))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jBtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogInActionPerformed
        // TODO add your handling code here:
        String usuario, clave;
        usuario= this.jtxtUsuario.getText();
        clave= this.jPwrdClave.getText();
        boolean band;
        band= this.cLogin.LogIn(usuario, clave);
        if(band){
            //login correcto
            JOptionPane.showMessageDialog(this, "login correrto");
            
        }else{
            //login incorrecto
            JOptionPane.showMessageDialog(this, "login incorrecto ");
        }
    }//GEN-LAST:event_jBtnLogInActionPerformed

    private void jBtnLogUpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogUpsActionPerformed
        // TODO add your handling code here:
        RegistrarUsuario a=new RegistrarUsuario();
        a.setVisible(true);
        
    }//GEN-LAST:event_jBtnLogUpsActionPerformed

    private void jBtnRecuperarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecuperarClaveActionPerformed
        // TODO add your handling code here:
        VistaRecuperarContraseña a= new VistaRecuperarContraseña();
        a.setVisible(true);
        
    }//GEN-LAST:event_jBtnRecuperarClaveActionPerformed

    private void jPwrdClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwrdClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwrdClaveActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogIn;
    private javax.swing.JButton jBtnLogUps;
    private javax.swing.JButton jBtnRecuperarClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPwrdClave;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
