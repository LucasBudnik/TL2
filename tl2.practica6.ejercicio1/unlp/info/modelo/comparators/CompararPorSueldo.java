package unlp.info.modelo.comparators;
import java.util.*;

import unlp.info.modelo.Emp;

public class CompararPorSueldo implements Comparator<Emp> {
	
	public int compare(Emp a, Emp b) {
		return (int)( a.getSueldo() - (b.getSueldo()));
	}
	
}
