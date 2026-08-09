public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);

        System.out.println("Circulo " + c.getColor() +
                " - Area: " + c.calcularArea());
        System.out.println("Rectangulo " + r.getColor() +
                " - Area: " + r.calcularArea());
    }
}
