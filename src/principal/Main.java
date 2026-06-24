package principal;

import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Veronica Molina",
                "veronica@gmail.com",
                "123456",
                "barbero",
                "3001234567"
        );

        UsuarioDAO dao = new UsuarioDAO();

        dao.insertar(usuario);
    }
}