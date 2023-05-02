public class Finanzas extends Empleado {
    private String especialidad;

    public Finanzas(String nombre, double salario, String especialidad) {
        super(nombre, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Finanzas{" +
                "Nombre= '" + getNombre() + '\'' +
                ", Salario= " + getSalario() +
                ", Especialidad= '" + especialidad + '\'' +
                '}';
    }
}