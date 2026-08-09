public class Luz extends ServicioPublico {
    private static final double TARIFA_KWH = 650;
    private static final double CARGO_FIJO = 12000;

    public Luz(String numeroContrato, String titular, double consumoKwh) {
        super(numeroContrato, titular, consumoKwh);
    }

    @Override
    public double calcularFactura() {
        return CARGO_FIJO + (consumo * TARIFA_KWH);
    }
}
