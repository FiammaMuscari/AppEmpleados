import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int indice) {
        if (indice >= 0 && indice < empleados.size()) {
            empleados.remove(indice);
            System.out.println("Empleado eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el empleado. Indice inválido.");
        }
    }
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
    
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        try (Scanner sc = new Scanner(System.in)) {
			while (true) {
			    System.out.println("MENU");
			    System.out.println("1. Agregar empleado");
			    System.out.println("2. Eliminar empleado");
			    System.out.println("3. Mostrar empleados");
			    System.out.println("4. Salir");

			    int opcion = sc.nextInt();
			    sc.nextLine(); 

			    switch (opcion) {
			        case 1:
			            System.out.println("Ingrese el nombre del empleado:");
			            String nombre = sc.nextLine();

			            System.out.println("Ingrese el salario del empleado:");
			            double salario = sc.nextDouble();
			            sc.nextLine(); 

			            System.out.println("Ingrese el tipo de empleado:");
			            System.out.println("1. Desarrollador");
			            System.out.println("2. Recursos Humanos");
			            System.out.println("3. Finanzas");
			            int tipoEmpleado = sc.nextInt();
			            sc.nextLine(); 

			            switch (tipoEmpleado) {
			                case 1:
			                    System.out.println("Ingrese el lenguaje del desarrollador:");
			                    String lenguaje = sc.nextLine();
			                    empresa.agregarEmpleado(new Desarrollador(nombre, salario, lenguaje));
			                    break;
			                case 2:
			                    System.out.println("Ingrese el área de recursos humanos:");
			                    String area = sc.nextLine();
			                    empresa.agregarEmpleado(new RecursosHumanos(nombre, salario, area));
			                    break;
			                case 3:
			                    System.out.println("Ingrese la especialidad de finanzas:");
			                    String especialidad = sc.nextLine();
			                    empresa.agregarEmpleado(new Finanzas(nombre, salario, especialidad));
			                    break;
			                default:
			                    System.out.println("Opción no válida");
			                    break;
			            }
			            break;
			        case 2:
			            System.out.println("Ingrese el índice del empleado a eliminar:");
			            int indice = sc.nextInt();
			            empresa.eliminarEmpleado(indice);
			            break;
			        case 3:
			        	if (empresa.empleados.isEmpty()) {
			                System.out.println("No hay empleados.");
			            } else {
			                empresa.mostrarEmpleados();
			            }
			            break;
			        case 4:
			            System.out.println("¡Saludos!");
			            return;
			        default:
			            System.out.println("Opción no válida.");
			            break;
			    }
			}
		}
    }
}