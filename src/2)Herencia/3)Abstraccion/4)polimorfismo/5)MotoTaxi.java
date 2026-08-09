public class MotoTaxi extends Vehiculo {
    public MotoTaxi(String placa) {
        super(placa);
    }

    @Override
    public void mover() {
        System.out.println("MotoTaxi " + placa + " se desliza agil entre el trafico.");
    }

    public void recogerPasajero() {
        System.out.println("MotoTaxi " + placa + ": pasajero recogido.");
    }
}
