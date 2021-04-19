
package GestionProveedor;
import GestionEnsamblador.*;
import GestionEmpleado.*;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
       private final String base = "bxufzxoo6au5els5kkfs";
    private final String user = "umwratiamgibycac";
    private final String password = "a7DBA8jxpjzIE6ATzWJ1";
    private final String url = "jdbc:mysql://bxufzxoo6au5els5kkfs-mysql.services.clever-cloud.com:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }
    
    
}
