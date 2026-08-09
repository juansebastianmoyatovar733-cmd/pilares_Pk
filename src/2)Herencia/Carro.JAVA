public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.numeroPuertas = puertas;
    }

    @Override
    public void describir() {
        super.describir(); // Reutiliza el metodo del padre
        System.out.println("Tipo: Carro - " + numeroPuertas + " puertas");
    }
}
