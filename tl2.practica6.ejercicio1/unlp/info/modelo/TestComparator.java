package unlp.info.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import unlp.info.modelo.comparators.CompararPorApellido;
import unlp.info.modelo.comparators.CompararPorNombre;
import unlp.info.modelo.comparators.CompararPorSueldo;
public class TestComparator {

	public static void main(String[] args) {
		List<Emp> empleados = new ArrayList<Emp>();
		empleados.add(new Emp("Lucas", "Zamora", 24, 0, 100.0));
		empleados.add(new Emp("Juan", "Alvarez", 18, 1, 50.2));
		empleados.add(new Emp("Arturo", "Roman", 20, 8, 300.3));
		
		mostrarEmpleados(empleados);
		System.out.println("------------------- Nombre");
		Collections.sort(empleados,new CompararPorNombre());
		mostrarEmpleados(empleados);
		System.out.println("------------------- Apellido");
		Collections.sort(empleados,new CompararPorApellido());
		mostrarEmpleados(empleados);
		System.out.println("------------------- Sueldo");
		Collections.sort(empleados,new CompararPorSueldo());
		mostrarEmpleados(empleados);
	}

	public static void mostrarEmpleados(List<Emp> empleados) {
		for (Emp e : empleados) {
			System.out.println(e.toString());
		}
	}

}
