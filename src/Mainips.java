public class MainIPS {
    public static void main(String[] args) {
        // 1. Crear un paciente
        Paciente paciente = new Paciente("1098765432", "Maria Fernanda Rojas");
        paciente.setEdad(34);
        paciente.setTipoSangre("O+");

        System.out.println("--- Registro de paciente ---");
        paciente.mostrarInformacionPublica();

        // Registrar diagnostico inicial (requiere clave correcta)
        paciente.actualizarDiagnostico("MED-2026", "Hipertension arterial controlada");

        // 2. Intentar consultar el diagnostico con clave incorrecta
        System.out.println("\n--- Consulta con clave incorrecta ---");
        String resultadoIncorrecto = paciente.consultarDiagnostico("clave-falsa");
        System.out.println("Resultado: " + resultadoIncorrecto);

        // 3. Consultar con la clave correcta
        System.out.println("\n--- Consulta con clave correcta ---");
        String diagnostico = paciente.consultarDiagnostico("MED-2026");
        System.out.println("Diagnostico: " + diagnostico);

        // 4. Agregar 2 alergias
        System.out.println("\n--- Registro de alergias ---");
        paciente.agregarAlergia("Penicilina");
        paciente.agregarAlergia("Polen");

        // 5. Mostrar toda la informacion publica del paciente
        System.out.println("\n--- Informacion final del paciente ---");
        paciente.mostrarInformacionPublica();
    }
}
