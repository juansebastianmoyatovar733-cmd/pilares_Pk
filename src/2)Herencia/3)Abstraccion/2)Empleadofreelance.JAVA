public class EmpleadoFreelance extends Empleado {
    private int proyectosTerminados;
    private double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String documento,
                              int proyectosTerminados, double pagoPorProyecto) {
        super(nombre, documento);
        this.proyectosTerminados = proyectosTerminados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularPago() {
        return proyectosTerminados * pagoPorProyecto;
    }
}

