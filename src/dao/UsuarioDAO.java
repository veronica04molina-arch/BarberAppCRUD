package dao;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
}