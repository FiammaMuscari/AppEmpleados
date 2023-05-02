public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "Nombre= '" + getNombre() + '\'' +
                ", Salario= " + getSalario() +
                ", Lenguaje= '" + lenguaje + '\'' +
                '}';
    }
}