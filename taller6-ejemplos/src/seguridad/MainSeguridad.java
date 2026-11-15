package seguridad;

public class MainSeguridad {
    public static void main(String[] args) {
        Usuario u = new Usuario("secreto123");
        // Compila porque estamos en el mismo paquete: lectura directa de un dato sensible
        System.out.println("Contrasena leida directamente: " + u.contrasena);
    }
}
