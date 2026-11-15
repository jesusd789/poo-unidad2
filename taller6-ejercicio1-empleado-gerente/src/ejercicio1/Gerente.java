package ejercicio1;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        // nombre y salario son protected: la subclase los usa directamente
        System.out.println("Gerente: " + nombre + " | Salario: " + salario
                + " | Departamento: " + departamento);
    }
}
