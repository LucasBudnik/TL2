package unlp.info.modelo.comparators;

import java.util.Comparator;

import unlp.info.modelo.Empleado;

public class CompararPorApellido implements Comparator<Empleado>{
	public int compare(Empleado a, Empleado b) {
		return a.getApellido().compareTo(b.getApellido());
	}

}
