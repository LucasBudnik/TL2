package unlp.info.modelo.comparators;
import java.util.*;

import unlp.info.modelo.Empleado;

public class CompararPorSueldo implements Comparator<Empleado> {
	
	public int compare(Empleado a, Empleado b) {
		return a.getSueldo().compareTo(b.getSueldo());
	}
	
}
