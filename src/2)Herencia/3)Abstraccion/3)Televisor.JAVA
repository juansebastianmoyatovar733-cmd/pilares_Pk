public class Televisor extends Electrodomestico {
    public Televisor(String marca) {
        super(marca);
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println("Mostrando el canal en pantalla...");
        } else {
            System.out.println("Enciendalo primero.");
        }
    }
}
