package seguridad;

/**
 * USO INCORRECTO SIN ERROR DE COMPILACION:
 * la contrasena es dato sensible y no deberia ser protected
 * (subclases y clases del mismo paquete podrian leerla o cambiarla).
 */
public class Usuario {
    protected String contrasena; // MALA PRACTICA: deberia ser private

    public Usuario(String contrasena) {
        this.contrasena = contrasena;
    }
}
