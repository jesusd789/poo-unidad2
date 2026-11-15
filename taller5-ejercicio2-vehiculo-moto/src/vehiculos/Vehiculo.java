package vehiculos;

// La clase es public, pero sus miembros son de paquete (default).
public class Vehiculo {
    String tipo; // acceso de paquete

    Vehiculo(String tipo) { // constructor de paquete
        this.tipo = tipo;
    }

    void mostrarTipo() { // metodo de paquete
        System.out.println("Tipo: " + tipo);
    }
}
