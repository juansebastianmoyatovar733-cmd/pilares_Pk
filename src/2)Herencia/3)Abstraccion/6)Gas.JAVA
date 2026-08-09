public class Gas extends ServicioPublico {
    private static final double TARIFA_M3 = 2100;
    private static final double CARGO_FIJO = 5000;

    public Gas(String numeroContrato, String titular, double consumoM3) {
        super(numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura() {
        return CARGO_FIJO + (consumo * TARIFA_M3);
    }
}
