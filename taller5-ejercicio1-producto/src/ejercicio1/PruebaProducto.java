package ejercicio1;

// Clase de prueba en el mismo paquete: puede acceder a los miembros default.
public class PruebaProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado", 85000, 12);
        p.mostrarInfo();
        System.out.println("Nombre leido directamente: " + p.nombre);
        p.stock = p.stock - 2; // acceso directo permitido
        System.out.println("Stock actualizado: " + p.stock);
        p.mostrarInfo();
    }
}
