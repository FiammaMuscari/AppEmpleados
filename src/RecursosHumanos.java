public class RecursosHumanos extends Empleado {
    private String area;

    public RecursosHumanos(String nombre, double salario, String area) {
        super(nombre, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" +
                "Nombre= '" + getNombre() + '\'' +
                ", Salario= " + getSalario() +
                ", Area= '" + area + '\'' +
                '}';
    }
}