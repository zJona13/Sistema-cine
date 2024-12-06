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
public class clsProvincia {
    private clsJDBC conectar;

    public clsProvincia() {
        conectar = new clsJDBC();
    }

    // Método para obtener provincias según el departamento seleccionado
    public ResultSet obtenerProvinciasPorDepartamento(int idDpto) throws Exception {
        conectar.conectar();
        String sql = "SELECT idProvincia, nombre FROM PROVINCIA WHERE idDpto = " + idDpto;
        Statement st = conectar.con.createStatement();
        return st.executeQuery(sql);
    }
}