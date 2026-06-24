package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/db_barberapp";

    private static final String USER = "postgres";

    private static final String PASSWORD = "2008";

    public static Connection conectar() {

        try {

            Connection conexion =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println("Conexión exitosa a PostgreSQL");

            return conexion;

        } catch (Exception e) {

            System.out.println("Error de conexión: "
                    + e.getMessage());

            return null;
        }
    }
}
