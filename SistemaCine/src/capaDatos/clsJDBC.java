package capaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * INTEGRANTES: 
 * - Ching Ayacila, Jonatan 
 * - Chapoñan Paico, Jesus 
 * - Pupuche Adrianzen, Rodrigho
 *
 */
public class clsJDBC {

    private String driver, url, user, password;
    public Connection con;
    private Statement sent = null;

    // Conexión
    public clsJDBC() {
        this.driver = "org.postgresql.Driver";
        this.url = "jdbc:postgresql://localhost:5432/Cine";
        this.user = "postgres";
        this.password = "123a";
        this.con = null;
    }

    // Conectar
    public void conectar() throws Exception {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new Exception("Error al conectarse a la Base de datos ---> " + ex.getMessage());
        }
    }

    // Desconectar
    public void desconectar() throws Exception {
        try {
            con.close();
        } catch (SQLException ex) {
            throw new Exception("Error al desconectarse de la Base de Datos ---> " + ex.getMessage());
        }
    }
    
    // Ejecutar una consulta
    public ResultSet consultarBD (String strSQL) throws Exception{
        ResultSet rs = null;
        try {
          conectar();
          sent = con.createStatement();
          rs = sent.executeQuery(strSQL);
          return rs;
        } catch(Exception ex){
            throw new Exception("Error al ejecutar consulta: " + ex.getMessage());
        } finally {
            if (con != null){
                desconectar();
            }
        }
    }
}

