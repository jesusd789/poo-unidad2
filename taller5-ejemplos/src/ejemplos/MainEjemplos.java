package ejemplos;

// Esta clase esta en el MISMO paquete, por eso puede usar todo lo 'default'.
public class MainEjemplos {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo correcto 1: Empleado ===");
        Empleado e = new Empleado("Laura", 3500000);
        e.mostrarInformacion();
        e.salario = 4000000; // acceso directo permitido dentro del paquete
        e.mostrarInformacion();

        System.out.println("\n=== Ejemplo incorrecto 2 (compila, pero mala practica) ===");
        Producto p = new Producto("Cuaderno", 5000);
        p.precio = -100; // nadie valida: el encapsulamiento se compromete
        p.mostrarInfo();
    }
}
