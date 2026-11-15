package ejercicios;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Solo incrementa si el incremento es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("Incremento invalido: debe ser positivo.");
        }
    }
}
