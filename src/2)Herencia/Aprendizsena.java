public class AprendizSena extends Empleado {

    public AprendizSena(String nombre, String documento, double salarioBase) {
        super(nombre, documento, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Un aprendiz gana el 50% del salario base como apoyo de sostenimiento
        return salarioBase * 0.5;
    }
}
