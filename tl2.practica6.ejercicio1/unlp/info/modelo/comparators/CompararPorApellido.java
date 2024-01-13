package unlp.info.modelo.comparators;

import java.util.Comparator;

import unlp.info.modelo.Emp;

public class CompararPorApellido implements Comparator<Emp>{
	public int compare(Emp a, Emp b) {
		return a.getApellido().compareTo(b.getApellido());
	}

}
