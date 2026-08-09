public class MainAgencia {
    public static void main(String[] args) {
        Reserva[] carrito = {
            new ReservaVuelo("Ana", false, 400),
            new ReservaVuelo("Luis", true, 3800),
            new ReservaHotel("Sofia", 3, 180000),
            new ReservaBusIntermunicipal("Carlos", "Cucuta", "Bucaramanga", 45000),
            new ReservaHotel("Marta", 5, 220000),
            new ReservaBusIntermunicipal("Pedro", "Cucuta", "Bogota", 120000)
        };

        double totalCarrito = 0;

        for (Reserva r : carrito) {
            double precio = r.calcularPrecio();
            System.out.println(r.getCliente() + " - $" + precio);

            if (r instanceof ReservaVuelo) {
                ReservaVuelo vuelo = (ReservaVuelo) r;
                if (vuelo.esInternacional()) {
                    System.out.println("   -> Vuelo internacional");
                } else {
                    System.out.println("   -> Vuelo nacional");
                }
            }

            totalCarrito += precio;
        }

        System.out.println("TOTAL DEL CARRITO: $" + totalCarrito);
    }
}
