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
public class clsDepartamento {
    private clsJDBC conectar;

    public clsDepartamento() {
        conectar = new clsJDBC();
    }

    // Método para obtener todos los departamentos
    public ResultSet obtenerDepartamentos() throws Exception {
        conectar.conectar();
        String sql = "SELECT idDpto, nombre FROM DEPARTAMENTO";
        Statement st = conectar.con.createStatement();
        return st.executeQuery(sql);
    }
}