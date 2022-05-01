/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conexion;

//import static Ventanas.Login.nombree;
//import static Ventanas.Login.pass;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Delgadillo
 */
public class Inventarios extends javax.swing.JFrame {

    /**
     * Creates new form Inventarios
     */
    public Inventarios() {
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

        btndesconectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        recibirnombre = new javax.swing.JTextField();
        recibirpass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndesconectar.setBackground(new java.awt.Color(153, 153, 153));
        btndesconectar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btndesconectar.setForeground(new java.awt.Color(51, 0, 51));
        btndesconectar.setText("Salir");
        btndesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesconectarActionPerformed(evt);
            }
        });
        getContentPane().add(btndesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 120, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Codigo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Productos Registrados:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 380, 40));

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText(" ");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 220, 40));

        codigo.setBackground(new java.awt.Color(204, 204, 204));
        codigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        codigo.setForeground(new java.awt.Color(0, 0, 0));
        codigo.setText(" ");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 40));

        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jButton3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Presentar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, 40));

        limpiar.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(153, 153, 153));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IDProducto", "TipoProducto", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 410, 140));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 40));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tipo Producto");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, 40));

        tp.setBackground(new java.awt.Color(204, 204, 204));
        tp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tp.setForeground(new java.awt.Color(0, 0, 0));
        tp.setText(" ");
        tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpActionPerformed(evt);
            }
        });
        getContentPane().add(tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 160, 40));

        jButton5.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adasdasd.jpg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 630));

        recibirnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibirnombreActionPerformed(evt);
            }
        });
        getContentPane().add(recibirnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
        getContentPane().add(recibirpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btndesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesconectarActionPerformed
  dispose();
    }//GEN-LAST:event_btndesconectarActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
presentar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     modificar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   eliminar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
     limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void recibirnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibirnombreActionPerformed
       
    }//GEN-LAST:event_recibirnombreActionPerformed

    
 public Connection conectarDB(){

     //Statement  at = null;
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+db;
    
        try {
            Class.forName("org.postgresql.Driver");
            Conexion = DriverManager.getConnection(cadena,"postgres","Delgadillo");
          // JOptionPane.showMessageDialog(null, "Se conecto");
        Validar();
            
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar"+e.toString());
       }   
       
      
           // nombree.setText("");
          // pass.setText("") ;
        return Conexion;
    }
   public void Validar(){
            
        Statement  at = null;
         String usuario = Login.nombree.getText();
        String contrasena = Login.pass.getText();
        
         try {
             at = Conexion.createStatement();
            ResultSet rs = at.executeQuery("select verificarusuario('"+usuario+"','"+contrasena+"');");
            while (rs.next()){
                String validador;
               validador= rs.getString("verificarusuario");
               
                if (validador.equals("true")) {
                    
                   // JOptionPane.showMessageDialog(null, "Se conecto correctamente");
                     PID();
                }
                else{
                    //JOptionPane.showMessageDialog(null, "Error al conectar,Usuario o Contrasena incorrectos");
                    
                }
            }
          
            rs.close();
            at.close();
        } catch (Exception e) {
             // JOptionPane.showMessageDialog(null, "Error al conectar,Usuario o Contrasena incorrectos"+e.toString());
        }                                        
        
    
    }
    
    
        public void PID(){
        Statement  at = null;        
         try {
             at = Conexion.createStatement();
            ResultSet rs = at.executeQuery("select pg_backend_pid();");
            while (rs.next()){
                String piddd;
                piddd= rs.getString("pg_backend_pid");
                //System.out.println(pidd);
             
           
            }
        
            rs.close();
            at.close();
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
        }                                        
        
    
    }  
 
 
 
 
 
 
 
    
       public void guardar(){
        Statement  at = null;        
         try {
             at =Conexion.createStatement();
            ResultSet rs = at.executeQuery("insert into producto(tipoproducto_idtipoproducto, nombre)"
                 + "values( '"  + tp.getText() + "','"  + nombre.getText() + "')"
);
        
            rs.close();
            at.close();
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
        }                                        
        
    presentar();
    }  
    
   
    
   void modificar(){
          Statement  at = null;  
                     if (!validarNumeros( codigo.getText().trim()))  {
                JOptionPane.showMessageDialog(rootPane, "Valores incorrectos");
            }
            else
            {
                        if (!validarNumeros( tp.getText().trim()))  {
                       JOptionPane.showMessageDialog(rootPane, "Valores incorrectos");
                   }
                   else
                   {

                                            JOptionPane.showMessageDialog(rootPane, "Valores correctos");
                                                   Connection con = null;
                                                   
                                                            try {
                                                              at =Conexion.createStatement();
                                                            ResultSet rs = at.executeQuery("UPDATE producto set tipoproducto_idtipoproducto=" +tp.getText()+", nombre='"+nombre.getText()+"'" +"where idproducto="+codigo.getText()+";");  
                                                         
                                                            con.close();
                                                            at.close();
                                                            JOptionPane.showMessageDialog(null, "Se a actualizado con exito!!");  
                                                            
                                                            } catch (Exception e) {
                                                                            //JOptionPane.showMessageDialog(null, e);

                                                            }
                                      

                       

                   }
                    
            }
                     presentar();
   } 
   

    
    void presentar(){
        conectarDB();
        
        Statement  at = null;  
      DefaultTableModel modelo = new DefaultTableModel();
  modelo.addColumn("IDProducto");
  modelo.addColumn("TipoProducto");  
  modelo.addColumn("Nombre");
  //modelo.addColumn("Tiempo");
  tabla.setModel(modelo);
  DefaultComboBoxModel combo = new DefaultComboBoxModel();
 String datos[] = new String[3];

        try {
            
            at =Conexion.createStatement();
            ResultSet rs = at.executeQuery("Select * From producto");
            while (rs.next()){
                datos[0]= rs.getString("idproducto");
                datos[1]= rs.getString("tipoproducto_idtipoproducto");
                datos[2]= rs.getString("nombre");
                //datos[3]= rs.getString("tiempo");
                modelo.addRow(datos); 
            }
            //JOptionPane.showMessageDialog(null, "Acepta para continuar");
            rs.close();
            at.close();
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
     void nuevo(){
          Connection con = null;
        Statement  at = null;  
        try {
            at =Conexion.createStatement();
           
            ResultSet rs = at.executeQuery("insert into producto (tipoproducto_idtipoproducto, nombre) values ("+tp.getText()+",'"+nombre.getText()+"')"+"");

      
        con.close();
        at.close();
        JOptionPane.showMessageDialog(null, "Se a eliminado con exito!!");     
        } catch (Exception e) {
                        //JOptionPane.showMessageDialog(null, e);

        }
         presentar();
   }
    
   void eliminar(){
          Connection con = null;
        Statement  at = null;  
        try {
            at =Conexion.createStatement();
           
            ResultSet rs = at.executeQuery("delete from producto where idproducto='"+codigo.getText()+"'");

      
        con.close();
        at.close();
        JOptionPane.showMessageDialog(null, "Se a eliminado con exito!!");     
        } catch (Exception e) {
                        //JOptionPane.showMessageDialog(null, e);

        }
         presentar();
   }
   
   void limpiar(){
    codigo.setText("");
    tp.setText("");
    nombre.setText("");
    
   }
   
    
      public static boolean validarNumeros(String datos){
          return datos.matches( "[0-9]*" );
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
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios().setVisible(true);
            }
        });
      
    }
private boolean validacion = true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndesconectar;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    public static javax.swing.JTextField recibirnombre;
    public static javax.swing.JTextField recibirpass;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tp;
    // End of variables declaration//GEN-END:variables
    String db = "SisInfo2";
    String ip = "localhost";
    String puerto = "5432";
    Connection Conexion = null;
}
