package ejercicios;

/**
 * EJERCICIO 3 (parte 2): atributo private SIN get/set.
 * El codigo compila, pero desde fuera nadie puede leer ni cambiar 'nombre'.
 * Consecuencia: la clase queda poco util (no se puede consultar ni corregir
 * el dato) o el programador termina quitando private para poder usarla,
 * rompiendo la proteccion. Lo correcto: private + get/set (con validaciones).
 */
public class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Soy " + nombre);
    }
}
