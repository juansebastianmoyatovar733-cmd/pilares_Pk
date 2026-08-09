public class PagoEfectivo extends MedioPago {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        int codigo = (int) (Math.random() * 100000);
        System.out.println("Genere el codigo de recaudo: " + codigo);
        System.out.println("Acerquese a Efecty a pagar $" + monto);
    }
}
