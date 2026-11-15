package ejemplos;

// Clase con nivel de acceso de paquete (default): sin 'public'.
// USO INCORRECTO SIN ERROR DE COMPILACION: atributos expuestos sin get/set.
class Producto {
    String nombre; // Atributo de paquete (default)
    double precio; // Atributo de paquete (default)

    Producto(String nombre, double precio) { // Constructor de paquete
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInfo() { // Metodo de paquete
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
}
