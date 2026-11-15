package banco;

/**
 * EJERCICIO 3 - SOLUCION: saldo private + metodos publicos con validaciones.
 * Las subclases usan depositar/retirar/getSaldo y no pueden romper la regla.
 */
public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
