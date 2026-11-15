package ejercicios;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche c = new Coche("Renault", "Logan", 180);
        System.out.println(c.getMarca() + " " + c.getModelo() + " - velocidad maxima: " + c.getVelocidadMaxima());
        c.acelerar(20);
        System.out.println("Despues de acelerar 20: " + c.getVelocidadMaxima());
        c.acelerar(-50); // no se aplica
        System.out.println("Despues de acelerar -50: " + c.getVelocidadMaxima());
        // Los intentos de acceso directo (c.marca, c.velocidadMaxima) estan en
        // errores_intencionales/ErrorCoche.java porque NO compilan.
    }
}
