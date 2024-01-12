package unlp.info.modelo;

import java.util.Comparator;

public class CompararPorApellido implements Comparator<Empleado>{
	public int compare(Empleado a, Empleado b) {
		return a.getApellido().compareTo(b.getApellido());
	}

}
