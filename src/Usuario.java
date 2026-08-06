public class Usuario {
    private String nombreUsuario;
    private String password; // Nunca tendra getter publico
    private int intentosFallidos; // RETO: contador de intentos fallidos
    private boolean bloqueado;    // RETO: bandera de bloqueo

    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        cambiarPassword(passwordInicial);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void cambiarPassword(String nueva) {
        if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contrasena actualizada correctamente.");
        } else {
            System.out.println("Contrasena invalida: min 8 caracteres " +
                    "y al menos un numero.");
        }
    }

    // ===== RETO DE ANDAMIAJE =====
    public boolean verificarPassword(String intento) {
        if (bloqueado) {
            System.out.println("Cuenta bloqueada. Contacte al administrador.");
            return false;
        }

        boolean coincide = this.password != null && this.password.equals(intento);

        if (coincide) {
            intentosFallidos = 0; // reiniciamos el contador si el login es correcto
        } else {
            intentosFallidos++;
            System.out.println("Intento fallido numero " + intentosFallidos);
            if (intentosFallidos >= 3) {
                bloqueado = true;
                System.out.println("Cuenta bloqueada por 3 intentos fallidos.");
            }
        }
        return coincide;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) return false;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}
