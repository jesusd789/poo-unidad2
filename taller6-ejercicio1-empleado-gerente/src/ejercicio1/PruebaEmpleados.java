package ejercicio1;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado e = new Empleado("Pedro", 2500000);
        Gerente g = new Gerente("Marta", 7000000, "Ventas");
        e.mostrarInformacion();
        g.mostrarInformacion();
    }
}
