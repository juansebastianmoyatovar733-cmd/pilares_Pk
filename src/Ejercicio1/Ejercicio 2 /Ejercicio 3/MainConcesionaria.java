public class MainConcesionaria {
    public static void main(String[] args) {
        Carro c = new Carro("Chevrolet", "Spark", 45000000, 4);
        Moto m = new Moto("Yamaha", "FZ", 12000000, 250);
        Camioneta cam = new Camioneta("Toyota", "Hilux", 130000000, 1000);

        c.describir();
        System.out.println("---");
        m.describir();
        System.out.println("---");
        cam.describir();
    }
}
