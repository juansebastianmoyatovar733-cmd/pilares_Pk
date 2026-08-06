public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");

        System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo());

        v.acelerar();
        v.acelerar();
        v.acelerar();
        v.frenar();

        System.out.println("Velocidad final: " + v.getVelocidad() + " km/h");

        // ===== Prueba del reto: kilometraje y reset =====
        System.out.println("\n--- Prueba de kilometraje ---");
        System.out.println("Kilometraje total: " + v.getKilometrajeTotal() + " km");

        v.acelerar();
        v.acelerar();
        System.out.println("Kilometraje total: " + v.getKilometrajeTotal() + " km");

        v.reset();
        System.out.println("Velocidad tras reset: " + v.getVelocidad() + " km/h");
    }
}
