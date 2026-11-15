package paquete2;

import paquete1.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // ERROR: nombre tiene acceso protegido
    }
}
