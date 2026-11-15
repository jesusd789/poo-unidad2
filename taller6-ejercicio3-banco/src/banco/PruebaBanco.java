package banco;

public class PruebaBanco {
    public static void main(String[] args) {
        System.out.println("=== Version INSEGURA (saldo protected) ===");
        CuentaAhorros c = new CuentaAhorros(500000);
        c.movimientoIndebido();
        System.out.println("Saldo tras movimiento indebido: " + c.getSaldo());
        Banco b = new Banco(100);
        b.saldo = -50; // mismo paquete: tambien puede modificarlo directo
        System.out.println("Saldo modificado directo desde el paquete: " + b.getSaldo());

        System.out.println("\n=== Version SEGURA (saldo private) ===");
        BancoSeguro s = new BancoSeguro(500000);
        s.depositar(100000);
        System.out.println("Retiro de 2.000.000 permitido? " + s.retirar(2000000));
        System.out.println("Retiro de 50.000 permitido? " + s.retirar(50000));
        System.out.println("Saldo final: " + s.getSaldo());
    }
}
