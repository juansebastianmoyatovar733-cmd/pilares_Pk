public class CuentaBancaria {

    // Atributos privados - encapsulados
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }

    // Transferencia
    public void transferir(CuentaBancaria destino, double cantidad) {

        if (destino == null) {
            System.out.println("Error: la cuenta destino no existe.");
            return;
        }

        if (destino == this) {
            System.out.println("Error: no puedes transferir a la misma cuenta.");
            return;
        }

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
            return;
        }

        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente para transferir.");
            return;
        }

        this.retirar(cantidad);
        destino.depositar(cantidad);

        System.out.println(
            "Transferencia de $" + cantidad +
            " realizada de " + this.numeroCuenta +
            " a " + destino.numeroCuenta
        );
    }

    // =========================
    // MÉTODO MAIN
    // =========================
    public static void main(String[] args) {

        CuentaBancaria cuenta1 =
            new CuentaBancaria("001", "Juan");

        CuentaBancaria cuenta2 =
            new CuentaBancaria("002", "Pedro");

        System.out.println("Cuenta 1: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        System.out.println();

        cuenta1.depositar(100000);

        System.out.println("Saldo cuenta 1: $" + cuenta1.getSaldo());

        System.out.println();

        cuenta1.transferir(cuenta2, 30000);

        System.out.println();

        System.out.println("Saldo final de Juan: $" + cuenta1.getSaldo());
        System.out.println("Saldo final de Pedro: $" + cuenta2.getSaldo());
    }
}
