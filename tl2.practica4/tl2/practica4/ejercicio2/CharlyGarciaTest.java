package tl2.practica4.ejercicio2;

public class CharlyGarciaTest {

	public static void main(String[] args) {
		CharlyGarcia singleton1 = CharlyGarcia.getInstance();
		CharlyGarcia singleton2 = CharlyGarcia.getInstance();

		System.out.println("Ambas instancias son iguales ? " + (singleton1 == singleton2));

		System.out.println("APP EOF");
	}

}
