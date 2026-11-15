// ERROR DE COMPILACION esperado (Ejemplo incorrecto 1 del taller)
class PersonaE {
    private String nombre;

    public PersonaE(String nombre) {
        this.nombre = nombre;
    }
}

public class ErrorEjemplo1 {
    public static void main(String[] args) {
        PersonaE p = new PersonaE("Juan");
        System.out.println(p.nombre); // Error: nombre tiene acceso privado
    }
}
