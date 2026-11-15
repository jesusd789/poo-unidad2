package banco;

/**
 * EJERCICIO 3 - Version INSEGURA: saldo es protected.
 * Cualquier subclase (incluso en otro paquete) o clase del mismo paquete
 * puede modificar el saldo sin ninguna validacion.
 */
public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
}
