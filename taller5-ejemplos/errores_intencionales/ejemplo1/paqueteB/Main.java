package paqueteB;

import paqueteA.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Toyota"); // ERROR: Vehiculo no es visible
    }
}
