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

    // Getters - solo lectura desde el exterior
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

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

    // ===== RETO DE ANDAMIAJE =====
    // Transfiere dinero de esta cuenta a una cuenta destino.
    // Validaciones:
    //  - la cantidad debe ser positiva
    //  - debe haber saldo suficiente en esta cuenta
    //  - la cuenta destino no puede ser null ni la misma cuenta origen
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
        // Reutilizamos retirar() y depositar(): así las validaciones
        // no se duplican y las reglas siguen viviendo en un solo lugar.
        this.retirar(cantidad);
        destino.depositar(cantidad);
        System.out.println("Transferencia de $" + cantidad + " realizada de "
                + this.numeroCuenta + " a " + destino.numeroCuenta);
    }
}
