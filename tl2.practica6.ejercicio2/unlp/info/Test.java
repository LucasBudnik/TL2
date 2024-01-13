package unlp.info;
import unlp.info.animalespeligrosos.*;
import unlp.info.domestico.*;
import unlp.info.animal.*;
public class Test {
	public static void main(String [] args) {
		PerroDomestico gordo = new PerroPeligroso();
		gordo.ladra();
		gordo.mueveCola();
		//gordo.muerde();
		((AnimalPeligroso) gordo).muerde();
		AnimalPeligroso rita = new PerroPeligroso();
		rita.muerde();
		//rita.ladra();
		//rita.mueveCola();
		((PerroDomestico) rita).ladra();
		((PerroDomestico) rita).mueveCola();
	}
}
/*
 * SE REALIZA UN CASTEO EN TIEMPO DE EJECUCION.
 */