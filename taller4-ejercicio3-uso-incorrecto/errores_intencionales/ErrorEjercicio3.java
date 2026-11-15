// ERROR DE COMPILACION esperado (Ejercicio 3, punto 1)
class CuentaSecreta {
    private String clave = "1234";
}

public class ErrorEjercicio3 {
    public static void main(String[] args) {
        CuentaSecreta c = new CuentaSecreta();
        System.out.println(c.clave); // Error: clave tiene acceso privado
    }
}
