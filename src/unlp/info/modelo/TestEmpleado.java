package unlp.info.modelo;

import java.util.*;

public class TestEmpleado {

	public static void main(String[] args) {
		// Creamos un arreglo de empleados

		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("Paula", "Gomez", 16, 02215, 2000));
		empleados.add(new Empleado("Ana", "Ferrer", 32, 025001, 1500));
		empleados.add(new Empleado("Maria", "Rios", 23, 026300, 2100));
		empleados.add(new Empleado("Maria", "Araoz", 54, 023500, 1000));
		System.out.println("Sin Orden");
		imprimir(empleados);
		
		Collections.sort(empleados, new ComparatorPorNombre());
		System.out.println("Ordenado Por Nombres");
		imprimir(empleados);
		
		Collections.sort(empleados, new ComparatorPorApellido());
		System.out.println("Ordenado Por Apellidos");
		imprimir(empleados);
		
		Collections.sort(empleados, new ComparatorPorSueldo());
		System.out.println("Ordenado por sueldo");
		imprimir(empleados);
	}

	private static void imprimir(List<Empleado> empleados) {
		for (Empleado e : empleados) {
			System.out.println(e.toString());
		}
		System.out.println("------------------------------");
	}

}
