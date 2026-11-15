package ejemplos;

// Ejemplo correcto 1: miembros con acceso de paquete
class Empleado {
    String nombre;
    double salario;

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
