package unlp.info.modelo;

import java.util.Comparator;

public class ComparatorPorNombre implements Comparator<Empleado> {

	public int compare(Empleado e1, Empleado e2) {

		return e1.getNombre().compareTo(e2.getNombre());

	}

}
