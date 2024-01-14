## Ordenando objetos
## La interface java.lang.Comparable
Hemos visto que cuando creamos una clase, comúnmente se sobrescribe el método equals(Object o), para determinar si dos instancias son iguales o no. También es común, necesitar saber si una instancia es mayor o menor que otra (con respecto a alguno de sus datos) 🡺 así, poder compararlos
	Una solución es implementar la interface Comparable<T>
Si una clase implementa la interface java.lang.Comparable, hace a sus
instancias comparables. Esta interface tiene sólo un método, compareTo(..), el
cual determina cómo comparar dos instancias de una misma clase.
Implementacion: 
public interface Comparable<T> {
	public int compareTo(T o);
}
El método retorna:
=0: si los objetos o1 y o2 son iguales.
<0: si o1 es menor que o2.
>0: si o1 es mayor que o2.

/-----------------------------------------------------------------------------------------------------------/
### Ejemplos
import java.util.*;
public class Persona **implements Comparable<Persona>** {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String n,String a,int e){
		nombre=n;
		apellido=a;
		edad=e;
	}
	
	public String toString(){
		return apellido+", "+nombre;
	}
	**public int compareTo(Persona o){
		return this.edad – o.getEdad;
	}**
}
public class Test {
public static void main(String[] args){
	Persona personas[] = new Persona[3];
	personas[0]= new Persona(“Paula",“Gomez",16);
	personas[1]= new Persona(“Ana",“Rios",6);
	personas[2]=	new	Persona(“Maria",“Ferrer",55);
	personas[3]= new Persona(“Juana",“Araoz",54);
	// imprimimos la lista para ver como quedo
	for (int i=0; i<4;i++){
		System.out.println(i+”:”+personas[i]);
	}
	Arrays.sort(personas);
	// imprimimos la lista como queda despues del reordenamiento
	for (int i = 0; i<4; i++) {
		System.out.println(i+":"+personas[i]);
	}
}

/-----------------------------------------------------------------------------------------------------------/
Esto sirve si queremos ordenar por un solo criterio, la edad
Ahora si queremos ordenar por mas de un criterio. Supongamos la edad y el nombre o apellido:
/-----------------------------------------------------------------------------------------------------------/

import java.util.Comparator;
public class ComparadorNombre implements Comparator<Persona> {
	public int compare(Persona p1, Persona p2) {
		if (!(p1.getApellido().equals(p2.getApellido())))
			return p1.getApellido().compareTo(p2.getApellido());
		else
			return p1.getNombre().compareTo(p2.getNombre());
	}
}
// como vemos se repite el procedimiento de la comparacion por edad en otra //clase
import java.util.Comparator;
public class ComparadorEdad implements Comparator<Persona> {
	public int compare(Persona p1, Persona p2) {
		return p1.getEdad()-p2.getEdad();
	}
}

public class Test {
	public static void main(String[] args){
		Persona[] personas = new Persona[4];
		personas[0] = new Persona("Gomez","Paula",16);
		personas[1] = new Persona("Rios","Ana",6);
		personas[2] = new Persona("Ferrer","Maria",55);
		personas[3] = new Persona("Araoz","Maria",54);
	**Arrays.sort(personas, new ComparadorEdad());**
	for (int i = 0; i < 4; i++) {
		System.out.println("persona"+i+":"+personas[i]);
	}
	**Arrays.sort(personas, new ComparadorNombre());**
	for (int i = 0; i < 4; i++) {
		System.out.println("persona”+i+":"+personas[i]);
	}
}

/-----------------------------------------------------------------------------------------------------------/
Como vemos se destaca la diferencia entre ambas implementaciones en el momento de realizar el sort: 

En el caso de comparar solo por edad el sort directamente se escribe como:
	Arrays.sort(personas);
y el encabezado de la clase persona queda de esta forma:
public class Persona **implements Comparable<Persona>** 

En el caso de tener mas de un criterio, debemos crear clases para cada criterio, donde los encabezados quedan: 

public class ComparadorNombre implements Comparator<Persona> {
	public int compare(Persona p1, Persona p2);
}

/---------------------------------------------------------------------/

