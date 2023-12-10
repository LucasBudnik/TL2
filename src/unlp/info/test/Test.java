package unlp.info.test;

import unlp.info.animal.*;
import unlp.info.animalespeligrosos.*;
import unlp.info.domestico.*;

public class Test {

	public static void main(String[] args) {
		PerroDomestico gordo = new PerroPeligroso();
		gordo.ladra();
		gordo.mueveCola();
		gordo.muerde();
		AnimalPeligroso rita = new PerroPeligroso();
		rita.muerde();
		rita.ladra();
		rita.mueveCola();
	}

}
