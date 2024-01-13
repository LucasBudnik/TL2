package unlp.info.modelo.comparators;

import java.util.Comparator;

import unlp.info.modelo.Empleado;

public class CompararPorNombre implements Comparator<Empleado>{
	public int compare(Empleado a, Empleado b) {
		return a.getNombre().compareTo(b.getNombre());
	}

}
