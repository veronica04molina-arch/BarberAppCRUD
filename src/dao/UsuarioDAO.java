package dao;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;

public class UsuarioDAO {

public void insertar(Usuario usuario) {

        String sql =
        "INSERT INTO usuario " +
        "(nombre,email,password,rol,telefono,fecharegistro) " +
        "VALUES (?,?,?,?,?,CURRENT_DATE)";

        try {

        Connection con = ConexionBD.conectar();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, usuario.getNombre());
        ps.setString(2, usuario.getEmail());
        ps.setString(3, usuario.getPassword());
        ps.setString(4, usuario.getRol());
        ps.setString(5, usuario.getTelefono());

        ps.executeUpdate();

        System.out.println(
                "Usuario registrado correctamente"
        );

        } catch (Exception e) {

        System.out.println(
                "Error: " + e.getMessage()
        );
        }
}

public void listar() {

    String sql = "SELECT * FROM usuario";

    try {

        Connection con = ConexionBD.conectar();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println(
                "ID: " + rs.getInt("id") +
                " | Nombre: " + rs.getString("nombre") +
                " | Email: " + rs.getString("email")
            );
        }

    } catch (Exception e) {

        System.out.println(
            "Error: " + e.getMessage()
        );
    }
}

public void actualizar(int id, String telefono) {

    String sql =
            "UPDATE usuario " +
            "SET telefono=? " +
            "WHERE id=?";

    try {

        Connection con = ConexionBD.conectar();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, telefono);
        ps.setInt(2, id);

        ps.executeUpdate();

        System.out.println(
                "Usuario actualizado correctamente"
        );

    } catch (Exception e) {

        System.out.println(
                "Error: " + e.getMessage()
        );
    }
}

public void eliminar(int id){
        
    String sql =
            "DELETE FROM usuario " +
            "WHERE id=?";

    try {

        Connection con = ConexionBD.conectar();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println(
                "Usuario eliminado correctamente"
        );

    } catch (Exception e) {

        System.out.println(
                "Error: " + e.getMessage()
        );
    }
}
}