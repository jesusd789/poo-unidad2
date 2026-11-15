package ejemplos;

/**
 * USO INCORRECTO SIN ERROR DE COMPILACION (mala practica):
 * 'precio' es private, pero actualizarPrecio no valida nada,
 * asi que se puede dejar el producto con precio negativo.
 */
public class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // No se realiza ninguna validacion aqui (MALA PRACTICA)
        precio = nuevoPrecio;
    }
}
