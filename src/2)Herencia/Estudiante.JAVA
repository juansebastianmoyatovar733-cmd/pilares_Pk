public class Estudiante extends Usuario {
    private int cursosInscritos;

    public Estudiante(String nombre, String correo, int cursos) {
        super(nombre, correo);
        this.cursosInscritos = cursos;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion(); // Saludo del padre
        System.out.println("Tienes " + cursosInscritos +
                " cursos disponibles para estudiar.");
    }
}
