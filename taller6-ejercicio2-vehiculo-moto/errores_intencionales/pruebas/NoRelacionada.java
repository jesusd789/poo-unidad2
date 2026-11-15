package pruebas;

import transporte.Vehiculo;
import motos.Moto;

// Clase NO relacionada (ni mismo paquete ni subclase).
// Compilar con: javac -cp out -d /tmp/x NoRelacionada.java
public class NoRelacionada {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Carro", "Mazda");
        System.out.println(v.tipo);   // ERROR: tipo tiene acceso protegido
        System.out.println(v.marca);  // ERROR: marca tiene acceso protegido
        Moto m = new Moto("Moto", "Yamaha", 600);
        System.out.println(m.marca);  // ERROR: marca tiene acceso protegido
    }
}
