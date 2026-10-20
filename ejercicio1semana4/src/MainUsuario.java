public class MainUsuario {
    public static void main(String[] args) {

        System.out.println("Total de usuarios iniciales:" + Usuario.getContadorUsuarios());

        Usuario usuario1 = new Usuario("Joel", "joelitoxx98@gmail.com");
        Usuario usuario2 = new Usuario("Joel", "joelitoxx98@gmail.com");
        Usuario usuario3 = new Usuario("Joel", "joelitoxx98@gmail.com");

        System.out.println("Total de usuario finales:" + Usuario.getContadorUsuarios());


    }
}
