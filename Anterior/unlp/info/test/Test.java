package unlp.info.test;

import unlp.info.animal.PerroPeligroso;
//import unlp.info.animalespeligrosos.AnimalPeligroso;
//import unlp.info.domestico.PerroDomestico;

public class Test {
	/*
	 * Establecemos una solucion, en la cual el perro directamente es del tipo
	 * PerroPeligroso, el cual implementa todo. El otro metodo seria eliminando las
	 * funcionalidades que el perro no tiene permitidas en cada caso: en el caso del
	 * perro gordo eliminar que muerda y en el caso de rita, eliminar que ladre y
	 * que mueva la cola
	 */
	public static void main(String[] args) {
		PerroPeligroso gordo = new PerroPeligroso();
		gordo.ladra();
		gordo.mueveCola();
		gordo.muerde();
		PerroPeligroso rita = new PerroPeligroso();
		rita.muerde();
		rita.ladra();
		rita.mueveCola();

	}

}
