public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 8, 3);

        c.describir();
        r.describir();
        t.describir();
    }
}
