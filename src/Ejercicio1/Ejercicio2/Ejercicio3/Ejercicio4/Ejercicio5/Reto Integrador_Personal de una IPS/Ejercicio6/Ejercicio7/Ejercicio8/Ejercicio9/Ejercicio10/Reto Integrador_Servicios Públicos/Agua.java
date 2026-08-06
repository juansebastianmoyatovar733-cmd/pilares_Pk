public class Agua extends ServicioPublico {
    private static final double TARIFA_M3 = 3500;
    private static final double CARGO_FIJO = 8000;

    public Agua(String numeroContrato, String titular, double consumoM3) {
        super(numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura() {
        return CARGO_FIJO + (consumo * TARIFA_M3);
    }
}
