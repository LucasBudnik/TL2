package romano;

//import griego.*;

class Beta {
	/*
	 * dado que beta no se encuentra en el mismo paquete que Alphab 
	 * beta no tiene acceso al metodo declarado en alphab y a las 
	 * variables declaradas el alphab
	 */
	void unMetodoB() {
		//Alphab a = new Alphab();
		//a.x = 10;
		//a.unMetodoA();
	}
}
/*
 * para evitar el error comentamos todo podemos arreglar esto cambiando el tipo de acceso de alphab
 * a public tanto de su metodo como de su variable, dado que Beta no extende de alphab y tampoco se encuentra
 * en el mismo paquete el unico especificador de acceso que nos brinda la posibilidad de invocarlos es public
 */