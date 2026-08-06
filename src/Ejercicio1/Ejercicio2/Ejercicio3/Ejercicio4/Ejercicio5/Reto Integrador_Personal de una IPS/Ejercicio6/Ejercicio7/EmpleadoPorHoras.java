public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String documento, int horas, double tarifa) {
        super(nombre, documento);
        this.horasTrabajadas = horas;
        this.tarifaPorHora = tarifa;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}
