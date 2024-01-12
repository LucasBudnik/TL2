package unlp.info.modelo;

import java.util.*;

public class TestCompareTo {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Lucas", "zamora", 24));
		personas.add(new Persona("juan", "Alvarez", 18));
		personas.add(new Persona("lorenzo", "Roman", 20));
		mostrarPersonas(personas);
		System.out.println("-------------------");
		Collections.sort(personas);
		mostrarPersonas(personas);
	}

	public static void mostrarPersonas(List<Persona> personas) {
		for (Persona p : personas) {
			System.out.println(p.toString());
		}
	}

}
