public class MainIPS {
    public static void main(String[] args) {
        Medico dr = new Medico("111", "Dra. Sofia Rojas", 4000000, "Pediatria", 20);
        Enfermero enf = new Enfermero("222", "Julian Perez", 1800000, "noche");
        Administrativo adm = new Administrativo("333", "Camila Ortiz", 1600000, "facturacion");

        dr.registrarAsistencia();
        dr.mostrarInfo();
        System.out.println("---");

        enf.registrarAsistencia();
        enf.mostrarInfo();
        System.out.println("---");

        adm.registrarAsistencia();
        adm.mostrarInfo();
    }
}
