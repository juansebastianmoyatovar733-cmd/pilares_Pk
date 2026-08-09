public abstract class ServicioPublico {
    protected String numeroContrato;
    protected String titular;
    protected double consumo;

    public ServicioPublico(String numeroContrato, String titular, double consumo) {
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.consumo = consumo;
    }

    // Metodo abstracto: cada servicio tiene su propia formula de cobro
    public abstract double calcularFactura();

    // Metodo concreto: reutilizado por Agua, Luz y Gas. Usa calcularFactura()
    // internamente sin saber como cada hija lo calcula por dentro.
    public void emitirRecibo() {
        System.out.println("===== Recibo de servicio =====");
        System.out.println("Contrato: " + numeroContrato);
        System.out.println("Titular: " + titular);
        System.out.println("Consumo: " + consumo);
        System.out.println("Total a pagar: $" + calcularFactura());
        System.out.println("===============================");
    }
}
