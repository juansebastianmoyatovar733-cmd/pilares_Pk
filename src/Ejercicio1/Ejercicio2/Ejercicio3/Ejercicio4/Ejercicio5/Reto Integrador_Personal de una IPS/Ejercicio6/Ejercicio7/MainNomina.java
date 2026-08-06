public class MainNomina {
    public static void main(String[] args) {
        EmpleadoFijo ef = new EmpleadoFijo("Ana Rios", "1111", 2200000);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("Luis Mora", "2222", 80, 15000);
        EmpleadoFreelance efr = new EmpleadoFreelance("Sofia Diaz", "3333", 4, 350000);

        ef.mostrarRecibo();
        System.out.println("---");
        eh.mostrarRecibo();
        System.out.println("---");
        efr.mostrarRecibo();
    }
}
