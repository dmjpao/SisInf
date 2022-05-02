package vista;

import Metodos_sql.Metodos_sql;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author doria
 */
public class framePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form framePrincipal
     */
    public framePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setVisible(true);
    }
        Metodos_sql metodos = new Metodos_sql();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonRegistrarEmpleado = new javax.swing.JButton();
        botonRegistrarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        textRENombre = new javax.swing.JTextField();
        textREPassword = new javax.swing.JPasswordField();
        labelNombre = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonCancelarRegistro = new javax.swing.JButton();
        secondPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ventanaPrincipal"); // NOI18N
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        botonRegistrarEmpleado.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        botonRegistrarEmpleado.setText("Registrar Empleado");
        botonRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEmpleadoActionPerformed(evt);
            }
        });

        botonRegistrarProducto.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        botonRegistrarProducto.setText("Registrar Producto");
        botonRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(botonRegistrarEmpleado)
                .addGap(46, 46, 46)
                .addComponent(botonRegistrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 190, 376);

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 255));
        panelPrincipal.setLayout(new java.awt.CardLayout());

        textRENombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRENombreActionPerformed(evt);
            }
        });

        textREPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textREPasswordActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");

        labelPassword.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        labelPassword.setText("Contraseña");

        botonRegistrar.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonCancelarRegistro.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        botonCancelarRegistro.setText("Cancelar");
        botonCancelarRegistro.setMaximumSize(new java.awt.Dimension(109, 24));
        botonCancelarRegistro.setMinimumSize(new java.awt.Dimension(109, 24));
        botonCancelarRegistro.setPreferredSize(new java.awt.Dimension(109, 24));
        botonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textREPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(textRENombre))))
                .addGap(54, 54, 54))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRENombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textREPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrar))
                .addGap(73, 73, 73))
        );

        panelPrincipal.add(firstPanel, "card2");

        jLabel2.setText("test 2");

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        panelPrincipal.add(secondPanel, "card3");

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(190, 0, 390, 380);

        setBounds(0, 0, 588, 383);
    }// </editor-fold>//GEN-END:initComponents
    
    //Rol 1 Encargado Almacenes => Accede a Registrar Productos
    public void initAlmacenes(){
        panelPrincipal.removeAll();
        botonRegistrarEmpleado.setVisible(false);
        panelPrincipal.add(secondPanel);        
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }
    //Rol 2 Recursos Humanos => Accede a Registrar Productos
    public void initRecursosHumanos(){
        panelPrincipal.removeAll();
        botonRegistrarEmpleado.setVisible(false);
        panelPrincipal.add(secondPanel);        
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }
    //Rol 3 Administrador => Accede a Registrar Empleados
    public void initAdministrador(){
        panelPrincipal.removeAll();
        botonRegistrarProducto.setVisible(false);
        panelPrincipal.add(firstPanel);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }
    
    //Rol 4 Cajero => Accede a Registrar productos / Ventas
    public void initCajero(){
    panelPrincipal.removeAll();
        botonRegistrarProducto.setVisible(false);
        panelPrincipal.add(firstPanel);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }
    
    
    private void botonRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarProductoActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.add(secondPanel);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }//GEN-LAST:event_botonRegistrarProductoActionPerformed

    private void botonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEmpleadoActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.add(firstPanel);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();
    }//GEN-LAST:event_botonRegistrarEmpleadoActionPerformed

    private void textRENombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRENombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRENombreActionPerformed

    private void textREPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textREPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textREPasswordActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        String nombre = textRENombre.getText();
        String pass   = new String(textREPassword.getPassword());
        try {
           int i = metodos.guardar(nombre,pass);
           textRENombre.setText("");
           textREPassword.setText("");
           if(i > 0){
               JOptionPane.showMessageDialog(this, "Datos registrados correctamente!");
           } else {
               JOptionPane.showMessageDialog(this, "Error no se pudo realizar el registro!");
           }
        } catch (SQLException ex) {
            Logger.getLogger(framePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarRegistroActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCancelarRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new framePrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarRegistro;
    private javax.swing.JButton botonRegistrar;
    public javax.swing.JButton botonRegistrarEmpleado;
    public javax.swing.JButton botonRegistrarProducto;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPassword;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JPanel secondPanel;
    private javax.swing.JTextField textRENombre;
    private javax.swing.JPasswordField textREPassword;
    // End of variables declaration//GEN-END:variables
}
