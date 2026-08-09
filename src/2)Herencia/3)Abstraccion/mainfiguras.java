public class MainFiguras {
    public static void main(String[] args) {
        // Figura f = new Figura("X");  // ERROR: no se puede instanciar una clase abstracta

        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4, 6);
        Rectangulo r = new Rectangulo(8, 3);
        Cuadrado q = new Cuadrado(4);

        c.mostrar();
        System.out.println("---");
        t.mostrar();
        System.out.println("---");
        r.mostrar();
        System.out.println("---");
        q.mostrar();
    }
}
