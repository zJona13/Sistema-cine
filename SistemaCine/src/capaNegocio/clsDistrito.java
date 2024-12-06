package capaNegocio;

import capaDatos.clsJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * INTEGRANTES: - Ching Ayacila, Jonatan - Chapoñan Paico, Jesus - Pupuche
 * Adrianzen, Rodrigho
 *
 */
public class clsDistrito {
    private clsJDBC conectar;

    public clsDistrito() {
        conectar = new clsJDBC();
    }

    // Método para obtener distritos según la provincia seleccionada
    public ResultSet obtenerDistritosPorProvincia(int idProvincia) throws Exception {
        conectar.conectar();
        String sql = "SELECT idDistrito, nombre FROM DISTRITO WHERE idProvincia = " + idProvincia;
        Statement st = conectar.con.createStatement();
        return st.executeQuery(sql);
    }
}