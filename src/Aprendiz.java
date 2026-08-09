public class Aprendiz {
    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;
    private String correoInstitucional;

    public Aprendiz(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;
        this.notaFinal = 0.0;
        this.correoInstitucional = "";
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 100.");
        }
    }

    public void setNotaFinal(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaFinal = nota;
        } else {
            System.out.println("Nota invalida. Debe estar entre 0.0 y 5.0.");
        }
    }

    public boolean aprobo() {
        return notaFinal >= 3.5;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correoInstitucional = correo;
            System.out.println("Correo asignado correctamente.");
        } else {
            System.out.println("Correo invalido: debe contener '@'.");
        }
    }

    // MÉTODO PRINCIPAL
    public static void main(String[] args) {

        Aprendiz aprendiz = new Aprendiz("123456789", "Juan");

        aprendiz.setEdad(21);
        aprendiz.setNotaFinal(4.2);
        aprendiz.setCorreoInstitucional("juan@institucion.edu.co");

        System.out.println("Documento: " + aprendiz.getDocumento());
        System.out.println("Nombre: " + aprendiz.getNombre());
        System.out.println("Edad: " + aprendiz.getEdad());
        System.out.println("Nota final: " + aprendiz.getNotaFinal());
        System.out.println("Correo: " + aprendiz.getCorreoInstitucional());

        if (aprendiz.aprobo()) {
            System.out.println("Estado: APROBO");
        } else {
            System.out.println("Estado: NO APROBO");
        }
    }
}
