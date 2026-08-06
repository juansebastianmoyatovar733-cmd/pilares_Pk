public class Paciente {
    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico;      // NUNCA tiene getter publico
    private String[] alergias;
    private int cantidadAlergias;    // controla cuantas posiciones del arreglo estan usadas

    private static final String CLAVE_MEDICO = "MED-2026";
    private static final String[] TIPOS_SANGRE_VALIDOS =
            {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
    private static final int MAX_ALERGIAS = 10;

    public Paciente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;
        this.tipoSangre = "";
        this.diagnostico = "Sin diagnostico registrado";
        this.alergias = new String[MAX_ALERGIAS];
        this.cantidadAlergias = 0;
    }

    // ===== Getters de datos no sensibles =====
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoSangre() { return tipoSangre; }

    // ===== Setters validados =====
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 120.");
        }
    }

    public void setTipoSangre(String tipoSangre) {
        for (String tipo : TIPOS_SANGRE_VALIDOS) {
            if (tipo.equals(tipoSangre)) {
                this.tipoSangre = tipoSangre;
                return;
            }
        }
        System.out.println("Tipo de sangre invalido. Valores permitidos: A+, A-, B+, B-, O+, O-, AB+, AB-.");
    }

    // ===== Diagnostico protegido por clave de medico =====
    // Solo devuelve el diagnostico si la clave coincide.
    public String consultarDiagnostico(String claveMedico) {
        if (esClaveValida(claveMedico)) {
            return diagnostico;
        } else {
            System.out.println("Acceso denegado: clave de medico incorrecta.");
            return null;
        }
    }

    // Solo actualiza el diagnostico si la clave coincide.
    public void actualizarDiagnostico(String claveMedico, String nuevoDiagnostico) {
        if (esClaveValida(claveMedico)) {
            this.diagnostico = nuevoDiagnostico;
            System.out.println("Diagnostico actualizado correctamente.");
        } else {
            System.out.println("Acceso denegado: no se puede actualizar el diagnostico.");
        }
    }

    // Metodo privado: la clave nunca se expone ni se imprime en logs.
    private boolean esClaveValida(String clave) {
        return clave != null && clave.equals(CLAVE_MEDICO);
    }

    // ===== Alergias =====
    public void agregarAlergia(String alergia) {
        if (alergia == null || alergia.isEmpty()) {
            System.out.println("Alergia invalida.");
            return;
        }
        if (cantidadAlergias >= MAX_ALERGIAS) {
            System.out.println("No se pueden registrar mas alergias.");
            return;
        }
        alergias[cantidadAlergias] = alergia;
        cantidadAlergias++;
        System.out.println("Alergia registrada: " + alergia);
    }

    public boolean tieneAlergias() {
        return cantidadAlergias > 0;
    }

    // Muestra la informacion publica (no sensible) del paciente.
    public void mostrarInformacionPublica() {
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de sangre: " + tipoSangre);
        System.out.println("Tiene alergias? " + (tieneAlergias() ? "Si" : "No"));
        if (tieneAlergias()) {
            System.out.print("Alergias registradas: ");
            for (int i = 0; i < cantidadAlergias; i++) {
                System.out.print(alergias[i]);
                if (i < cantidadAlergias - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}
