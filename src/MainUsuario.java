public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");

        System.out.println("Usuario: " + u.getNombreUsuario());
        u.cambiarPassword("hola"); // Invalida

        System.out.println("Login OK? " + u.verificarPassword("clave1234"));
        System.out.println("Login mal? " + u.verificarPassword("otra"));

        u.cambiarPassword("nuevaClave9");
        System.out.println("Login nuevo? " + u.verificarPassword("nuevaClave9"));

        // ===== Prueba del reto: 3 intentos fallidos =====
        System.out.println("\n--- Simulando 3 intentos fallidos ---");
        u.verificarPassword("mala1");
        u.verificarPassword("mala2");
        u.verificarPassword("mala3"); // Al tercer fallo, la cuenta se bloquea

        System.out.println("Cuenta bloqueada? " + (u.isBloqueado() ? "Si" : "No"));
        System.out.println("Login con clave correcta tras bloqueo? "
                + u.verificarPassword("nuevaClave9")); // Debe seguir dando false
    }
}
