package EjerciciosAdicionales;

public class CuentaBancaria {
    private String titular;
    private double saldo;
 // Setters
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("El saldo inicial no puede ser negativo. Se establecerá a 0.");
            this.saldo = 0.0;
        }
    }
// Getters

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
            saldo -= monto;
        } else {
            System.out.println("Monto inválido o fondos insuficientes.");
        }
    }
}
