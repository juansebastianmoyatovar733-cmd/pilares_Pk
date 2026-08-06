public class MainTienda {
    public static void main(String[] args) {
        TarjetaCredito t = new TarjetaCredito(250000, "4111-2222-3333-4444");
        PagoEfectivo e = new PagoEfectivo(80000);
        PagoPSE p = new PagoPSE(120000, "Bancolombia");

        t.mostrarMonto();
        t.procesarPago();
        System.out.println("---");

        e.mostrarMonto();
        e.procesarPago();
        System.out.println("---");

        p.mostrarMonto();
        p.procesarPago();
    }
}
