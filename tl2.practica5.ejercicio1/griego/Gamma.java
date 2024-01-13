package griego;

class Gamma {
	/*
	 * Invocamos a alpha desde una clase gamma la cual 
	 * tiene a x como protected la cual provee acceso package
	 * y provee acceso a las subclases
	 */
	void unMétodoG() {
		Alpha a = new Alpha();
		a.x = 10;
		a.otroMetodoA();
	}
}