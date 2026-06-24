package principal;

import dao.UsuarioDAO;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        dao.listar();
    }
}