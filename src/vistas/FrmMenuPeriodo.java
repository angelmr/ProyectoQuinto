/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesodatos.Global;
import entidades.Periodo;
import funciones.FPeriodo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class FrmMenuPeriodo extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPeriodo
     */
    public FrmMenuPeriodo() {
        initComponents();
    }

    private void limpiarControles() {
        txtCodigo.setText("");
        txtNombre.setText("");
        spfecha_inicio.setDate(null);
        spfecha_fin.setDate(null);
        txtTipo.setText("");
        txtObservaciones.setText("");
        txtCodigo_sicoa.setText("");
        txtEstado.setText("");
    }
  private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static java.sql.Timestamp FechaDadoString(String fecha) {
        //java.util.Date utilDate = new java.util.Date(fecha); //fecha actual
        long lnMilisegundos = 0;
        try {
            java.util.Date date = sdf.parse(fecha);
            lnMilisegundos = date.getTime();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
        return sqlTimestamp;
        //long lnMilisegundos = utilDate.getTime();
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtCodigoBuscar = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        lblDatosCurso = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        txtObservaciones = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        lblCodigo_sicoa = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblBuscador = new javax.swing.JLabel();
        txtCodigo_sicoa = new javax.swing.JTextField();
        lblFecha_fin = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblFecha_inicio = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaListarPeriodos = new javax.swing.JTable();
        spfecha_inicio = new com.toedter.calendar.JDateChooser();
        spfecha_fin = new com.toedter.calendar.JDateChooser();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDatosCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDatosCurso.setText("Informacion sobre el periodo");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código:");

        lblObservaciones.setText("Observaciones:");

        txtCodigo.setEnabled(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblCodigo_sicoa.setText("Codigo sicoa:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblBuscador.setText("Código a buscar:");

        lblFecha_fin.setText("Fecha fin:");

        lblTipo.setText("Tipo:");

        lblFecha_inicio.setText("Fecha inicio:");

        TablaListarPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Fecha inicio", "Fecha fin", "Tipo", "Observaciones", "Codigo sicoa", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TablaListarPeriodos);

        spfecha_inicio.setDateFormatString("yyyy-MM-dd");

        spfecha_fin.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblObservaciones)
                                .addComponent(lblCodigo_sicoa)
                                .addComponent(lblEstado))
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo_sicoa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtObservaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFecha_inicio)
                                    .addComponent(lblFecha_fin)
                                    .addComponent(lblTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(spfecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spfecha_fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(44, 44, 44)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBuscador)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar))
                        .addComponent(lblDatosCurso))
                    .addContainerGap(760, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha_inicio)
                    .addComponent(spfecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha_fin)
                    .addComponent(spfecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObservaciones)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo_sicoa)
                    .addComponent(txtCodigo_sicoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnListar)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscador)
                        .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addGap(18, 18, 18)
                    .addComponent(lblDatosCurso)
                    .addContainerGap(753, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TablaListarPeriodos.getModel();
        ArrayList<Periodo> lista = new ArrayList<>();
        try {
            FPeriodo fperiodo = new FPeriodo();
            lista = fperiodo.ObtenerPeriodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        for (Periodo p : lista) {
            modelo.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getFecha_inicio(),
                p.getFecha_fin(), p.getTipo(), p.getObservaciones(), p.getCodigo_sicoa(), p.getEstado()});
        }

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().compareTo("Nuevo") == 0) {
            limpiarControles();
            btnNuevo.setText("Registrar");
        } else {
            if (btnNuevo.getText().compareTo("Registrar") == 0) {
                try {
                    Periodo periodo = new Periodo();
                    FPeriodo fperiodo = new FPeriodo();
                    periodo.setNombre(txtNombre.getText());
                    try {
                        periodo.setFecha_inicio(FrmMenuPeriodo.FechaDadoString(sdf.format(spfecha_inicio.getDate())));
                        periodo.setFecha_fin(FrmMenuPeriodo.FechaDadoString(sdf.format(spfecha_fin.getDate())));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Error en la fecha!!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    periodo.setTipo(Integer.parseInt(txtTipo.getText()));
                    periodo.setObservaciones(txtObservaciones.getText());
                    periodo.setCodigo_sicoa(Integer.parseInt(txtCodigo_sicoa.getText()));
                    periodo.setEstado(Integer.parseInt(txtEstado.getText()));
                    if (fperiodo.Insertar(periodo)) {
                        limpiarControles();
                        JOptionPane.showMessageDialog(this, "Registrado correctamente!!",
                                "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                        btnNuevo.setText("Nuevo");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error desconocido: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnNuevoActionPerformed


    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FPeriodo fperiodo = new FPeriodo();
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Quiere modificar el periodo?", "Confirme",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                periodo.setCodigo(Integer.parseInt(txtCodigo.getText()));
                periodo.setNombre(txtNombre.getText());
                try {
                    periodo.setFecha_inicio(FrmMenuPeriodo.FechaDadoString(sdf.format(spfecha_inicio.getDate())));
                    periodo.setFecha_fin(FrmMenuPeriodo.FechaDadoString(sdf.format(spfecha_fin.getDate())));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error en la fecha!!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                periodo.setTipo(Integer.parseInt(txtTipo.getText()));
                periodo.setObservaciones(txtObservaciones.getText());
                periodo.setCodigo_sicoa(Integer.parseInt(txtCodigo_sicoa.getText()));
                periodo.setEstado(Integer.parseInt(txtEstado.getText()));
                if (fperiodo.actualizar(periodo)) {
                    JOptionPane.showMessageDialog(this, "Periodo modificado correctamente!!",
                            "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error desconocido: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        FPeriodo fperiodo = new FPeriodo();
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Quiere eliminar el periodo?", "Confirme",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (fperiodo.eliminar(periodo)) {
                    JOptionPane.showMessageDialog(this,
                            "Periodo eliminado correctamente!!",
                            "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                    limpiarControles();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el periodo!!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        FPeriodo fperiodo = new FPeriodo();
        try {
            limpiarControles();
            periodo = fperiodo.ObtenerPeriodoDadoCodigo(
                    Integer.parseInt(txtCodigoBuscar.getText()));
            if (periodo != null) {
                txtCodigo.setText(Integer.toString(periodo.getCodigo()));
                txtNombre.setText(periodo.getNombre());
                spfecha_inicio.setDate(periodo.getFecha_inicio());
                spfecha_fin.setDate(periodo.getFecha_fin());
                txtTipo.setText(Integer.toString(periodo.getTipo()));
                txtObservaciones.setText(periodo.getObservaciones());
                txtCodigo_sicoa.setText(Integer.toString(periodo.getCodigo_sicoa()));
                txtEstado.setText(Integer.toString(periodo.getEstado()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el periodo!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPeriodo().setVisible(true);
            }
        });
    }
    Periodo periodo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListarPeriodos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblBuscador;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo_sicoa;
    private javax.swing.JLabel lblDatosCurso;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha_fin;
    private javax.swing.JLabel lblFecha_inicio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblTipo;
    private com.toedter.calendar.JDateChooser spfecha_fin;
    private com.toedter.calendar.JDateChooser spfecha_inicio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtCodigo_sicoa;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

}