package ejemplos;

public class MainEjemplos {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo de encapsulamiento: CuentaBancaria ===");
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        cuenta.depositar(-200); // se ignora por la validacion
        System.out.println("Saldo: " + cuenta.getSaldo()); // 1500.0

        System.out.println("\n=== Ejemplo correcto 1: Persona ===");
        Persona persona = new Persona("Juan", 25);
        persona.setEdad(-5); // se ignora, edad invalida
        persona.setNombre("Juan Perez");
        System.out.println(persona.getNombre() + ", " + persona.getEdad() + " anios");

        System.out.println("\n=== Ejemplo correcto 2: Vehiculo ===");
        Vehiculo auto = new Vehiculo("Mazda", 60);
        auto.acelerar(30);
        auto.acelerar(-10); // se ignora
        System.out.println(auto.getMarca() + " va a " + auto.getVelocidad() + " km/h");

        System.out.println("\n=== Ejemplo incorrecto 2 (compila, pero es mala practica) ===");
        Producto producto = new Producto(100);
        producto.actualizarPrecio(-999); // compila y deja un precio absurdo
        System.out.println("Precio del producto: " + producto.getPrecio());
    }
}
