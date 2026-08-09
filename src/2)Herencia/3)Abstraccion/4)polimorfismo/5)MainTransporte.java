public class MainTransporte {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Bus("BUS-001"),
            new Taxi("TAX-555"),
            new Bicicleta("BIC-777"),
            new Bus("BUS-002"),
            new MotoTaxi("MOT-111"),
            new MotoTaxi("MOT-222")
        };

        for (Vehiculo v : flota) {
            v.mover();

            if (v instanceof Bus) {
                Bus b = (Bus) v;
                b.abrirPuertas();
            }

            if (v instanceof MotoTaxi) {
                MotoTaxi m = (MotoTaxi) v;
                m.recogerPasajero();
            }
        }
    }
}
