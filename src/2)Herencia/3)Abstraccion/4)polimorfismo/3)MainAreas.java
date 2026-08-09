public class MainAreas {

    public static Figura encontrarMayorArea(Figura[] figuras) {
        Figura mayor = figuras[0];
        for (Figura f : figuras) {
            if (f.calcularArea() > mayor.calcularArea()) {
                mayor = f;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Figura[] figuras = {
            new Cuadrado(4),
            new Circulo(3),
            new Triangulo(5, 6),
            new Rectangulo(4, 7),
            new Rectangulo(2, 9)
        };

        double areaTotal = 0;
        for (Figura f : figuras) {
            double area = f.calcularArea();
            System.out.println("Area parcial: " + area);
            areaTotal += area;
        }
        System.out.println("AREA TOTAL: " + areaTotal);

        Figura mayor = encontrarMayorArea(figuras);
        System.out.println("La figura con mayor area tiene: " + mayor.calcularArea());
    }
}
