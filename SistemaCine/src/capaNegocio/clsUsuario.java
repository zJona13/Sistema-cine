package capaNegocio;

import capaDatos.clsJDBC;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * INTEGRANTES: - Ching Ayacila, Jonatan - Chapoñan Paico, Jesus - Pupuche
 * Adrianzen, Rodrigho
 *
 */
public class clsUsuario {

    private clsJDBC conectar;

    public clsUsuario() {
        conectar = new clsJDBC();
    }

    // Método para autenticar usuario
    public String autenticarUsuario(String email, String password) throws Exception {
        String tipoUsuario = null;
        try {
            conectar.conectar();
            String query = "SELECT tu.nombre FROM USUARIO u INNER JOIN TIPO_USUARIO tu ON u.idTipoUsuario = tu.idTipoUsuario WHERE u.email = ? AND u.contraseña = ?";
            PreparedStatement ps = conectar.con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoUsuario = rs.getString("nombre");
            }
            rs.close();
            ps.close();
            conectar.desconectar();
        } catch (Exception ex) {
            throw new Exception("Error al autenticar usuario: " + ex.getMessage());
        }
        return tipoUsuario;
    }

    // ID incremental
    public int obtenerSiguienteIdUsuario() throws Exception {
        int id = 0;
        try {
            conectar.conectar(); // Asegúrate de que se abra la conexión
            String query = "SELECT COALESCE(MAX(idUsuario), 0) + 1 AS siguienteId FROM USUARIO";
            Statement st = conectar.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                id = rs.getInt("siguienteId");
            }
            rs.close();
            st.close(); // Cierra el statement, pero NO cierres la conexión aquí
        } catch (Exception ex) {
            throw new Exception("Error al obtener el siguiente ID de usuario: " + ex.getMessage());
        }
        return id;
    }

    // Método para registrar un usuario
    public void registrarUsuario(String nombre, String apellidos, String email, String celular, String contraseña,
            String tipoDocIdentidad, String nroDocIdentidad, int idDistrito, String sexo,
            Date fechaNac) throws Exception {
        PreparedStatement ps = null;
        try {
            conectar.conectar();  // Asegúrate de conectar antes de todo

            // Obtener el siguiente ID de usuario
            int idUsuario = obtenerSiguienteIdUsuario();

            // Valores por defecto para tipo de socio y tipo de usuario
            int idTipoSocio = 1;  // Supongo que "Clásico" tiene el ID 1
            int idTipoUsuario = 2; // Supongo que "Cliente" tiene el ID 2

            // Query para insertar el nuevo usuario con el idUsuario
            String query = "INSERT INTO USUARIO (idUsuario, nombre, apellidos, email, celular, contraseña, tipoDocIdentidad, nroDocIdentidad, "
                    + "idDistrito, sexo, fechaNac, idTipoSocio, idTipoUsuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            ps = conectar.con.prepareStatement(query);

            // Establecer los valores para la consulta
            ps.setInt(1, idUsuario);  // Usar el idUsuario generado
            ps.setString(2, nombre);
            ps.setString(3, apellidos);
            ps.setString(4, email);
            ps.setString(5, celular);
            ps.setString(6, contraseña);
            ps.setString(7, tipoDocIdentidad);
            ps.setString(8, nroDocIdentidad);
            ps.setInt(9, idDistrito);
            ps.setString(10, sexo);
            ps.setDate(11, new java.sql.Date(fechaNac.getTime())); // Convertir java.util.Date a java.sql.Date
            ps.setInt(12, idTipoSocio); // Valor por defecto: Clásico
            ps.setInt(13, idTipoUsuario); // Valor por defecto: Cliente

            ps.executeUpdate();  // Ejecutar la inserción
        } catch (Exception ex) {
            throw new Exception("Error al registrar usuario: " + ex.getMessage());
        } finally {
            if (ps != null) {
                ps.close();  // Cerrar el PreparedStatement
            }
            conectar.desconectar();  // Desconectar después de que se inserte el usuario
        }
    }
}
