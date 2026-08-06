public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // Usamos el setter para validar
        setStock(stock);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setPrecio(double precio) {
        if (precio >= 0) this.precio = precio;
        else System.out.println("Precio invalido.");
    }

    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else System.out.println("Stock invalido.");
    }

    public void vender(int unidades) {
        if (unidades <= 0) {
            System.out.println("Cantidad invalida.");
        } else if (unidades > stock) {
            System.out.println("Sin stock suficiente. Disponible: " + stock);
        } else {
            stock -= unidades;
            System.out.println("Venta realizada: " + unidades + " unidades.");
        }
    }

    public void reabastecer(int unidades) {
        if (unidades > 0) {
            stock += unidades;
            System.out.println("Stock actualizado. Nuevo stock: " + stock);
        }
    }

    // ===== RETO DE ANDAMIAJE =====
    // Reduce el precio en el porcentaje indicado. Rechaza valores fuera de 0-100.
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje invalido. Debe estar entre 0 y 100.");
            return;
        }
        double descuento = precio * (porcentaje / 100.0);
        precio -= descuento;
        System.out.println("Descuento del " + porcentaje + "% aplicado. Nuevo precio: $" + precio);
    }

    // Devuelve true si hay unidades disponibles en stock.
    public boolean hayStock() {
        return stock > 0;
    }
}
