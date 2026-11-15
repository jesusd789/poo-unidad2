package vehiculos;

// Mismo paquete que Vehiculo: puede heredar y usar sus miembros default.
public class Moto extends Vehiculo {
    int cilindrada; // acceso de paquete

    Moto(String tipo, int cilindrada) {
        super(tipo);
        this.cilindrada = cilindrada;
    }

    void mostrarMoto() {
        mostrarTipo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
