public class Usuario {

    private int id;
    private String username;
    private String correo;
    private boolean activo;

    private static int contadorUsuarios = 0;

    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
        activo = true;

        contadorUsuarios++;
        id = contadorUsuarios;
    }

    public static int getContadorUsuarios() {return contadorUsuarios;}
}
