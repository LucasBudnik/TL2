package unlp.info.modelo;
import java.util.*;

public class CompararPorSueldo implements Comparator<Empleado> {
	
	public int compare(Empleado a, Empleado b) {
		return a.getSueldo().compareTo(b.getSueldo());
	}
	
}
