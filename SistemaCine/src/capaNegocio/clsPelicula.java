package capaNegocio;

import capaDatos.clsJDBC;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class clsPelicula {

    private clsJDBC conectar;

    public clsPelicula() {
        conectar = new clsJDBC();
    }

    
}
