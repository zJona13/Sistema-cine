package capaNegocio;

import capaDatos.clsJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

public class clsGeneroPelicula {

    private clsJDBC conectar;

    public clsGeneroPelicula() {
        conectar = new clsJDBC();
    }

    // Método para obtener los géneros de películas
    public ResultSet obtenerGeneros() throws Exception {
        conectar.conectar();
        String query = "SELECT idGenero, nombre FROM GENERO_PELICULA";
        Statement st = conectar.con.createStatement();
        return st.executeQuery(query);
    }
}

