public class Enfermero extends PersonalIPS {
    private String turno;

    public Enfermero(String documento, String nombre, double salarioBase, String turno) {
        super(documento, nombre, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularSalarioMensual() {
        if (turno.equalsIgnoreCase("noche")) {
            return salarioBase + 200000;
        }
        return salarioBase;
    }
}
