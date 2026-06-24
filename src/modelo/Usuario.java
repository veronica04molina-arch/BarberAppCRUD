package modelo;

public class Usuario {

    private String nombre;
    private String email;
    private String password;
    private String rol;
    private String telefono;

    public Usuario(String nombre, String email, String password, String rol,
                String telefono) {

        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }

    public String getTelefono() {
        return telefono;
    }
}