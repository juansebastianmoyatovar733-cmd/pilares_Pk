public class PersonalIPS {
    protected String documento;
    protected String nombre;
    protected double salarioBase;

    public PersonalIPS(String documento, String nombre, double salarioBase) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Comportamiento comun: no necesita sobrescribirse en las hijas
    public void registrarAsistencia() {
        System.out.println(nombre + " registro su asistencia hoy.");
    }

    // Sera sobrescrito por cada hija segun su forma de pago
    public double calcularSalarioMensual() {
        return salarioBase;
    }

    // Vive solo en el padre y reutiliza el polimorfismo de calcularSalarioMensual()
    public void mostrarInfo() {
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario mensual: $" + calcularSalarioMensual());
    }
}
