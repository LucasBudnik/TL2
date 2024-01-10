package unlp.info.modelo;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Paula","Gomez",16)); 
		personas.add(new Persona("Ana","Ferrer",32));
		personas.add(new Persona("Maria","Rios",23));
		personas.add(new Persona("Maria","Araoz",54));
		
		for(Persona p: personas) {
			System.out.println(p.toString());
		}
		Collections.sort(personas, new ComparablePersona()); 
		
		for(Persona p: personas) {
			System.out.println(p.toString());
		}
		
		
		
		
		String [] animales = new String[4];
		animales[0]= "perro";
		animales[1]= "gato";
		animales[2]= "mono";
		animales[3]= "avestruz";
		
		for(int i=0;i<4;i++) {
			System.out.println(animales[i]);
		}
		Arrays.sort(animales);
		
		for(int i=0;i<4;i++) {
			System.out.println(animales[i]);
		}
		
	}

}
