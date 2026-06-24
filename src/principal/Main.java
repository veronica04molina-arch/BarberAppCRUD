package principal;

import dao.UsuarioDAO;

public class Main {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        dao.actualizar(
                1,
                "3119876545"
        );
    }
}
