public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0; // Sera sobrescrito por las hijas
    }

    public String getColor() {
        return color;
    }
}
