/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Producto;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class InterfazRegistrarNuevoProducto extends javax.swing.JFrame {

    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;
  //  static String cadenaDriver ="org.postgresql.Driver";    
    static Producto objProduct;
    Conexion con = new Conexion();
    public InterfazRegistrarNuevoProducto() {
        initComponents();
        try {
            conexion=con.ConectarDB();           
        } catch (Exception e) {
            
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

        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        padre = new javax.swing.JPanel();
        jPanelRegistrarNuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTextFieldNombre = new javax.swing.JTextField();
        JTextFieldTipoProducto = new javax.swing.JTextField();
        JTextFieldPrecio = new javax.swing.JTextField();
        JTextFieldCantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanelEliminar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jButton2.setText("registrar nuevo producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("eliminar producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(22, 22, 22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jButton2)
                .addGap(76, 76, 76)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        padre.setLayout(new java.awt.CardLayout());

        jPanelRegistrarNuevo.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setText("tipo de producto");

        jLabel4.setText("precio");

        jLabel5.setText("cantidad");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistrarNuevoLayout = new javax.swing.GroupLayout(jPanelRegistrarNuevo);
        jPanelRegistrarNuevo.setLayout(jPanelRegistrarNuevoLayout);
        jPanelRegistrarNuevoLayout.setHorizontalGroup(
            jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarNuevoLayout.createSequentialGroup()
                .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegistrarNuevoLayout.createSequentialGroup()
                        .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarNuevoLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(113, 113, 113)
                        .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(JTextFieldTipoProducto)
                            .addComponent(JTextFieldPrecio)
                            .addComponent(JTextFieldCantidad)))
                    .addGroup(jPanelRegistrarNuevoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(55, 55, 55))
        );
        jPanelRegistrarNuevoLayout.setVerticalGroup(
            jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarNuevoLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextFieldTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        padre.add(jPanelRegistrarNuevo, "card2");

        javax.swing.GroupLayout jPanelEliminarLayout = new javax.swing.GroupLayout(jPanelEliminar);
        jPanelEliminar.setLayout(jPanelEliminarLayout);
        jPanelEliminarLayout.setHorizontalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        jPanelEliminarLayout.setVerticalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        padre.add(jPanelEliminar, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(padre, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(padre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Producto product;
        boolean flag=true;
        objProduct=new Producto();
        //objProduct.codigo=Integer.parseInt(JTextFieldIdProducto.getText());        
        
        try {
            sentencia=conexion.createStatement();
            //resultado=sentencia.executeQuery(consultaSQL);
            /*while(resultado.next()){
                product=new Producto();
                product.codigo=resultado.getInt("idproducto");
                if (objProduct.codigo==product.codigo){
                    flag=false;
                    break;
                }
            }*/
            
            //if(flag){
                //objProduct.codigo=Integer.parseInt(idp.getText());
                objProduct.nombre=JTextFieldNombre.getText();
                objProduct.tipoProducto=Integer.parseInt(JTextFieldTipoProducto.getText());
                objProduct.precio=Integer.parseInt(JTextFieldPrecio.getText());
                objProduct.cantidad=Integer.parseInt(JTextFieldCantidad.getText());
                //objProduct.precio=Integer.parseInt(jTextFieldPrecio.getText());
                //objProduct.cantidad=Integer.parseInt(jTextFieldCantidad.getText());

                String sentenciaSQL = new String();
                int lastIdProducto=0;
                sentenciaSQL="INSERT INTO producto(nombre,tipoproducto_idtipoproducto)";
                sentenciaSQL= sentenciaSQL+"VALUES('"+objProduct.nombre+"', "+objProduct.tipoProducto+")RETURNING idproducto";
                sentencia.execute(sentenciaSQL);
                ResultSet rs = sentencia.executeQuery("select lastval()");
                if (rs.next()) {
                lastIdProducto= rs.getInt(1);
                }                
                String sentenciaSQL1 = new String();
                sentenciaSQL1="INSERT INTO precio(idprecio,producto_idproducto)";
                sentenciaSQL1= sentenciaSQL1+"VALUES("+objProduct.precio+", "+lastIdProducto+")";
                sentencia.execute(sentenciaSQL1);
                String sentenciaSQL2 = new String();
                sentenciaSQL2="INSERT INTO cantidadpoducto(idcantidadpoducto,producto_idproducto)";
                sentenciaSQL2= sentenciaSQL2+"VALUES("+objProduct.cantidad+", "+lastIdProducto+")";
                sentencia.execute(sentenciaSQL2);
                JOptionPane.showMessageDialog(this, "Guardado con exito");            
           /* }else{
                JOptionPane.showMessageDialog(this, "codigo duplicado");
            } */
        } catch (SQLException e) {
            Logger.getLogger(InterfazRegistrarNuevoProducto.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        padre.removeAll();
       padre.add(jPanelEliminar);
       padre.repaint();
       padre.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       padre.removeAll();
       padre.add(jPanelRegistrarNuevo);
       padre.repaint();
       padre.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarNuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldCantidad;
    private javax.swing.JTextField JTextFieldNombre;
    private javax.swing.JTextField JTextFieldPrecio;
    private javax.swing.JTextField JTextFieldTipoProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelEliminar;
    private javax.swing.JPanel jPanelRegistrarNuevo;
    private javax.swing.JPanel padre;
    // End of variables declaration//GEN-END:variables
}
