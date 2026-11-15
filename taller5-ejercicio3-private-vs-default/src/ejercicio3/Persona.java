package ejercicio3;

public class Persona {
    private String nombre; // solo visible dentro de Persona
    int edad;              // visible en todo el paquete ejercicio3

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
