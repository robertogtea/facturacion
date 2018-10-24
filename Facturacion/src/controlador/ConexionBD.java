

package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;





public class ConexionBD {
    
    Connection con = null;
   
    public ConexionBD()
    {
        
    }
    public void realizarConexion()
    {
        try {
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/facturacion";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexión Realizada");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } 
    }

    public boolean registrarProducto()
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("INSERT INTO `productos`(`id`, `nombre`) VALUES (1,'Coca Cola')"); 
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
    }
    
   
    
    public boolean modificarProducto()
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                //ejecuto = cmd.execute("UPDATE `productos` SET `codigo`='"+producto.getCodigo()+"',`nombre`='"+producto.getNombre()+"',`descripcion`='"+producto.getDescripcion()+"',`precioCompra`="+producto.getPrecioCompra()+",`precioVenta`="+producto.getPrecioVenta()+",`cantidad`="+producto.getCantidad()+" WHERE codigo='"+producto.getCodigo()+"'"); 
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
    }
    public boolean eliminarProducto(String codigo)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean ejecuto;
        try {
                cmd = con.createStatement();
                ejecuto = cmd.execute("DELETE from productos where codigo='"+codigo+"'"); 
               return true;
               // rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
            return false;
        }
    }
    public boolean buscarProducto(String codigo)
    {
        ResultSet rs = null;
        Statement cmd = null;
        boolean encontrado=false;
        try {
                cmd = con.createStatement();
                rs = cmd.executeQuery("SELECT * FROM productos");
                while (rs.next()) 
                {
                    String codigoConsultado = rs.getString("codigo");
                    if(codigoConsultado.equals(codigo))
                    {
                        encontrado=true;
                        //productoTemporal=new Producto(codigo,rs.getString("nombre"),rs.getString("descripcion"),rs.getDouble("precioCompra"),rs.getDouble("precioVenta"),rs.getInt("cantidad"));
                    } 
                }
                rs.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
        }
        return encontrado;
    }
    
//    public ArrayList<Producto> devolverProductos()
//    {
//        ArrayList<Producto> productos;
//        ResultSet rs = null;
//        Statement cmd = null;
//        boolean encontrado=false;
//        productos=new ArrayList<Producto>();
//        try {
//                
//                cmd = con.createStatement();
//                rs = cmd.executeQuery("SELECT * FROM productos");  
//                while (rs.next()) 
//                {
//                    productos.add(new Producto(rs.getString("codigo"),rs.getString("nombre"),rs.getString("descripcion"),rs.getDouble("precioCompra"),rs.getDouble("precioVenta"),rs.getInt("cantidad")));   
//                }
//                rs.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println("SQLException ejecutando sentencia: " + e.getMessage());
//        }
//        return productos;
//    }
//
//    public Producto getProductoTemporal() {
//        return productoTemporal;
//    }
//
//    public void setProductoTemporal(Producto productoTemporal) {
//        this.productoTemporal = productoTemporal;
//    }
    
   
    
}
