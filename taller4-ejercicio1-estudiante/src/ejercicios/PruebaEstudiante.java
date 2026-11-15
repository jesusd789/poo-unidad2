package ejercicios;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Ana Gomez", 20, 4.2);
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Nota promedio: " + e.getNotaPromedio());

        System.out.println("\n--- Probando validaciones de los set ---");
        e.setEdad(-3);          // invalido
        e.setNotaPromedio(7.5); // invalido
        e.setNombre("   ");     // invalido
        e.setNotaPromedio(3.8); // valido
        System.out.println("Nota promedio final: " + e.getNotaPromedio());
    }
}
