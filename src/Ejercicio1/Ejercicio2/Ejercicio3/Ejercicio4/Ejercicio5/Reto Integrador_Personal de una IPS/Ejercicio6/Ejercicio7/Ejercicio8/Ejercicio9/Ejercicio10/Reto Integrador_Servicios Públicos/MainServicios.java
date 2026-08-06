public class MainServicios {
    public static void main(String[] args) {
        Agua agua = new Agua("A-001", "Carlos Barrientos", 15);
        Luz luz = new Luz("L-002", "Carlos Barrientos", 250);
        Gas gas = new Gas("G-003", "Carlos Barrientos", 12);

        agua.emitirRecibo();
        luz.emitirRecibo();
        gas.emitirRecibo();

        // ServicioPublico sp = new ServicioPublico("X-000", "Prueba", 10);
        // ERROR: ServicioPublico is abstract; cannot be instantiated
    }
}
