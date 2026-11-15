package motos;

import transporte.Vehiculo;

// Subclase en OTRO paquete: accede a los protected por herencia.
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarMoto() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + " cc");
    }
}
