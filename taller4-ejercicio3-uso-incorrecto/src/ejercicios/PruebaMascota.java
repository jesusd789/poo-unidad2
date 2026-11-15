package ejercicios;

public class PruebaMascota {
    public static void main(String[] args) {
        Mascota m = new Mascota("Firulais");
        m.presentarse();
        // No hay forma de obtener el nombre ni de corregirlo desde aqui:
        // la clase no ofrece getNombre() ni setNombre().
    }
}
