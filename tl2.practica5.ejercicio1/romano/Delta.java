package romano;

import griego.*;

public class Delta extends Alphac {
	/*
	 * Como vemos se nos da acceso tanto a los metodos de una variable a de Alphac como a los metodos
	 * dado que Delta extiende de esta misma y los especificadores correspondientes son protected
	 * 
	 */
	void unMetodoD(Alphac a, Delta d) {
		//a.x = 10; en este caso no compila por el tipo de acceso que estamos haciendo que no es como subclase
		// para solucionarlo una buena opcion es usar super.x = 10; de esta forma accedemos como subclase
		d.x = 10;
		//a.otroMetodoA();
		// se repite el mismo problema, en donde en vez de acceder al metodo como subclase lo estamos accediendo desde
		// otro punto de vista.
		d.otroMetodoA();
	}
}