package unlp.info.modelo;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Empleado>{
	public int compare(Empleado a, Empleado b) {
		return a.getNombre().compareTo(b.getNombre());
	}

}
