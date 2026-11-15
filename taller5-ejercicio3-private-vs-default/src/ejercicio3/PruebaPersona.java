package ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 30);
        System.out.println("edad (default, acceso directo): " + p.edad);
        p.edad = 31; // permitido: mismo paquete
        System.out.println("nombre (private, via getter): " + p.getNombre());
        p.setNombre("Carlos Andres");
        System.out.println("nombre actualizado: " + p.getNombre() + ", edad: " + p.edad);
        // p.nombre -> NO compila (private). Ver errores_intencionales/ejercicio3/ErrorPersona.java
    }
}
