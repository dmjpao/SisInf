public void consultar(String nombre) {
        try {
            Connection conexion = conec.conectar();
            st = conexion.createStatement();
            String sql = "select nombre, marca, precio, cantidad from producto, producto_detalle where nombre='" + nombre + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                prod.setNombre(rs.getString("nombre"));
                prod.setTipoProducto(rs.getString("marca"));
                prod.setCantidad(rs.getInt("cantidad"));
                prod.setPrecio(rs.getFloat("precio"));
                
            } else {
               // prod.setNombre("");
                //prod.setTipoProducto("");
                //prod.setCantidad( );
               // prod.setPrecio();
               JOptionPane.showMessageDialog(null, "no se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en programa " + e, "Erro de sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
