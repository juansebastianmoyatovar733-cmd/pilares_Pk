public class MainPlataforma {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Carlos Vega", "carlos@sena.edu.co", 5);
        Instructor i = new Instructor("Marta Soto", "marta@sena.edu.co", "Java");
        Administrador ad = new Administrador("Laura Diaz", "laura@sena.edu.co", "TOTAL");

        e.iniciarSesion();
        System.out.println("---");
        i.iniciarSesion();
        System.out.println("---");
        ad.iniciarSesion();
    }
}
