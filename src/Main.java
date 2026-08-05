public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-2345", "Carlos Perez");

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(500000);
        cuenta.retirar(150000);
        cuenta.retirar(1000000); // Debe fallar por saldo insuficiente

        System.out.println("Saldo final: $" + cuenta.getSaldo());

        // ===== Prueba del reto: transferir() =====
        CuentaBancaria cuentaDestino = new CuentaBancaria("002-9988", "Laura Gomez");

        System.out.println("\n--- Prueba de transferencia ---");
        cuenta.transferir(cuentaDestino, 100000);       // Debe funcionar
        cuenta.transferir(cuentaDestino, -5000);         // Debe fallar (negativa)
        cuenta.transferir(cuentaDestino, 999999999);     // Debe fallar (sin saldo)

        System.out.println("Saldo cuenta origen: $" + cuenta.getSaldo());
        System.out.println("Saldo cuenta destino: $" + cuentaDestino.getSaldo());
    }
}