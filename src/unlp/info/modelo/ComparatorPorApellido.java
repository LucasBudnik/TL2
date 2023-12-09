package unlp.info.modelo;

import java.util.Comparator;

public class ComparatorPorApellido implements Comparator<Empleado> {

	public int compare(Empleado e1, Empleado e2) {

		return e1.getApellido().compareTo(e2.getApellido());

	}
}
