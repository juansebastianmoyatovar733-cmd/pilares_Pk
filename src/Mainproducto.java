public class MainProducto {
    public static void main(String[] args) {
        Producto p = new Producto("P-001", "Teclado Mecanico", 180000, 10);

        System.out.println("Producto: " + p.getNombre());
        System.out.println("Precio: $" + p.getPrecio());
        System.out.println("Stock: " + p.getStock());

        p.vender(3);
        p.vender(20); // Debe fallar
        p.reabastecer(5);

        System.out.println("Stock final: " + p.getStock());

        // ===== Prueba del reto: descuento y hayStock =====
        System.out.println("\n--- Prueba de descuento y stock ---");
        p.aplicarDescuento(15);       // Descuento del 15%
        p.aplicarDescuento(150);      // Invalido, fuera de rango

        System.out.println("Hay stock disponible? " + (p.hayStock() ? "Si" : "No"));

        p.vender(p.getStock()); // Vendemos todo lo que queda
        System.out.println("Hay stock disponible? " + (p.hayStock() ? "Si" : "No"));
    }
}
