/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.istack.internal.FragmentContentHandler;

/**
 *
 * @author Personal
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLlamarPeriodo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnLlamarRol = new javax.swing.JButton();
        brnLlamarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLlamarPeriodo.setBackground(new java.awt.Color(0, 102, 153));
        btnLlamarPeriodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLlamarPeriodo.setForeground(new java.awt.Color(0, 102, 153));
        btnLlamarPeriodo.setText("PERIODO");
        btnLlamarPeriodo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLlamarPeriodo.setBorderPainted(false);
        btnLlamarPeriodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLlamarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarPeriodoActionPerformed(evt);
            }
        });
        jPanel1.add(btnLlamarPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setText("Iniciar Sesion");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 100, 30));

        btnLlamarRol.setBackground(new java.awt.Color(0, 102, 153));
        btnLlamarRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLlamarRol.setForeground(new java.awt.Color(0, 102, 153));
        btnLlamarRol.setText("ROL");
        btnLlamarRol.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLlamarRol.setBorderPainted(false);
        btnLlamarRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLlamarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarRolActionPerformed(evt);
            }
        });
        jPanel1.add(btnLlamarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 100, 30));

        brnLlamarUsuario.setBackground(new java.awt.Color(0, 102, 153));
        brnLlamarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brnLlamarUsuario.setForeground(new java.awt.Color(0, 102, 153));
        brnLlamarUsuario.setText("USUARIO");
        brnLlamarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        brnLlamarUsuario.setBorderPainted(false);
        brnLlamarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnLlamarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnLlamarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(brnLlamarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/img/siget-031_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 710, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/img/FIN.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlamarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarPeriodoActionPerformed
        FrmMenuPeriodo mp = new FrmMenuPeriodo();
        mp.setVisible(true);
    }//GEN-LAST:event_btnLlamarPeriodoActionPerformed

    private void brnLlamarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnLlamarUsuarioActionPerformed
        FrmMenuUsuario mu = new FrmMenuUsuario();
        mu.setVisible(true);
    }//GEN-LAST:event_brnLlamarUsuarioActionPerformed

    private void btnLlamarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarRolActionPerformed
        FrmMenuRol mr = new FrmMenuRol();
        mr.setVisible(true);
    }//GEN-LAST:event_btnLlamarRolActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnLlamarUsuario;
    private javax.swing.JButton btnLlamarPeriodo;
    private javax.swing.JButton btnLlamarRol;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
