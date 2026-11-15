// ERROR DE COMPILACION esperado (Ejercicio 2, punto 3)
// Se compila con: javac -cp out ErrorCoche.java
import ejercicios.Coche;

public class ErrorCoche {
    public static void main(String[] args) {
        Coche c = new Coche("Renault", "Logan", 180);
        System.out.println(c.marca);            // Error: marca es private
        System.out.println(c.modelo);           // Error: modelo es private
        c.velocidadMaxima = 500;                // Error: velocidadMaxima es private
    }
}
