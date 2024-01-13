package unlp.info.modelo.comparators;

import java.util.Comparator;

import unlp.info.modelo.Emp;

public class CompararPorNombre implements Comparator<Emp>{
	public int compare(Emp a, Emp b) {
		return a.getNombre().compareTo(b.getNombre());
	}

}
