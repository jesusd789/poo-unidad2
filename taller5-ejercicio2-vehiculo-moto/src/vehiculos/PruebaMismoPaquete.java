package vehiculos;

// Dentro del paquete 'vehiculos' TODO funciona.
public class PruebaMismoPaquete {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Carro");
        v.mostrarTipo();
        Moto m = new Moto("Moto deportiva", 600);
        m.mostrarMoto();
    }
}
