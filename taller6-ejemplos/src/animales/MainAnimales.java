package animales;

public class MainAnimales {
    public static void main(String[] args) {
        Animal a = new Animal("Generico");
        a.emitirSonido();
        Perro p = new Perro("Canino");
        p.emitirSonido(); // sobrescrito
    }
}
