package ejercicio3;

// Mismo paquete que Persona: edad (default) se puede usar, nombre (private) NO.
// Compilar con: javac -cp out -d /tmp/x ErrorPersona.java
public class ErrorPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 30);
        System.out.println(p.edad);    // OK
        System.out.println(p.nombre);  // ERROR: nombre tiene acceso privado
    }
}
