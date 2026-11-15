package banco;

public class CuentaAhorros extends Banco {
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    // Una subclase puede romper la integridad: saldo negativo sin validar
    public void movimientoIndebido() {
        saldo = -1000000;
    }
}
