package unlp.info.modelo;

import java.util.*;

public class TestCompareTo {

	public static void main(String[] args) {
		System.out.println("CREAMOS Y CARGAMOS LA LISTA");
		List<Per> personas = new ArrayList<Per>();
		personas.add(new Per("Lucas", "zamora", 24));
		personas.add(new Per("juan", "Alvarez", 18));
		personas.add(new Per("lorenzo", "Roman", 20));
		System.out.println("MOSTRAMOS EL ORDEN ORIGINAL DE LA LISTA");
		mostrarPersonas(personas);
		System.out.println("-------------------");
		System.out.println("REALIZAMOS UN CAMBIO DE ORDEN DE LA LISTA");
		Collections.sort(personas);
		System.out.println("MOSTRAMOS SU ORDEN RESULTANTE");
		mostrarPersonas(personas);
	}

	public static void mostrarPersonas(List<Per> personas) {
		for (Per p : personas) {
			System.out.println(p.toString());
		}
	}

}
