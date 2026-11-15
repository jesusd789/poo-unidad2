package prueba;

import vehiculos.Vehiculo;
import vehiculos.Moto;

// Paquete DISTINTO a 'vehiculos': los miembros default no son accesibles.
// Compilar con: javac -cp out -d /tmp/x PruebaVehiculos.java
public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Carro");   // ERROR: constructor no es publico
        System.out.println(v.tipo);           // ERROR: tipo no es publico
        v.mostrarTipo();                      // ERROR: metodo no es publico
        Moto m = new Moto("Moto", 200);       // ERROR: constructor no es publico
        System.out.println(m.cilindrada);     // ERROR: cilindrada no es publica
    }
}
